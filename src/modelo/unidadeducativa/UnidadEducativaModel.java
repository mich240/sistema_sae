package modelo.unidadeducativa;

public class UnidadEducativaModel {
	
	private int id;
	private String codDea;
	private int estatus;
	private int designada;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCodDea() {
		return codDea;
	}
	public void setCodDea(String codDea) {
		this.codDea = codDea;
	}
	public int getEstatus() {
		return estatus;
	}
	public void setEstatus(int estatus) {
		this.estatus = estatus;
	}
	public int getDesignada() {
		return designada;
	}
	public void setDesignada(int designada) {
		this.designada = designada;
	}
	
	@Override
	public String toString() {
		return "UnidadEducativaModel [id=" + id + ", codDea=" + codDea + ", estatus=" + estatus + ", designada="
				+ designada + "]";
	}
	
	

}
