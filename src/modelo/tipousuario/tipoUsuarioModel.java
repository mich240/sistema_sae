package modelo.tipousuario;

public class tipoUsuarioModel {

	private int id;
	private String rol;

	public int getId() {
		return id;
	}

	public String getRol() {
		return rol;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	@Override
	public String toString() {
		return rol;
	}

}
