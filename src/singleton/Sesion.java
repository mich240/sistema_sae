package singleton;

import modelo.usuario.usuario;

public class Sesion  {
	private usuario user;
	private static Sesion sesion=new Sesion();

	
	public usuario SetUser(usuario user) {	
		if (this.user==null) {
			this.user=user;
			System.out.println("Sesión creada.");
		}else
		System.out.println("Imposible volver a crear una sesi�n");
		return user;		
	}
	
	public void refresh() {
		///actualizar los datos de el usuario en sesion por si han echo modificaciones.
	}
	
	public void DestroyerSesion() {
		this.user=null;
		System.out.println("Sesión terminada.");
	}
	
	
	public static Sesion getSesion() {
		return sesion;
	}

	
	public long getId() {
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
		return this.user.toString();		
	}
	
}
