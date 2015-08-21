package br.com.bluesoft.agenda.interfaces;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public interface Connection {
	final String url = "jdbc:postgresql://localhost:8080/bluesoft-agenda";
	final String usuario = "Pudim";
	final String senha = "123456";
	final String driver = "org.postgresql.Driver";
	Connection con = null;

	public static Connection conecta() {
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException cnfe) {
			JOptionPane.showMessageDialog(null, "não encontrado");
			System.out.println("Driver não encontrado!!");
			cnfe.printStackTrace();
		}
		try {
			con = DriverManager.getConnection(url, usuario, senha);
			System.out.println("Conexão realizada com sucesso!");
		} catch (SQLException se) {
			System.out.println("Não foi possivel conectar.");
			se.printStackTrace();
		}
		return con;
	}

	public static void closeConnection() {
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}