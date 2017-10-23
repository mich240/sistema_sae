package modelo.pregunta;

public class Pregunta {

	private int id;
	private String pregunta;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPregunta() {
		return pregunta;
	}
	public void setPregunta(String pregunta) {
		this.pregunta = pregunta;
	}
	@Override
	public String toString() {
		return pregunta;
	}
	
	
	
}
