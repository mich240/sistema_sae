package singleton;

import java.text.SimpleDateFormat;
import java.util.Date;

import modelo.auditoria.AuditoriaDao;
import modelo.auditoria.AuditoriaModel;

public class Auditoria {
	private static Date date;
	private static AuditoriaDao aud=new AuditoriaDao();
	private static AuditoriaModel audiModel=new AuditoriaModel();
	private static SimpleDateFormat fecha = new SimpleDateFormat("yyy-MM-dd");
	private static SimpleDateFormat hora = new SimpleDateFormat("HH:mm:ss");
	
	public static void evento(String evento) {
		date = new Date();
		audiModel.setEvento("El Usuario:" + Sesion.getSesion().getUsuario() + " " + evento);
		audiModel.setFechaEvento(fecha.format(date));
		audiModel.setHoraEvento(hora.format(date));
		audiModel.setSesionId(Sesion.getSesion().getIdSesion());
		aud.registrarEvento(audiModel);
	}

}
