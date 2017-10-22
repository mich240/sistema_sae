package modelo.auditoria;

public class AuditoriaModel {

	private int id;
	private String evento;
	private String fechaEvento;
	private String horaEvento;
	private int sesionId;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEvento() {
		return evento;
	}
	public void setEvento(String evento) {
		this.evento = evento;
	}
	public String getFechaEvento() {
		return fechaEvento;
	}
	public void setFechaEvento(String fechaEvento) {
		this.fechaEvento = fechaEvento;
	}
	public String getHoraEvento() {
		return horaEvento;
	}
	public void setHoraEvento(String horaEvento) {
		this.horaEvento = horaEvento;
	}
	public int getSesionId() {
		return sesionId;
	}
	public void setSesionId(int sesionId) {
		this.sesionId = sesionId;
	}		
	
}
