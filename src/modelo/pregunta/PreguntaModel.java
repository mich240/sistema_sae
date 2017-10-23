package modelo.pregunta;

import interfaces.itemComboModel;

public class PreguntaModel implements itemComboModel{

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
	////////////
	@Override
	public String getItem() {
		return getPregunta();
	}
	@Override
	public void setItem(String Item) {
		setPregunta(Item);
	}
	
	
}
