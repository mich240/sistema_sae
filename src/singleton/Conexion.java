package singleton;

import java.sql.Connection;

import controlador.databaseController;

public class Conexion {
	private databaseController db;
	private static Conexion conex = null;

	public Conexion() {
		this.db = new databaseController();
	}

	public static Conexion getInstancia() {
		if (conex == null) {
			conex = new Conexion();
			conex.db.Conectar();
		}
		return conex;
	}

	public Connection getConnection() {
		return db.getConexion();

	}

	public static void Desconectar() {
		conex.db.Desconectar();
		conex = null;
		System.out.println("Conexion cerrada.");
	}

}
