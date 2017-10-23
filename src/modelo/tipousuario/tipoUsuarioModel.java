package modelo.tipousuario;

import interfaces.itemComboModel;

public class tipoUsuarioModel implements itemComboModel {

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

	@Override
	public String getItem() {
		return getRol();
	}

	@Override
	public void setItem(String Item) {
		setRol(Item);
		
	}
	
	
}
