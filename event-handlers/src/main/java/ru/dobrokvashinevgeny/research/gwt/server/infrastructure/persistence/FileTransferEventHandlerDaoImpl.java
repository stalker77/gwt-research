/*
 * Copyright (c) 2018 Evgeny Dobrokvashin, All Rights Reserved.
 */

package ru.dobrokvashinevgeny.research.gwt.server.infrastructure.persistence;

import ru.dobrokvashinevgeny.research.gwt.server.services.*;

import javax.naming.*;
import javax.sql.DataSource;
import java.sql.*;
import java.util.List;

/**
 * Класс FileTransferEventHandlerDao
 */
public class FileTransferEventHandlerDaoImpl implements FileTransferEventHandlerDao {
	private static final String INSERT_SQL = "insert into DestTable (id, name, value) values (?, ?, ?)";

	private final DataSource dataSource;

	public FileTransferEventHandlerDaoImpl(String jndiDataSourceName) throws DaoException {
		this.dataSource = getJndiDataSource(jndiDataSourceName);
	}

	private DataSource getJndiDataSource(String jndiDataSourceName) throws DaoException {
		try {
			Context context = new InitialContext();
			Context envContext = (Context) context.lookup("java:comp/env");
			DataSource result = (DataSource) envContext.lookup(jndiDataSourceName);
			if (result == null) {
				result = (DataSource) context.lookup("java:" + jndiDataSourceName);
			}

			return result;
		} catch (NamingException e) {
			throw new DaoException(e);
		}
	}

	@Override
	public void save(List<String> lineData) throws DaoException {
		try(Connection connection = dataSource.getConnection()) {
			connection.setAutoCommit(false);
			final PreparedStatement insertStmt = connection.prepareStatement(INSERT_SQL);
			insertStmt.setInt(1, Integer.valueOf(lineData.get(0)));
			insertStmt.setString(2, lineData.get(1));
			insertStmt.setString(3, lineData.get(2));
			insertStmt.addBatch();

			insertStmt.executeBatch();
			connection.commit();
		} catch (SQLException e) {
			throw new DaoException(e);
		}
	}
}