package singleton;

import java.sql.Time;
import java.util.Date;

import modelo.auditoria.AuditoriaDao;
import modelo.auditoria.AuditoriaModel;

public class Auditoria {
	private static Date date;
	private static AuditoriaDao aud=new AuditoriaDao();
	private static AuditoriaModel audiModel=new AuditoriaModel();

	
	public static void evento(String evento) {
		date = new Date();
		audiModel.setEvento("El Usuario:" + Sesion.getSesion().getUsuario() + " " + evento);
		audiModel.setFechaEvento(new java.sql.Date(date.getTime()));
		audiModel.setHoraEvento(new Time(date.getTime()));
		audiModel.setSesionId(Sesion.getSesion().getIdSesion());
		aud.registrarEvento(audiModel);
	}

}
