package modelo.rubro;

public class RubroModel {
	
	private int id;
	private String descripcion;
	
	public int getId() {
		return id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	@Override
	public String toString() {
		return descripcion;
	}

	
	
	
}
