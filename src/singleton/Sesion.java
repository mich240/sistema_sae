package singleton;

import java.text.SimpleDateFormat;
import java.util.Date;
import modelo.sesion.SesionDao;
import modelo.sesion.SesionModel;
import modelo.usuario.usuario;

public class Sesion {
	private static usuario user;
	private static boolean is_Sesion;
	private static SesionModel ses;
	private static SesionDao ssDao;
	private static Date date;
	private static SimpleDateFormat fecha = new SimpleDateFormat("yyy-MM-dd");
	private static SimpleDateFormat hora = new SimpleDateFormat("HH:mm:ss");
	private static Sesion Sesion = new Sesion();

	public static Sesion getSesion() {
		return Sesion;
	}

	public static boolean isSesion() {
		return is_Sesion;
	}

	public static void CrearSesion(usuario us) {
		// registro ahora la Sesion en base al usuario.
		if (user == null) {
			/// establesco los datos de la Sesion
			date = new Date();
			ses = new SesionModel();
			ssDao = new SesionDao();
			ses.setFechaInicio(fecha.format(date));
			ses.setHoraInicio(hora.format(date));
			ses.setFechaSalida(fecha.format(date));
			ses.setHoraSalida(hora.format(date));
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
			Auditoria.evento("inicio de Sesión.");
			is_Sesion = true;// la Sesion ya existe por lo tanto es una Sesion
		} else// error si intentan volver a crear una Sesion para cambiar datos del usuario
			System.out.println("Imposible volver a crear una Sesión");
	}

	public void DestroyerSesion() {
		if (user != null) {
			Auditoria.evento("cerro Sesión.");
			///establesco los datos para finalizar sesion
			date = new Date();
			ses.setFechaSalida(fecha.format(date));
			ses.setHoraSalida(hora.format(date));		
			ssDao.SesionLogOutRegistro(ses);
			user = null;
			ses = null;
			is_Sesion = false;
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

	public String getPregunta() {
		return user.getPregunta();
	}

	public String getRespusta() {
		return user.getRespusta();
	}

	public String getTipoUsuario() {
		return user.getTipoUsuario();
	}

	public int getStatus() {
		return user.getStatus();
	}

	public String toString() {
		return "[ID_Sesion]=" + ses.getId() + " " + user.toString();
	}

}
