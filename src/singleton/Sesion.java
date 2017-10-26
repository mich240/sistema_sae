package singleton;

import java.sql.Time;
import java.util.Date;

import modelo.sesion.SesionDao;
import modelo.sesion.SesionModel;
import modelo.usuario.UsuarioModel;

public class Sesion {
	private static UsuarioModel user;
	private static boolean is_Sesion;
	private static SesionModel ses;
	private static SesionDao ssDao;
	private static Date date;
	private static Sesion Sesion = new Sesion();

	public static Sesion getSesion() {
		return Sesion;
	}

	public static boolean isSesion() {
		return is_Sesion;
	}

	public static void CrearSesion(UsuarioModel us) {
		// registro ahora la Sesion en base al usuario.
		if (user == null) {
			/// establesco los datos de la Sesion
			date = new Date();
			ses = new SesionModel();
			ssDao = new SesionDao();
			ses.setFechaInicio(new java.sql.Date(date.getTime()));
			ses.setHoraInicio(new Time(date.getTime()));
			ses.setFechaSalida(new java.sql.Date(date.getTime()));
			ses.setHoraSalida(new Time(date.getTime()));
			ses.setUsuario_id(us.getId());
			/***
			 * registro la Sesion en la db y recupero el id creado para tenerlo en la Sesion
			 */
			ses.setId(
					ssDao.SesionLoginRegistro(ses));/**
													 * guardo la clave primaria q retorna el metodo SesionLoginRegistro
													 */
			user = us;// guardo el usuario aqui para acceder a sus datos
			System.out.println("Sesión creada.");
			Auditoria.evento("inicio de sesión.");
			is_Sesion = true;// la Sesion ya existe por lo tanto es una Sesion
		} else// error si intentan volver a crear una Sesion para cambiar datos del usuario
			System.out.println("Imposible volver a crear una Sesión");
	}

	public void DestroyerSesion() {
		if (user != null) {
			Auditoria.evento("cerro sesión.");
			///establesco los datos para finalizar sesion
			date = new Date();
			ses.setFechaSalida(new java.sql.Date(date.getTime()));
			ses.setHoraSalida(new Time(date.getTime()));		
			ssDao.SesionLogOutRegistro(ses);
			user = null;//elimino al usuario y a la sesion activas
			ses = null;
			is_Sesion = false;//ya no tengo sesion
			System.out.println("Sesión terminada.");
		} else
			System.out.println("No se ha iniciado una Sesión");

	}

	public void refresh() {
		/// actualizar los datos de el usuario en Sesion por si han echo
		/// modificaciones.
	}

	public int getIdSesion() {
		return ses.getId();
	}

	public int getIdUser() {
		return user.getId();
	}

	public int getCedula() {
		return user.getCedula();
	}

	public String getNombre() {
		return user.getNombre();
	}

	public String getApellido() {
		return user.getApellido();
	}

	public String getUsuario() {
		return user.getUsuario();
	}

	public String getClave() {
		return user.getClave();
	}

	public int getPregunta() {
		return user.getPregunta();
	}

	public String getRespusta() {
		return user.getRespusta();
	}

	public int getTipoUsuario() {
		return user.getTipoUsuario();
	}

	public int getStatus() {
		return user.getStatus();
	}

	public String toString() {
		return "[ID_Sesion]=" + ses.getId() + " " + user.toString();
	}

}
