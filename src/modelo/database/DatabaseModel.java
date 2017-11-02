package modelo.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseModel {

	private static Connection con = null;
	private String bd = "sae";
	private String url = "jdbc:mysql://127.0.0.1/" + bd + "?useServerPrepStmts=true";
	private String user = "root";
//   private String password="iutllado2013";
	private String password = "";

	public Connection getConexion() {
		return con;
	}

	public void Conectar() {
		if (con == null) {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				con = DriverManager.getConnection(url, user, password);
				if (con != null) {
					System.out.println("Conexion establecida a " + url + "!!!");
				}
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
		} else
			System.out.println("Ya existe una conexion.");
	}

	public void Desconectar() {
		try {
			con.close();
			con = null;
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
