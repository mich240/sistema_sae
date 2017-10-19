package singleton;

import modelo.sesion.SesionDAO;
import modelo.usuario.usuario;

public class Sesion {
	private usuario user;
	private int Id_sesion;
	private static boolean is_sesion;
	private static Sesion sesion = new Sesion();

	public static Sesion getSesion() {
		return sesion;
	}

	public static boolean isSesion() {
		return is_sesion;
	}

	public static void CrearSesion(usuario us) {
		SesionDAO ssDao = new SesionDAO();
		if (sesion.user == null) {
			sesion.user = us;
			/***registro la sesion en la db y recupero el
			 *  id creado para tenerlo en la sesion*/
			sesion.Id_sesion=ssDao.SesionLoginRegistro(us.getId());
			System.out.println("Sesión creada.");
			is_sesion = true;
		} else///error si intentan volver a crear una sesion para cambiar datos del usuario
			System.out.println("Imposible volver a crear una sesión");

	}

	public void refresh() {
		/// actualizar los datos de el usuario en sesion por si han echo
		/// modificaciones.
	}

	public void DestroyerSesion() {
		this.user = null;
		is_sesion = false;
		System.out.println("Sesión terminada.");
	}

	public int getIdSesion() {
		return this.Id_sesion;
	}

	public int getIdUser() {
		return this.user.getId();
	}

	public int getCedula() {
		return this.user.getCedula();
	}

	public String getNombre() {
		return this.user.getNombre();
	}

	public String getApellido() {
		return this.user.getApellido();
	}

	public String getUsuario() {
		return this.user.getUsuario();
	}

	public String getClave() {
		return this.user.getClave();
	}

	public String getPregunta() {
		return this.user.getPregunta();
	}

	public String getRespusta() {
		return this.user.getRespusta();
	}

	public String getTipoUsuario() {
		return this.user.getTipoUsuario();
	}

	public int getStatus() {
		return this.user.getStatus();
	}

	public String toString() {
		return "[ID_sesion]=" + this.Id_sesion + " " + this.user.toString();
	}

}
