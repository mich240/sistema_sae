package modelo.transaccion;

import java.sql.Date;

public class TransaccionModel {
	private int id;
	private Date fecha;
	private int unidad_edu_id;
	private int status;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public int getUnidad_edu_id() {
		return unidad_edu_id;
	}

	public void setUnidad_edu_id(int unidad_edu_id) {
		this.unidad_edu_id = unidad_edu_id;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "TransaccionModel [id=" + id + ", fecha=" + fecha + ", unidad_edu_id=" + unidad_edu_id + ", status="
				+ status + "]";
	}

	
}
