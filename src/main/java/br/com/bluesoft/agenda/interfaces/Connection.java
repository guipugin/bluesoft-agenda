package br.com.bluesoft.agenda.interfaces;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.naming.spi.DirStateFactory.Result;

public interface Connection {
	Result executeQuery(String sql);

	public static Connection getConnection() throws SQLException {
		Connection con = new Connection("jdbc:postgresql://localhost/bluesoft-agenda", "Pudim", "123456");
		return con;
	}

	public void closeConnection() {
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}