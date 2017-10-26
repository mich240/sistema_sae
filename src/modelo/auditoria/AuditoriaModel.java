package modelo.auditoria;

import java.sql.Date;
import java.sql.Time;

public class AuditoriaModel {

	private int id;
	private String evento;
	private Date fechaEvento;
	private Time horaEvento;
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
	public int getSesionId() {
		return sesionId;
	}
	public void setSesionId(int sesionId) {
		this.sesionId = sesionId;
	}
	public Date getFechaEvento() {
		return fechaEvento;
	}
	public void setFechaEvento(Date fechaEvento) {
		this.fechaEvento = fechaEvento;
	}
	public Time getHoraEvento() {
		return horaEvento;
	}
	public void setHoraEvento(Time horaEvento) {
		this.horaEvento = horaEvento;
	}		
	
	
}
