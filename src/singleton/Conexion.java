package singleton;

import java.sql.Connection;

import modelo.database.databaseModel;

public class Conexion {
	private databaseModel db;
	private static Conexion conex = null;

	public Conexion() {
		this.db = new databaseModel();
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
		if (conex!=null) {
		conex.db.Desconectar();
		conex = null;
		System.out.println("Conexion cerrada.");
		}else
			System.out.println("La conexion ya esta cerrada.");
	}

}
