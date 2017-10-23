package modelo.pregunta;

import javax.swing.DefaultComboBoxModel;

import interfaces.itemComboModel;
import modelo.abstracto.abstractCargaCombo;

public  class  PreguntaDao extends abstractCargaCombo {

	@Override
	public DefaultComboBoxModel<Object> cargarComboBox(itemComboModel item) {
		setSqlQuery("SELECT * FROM pregunta_s");
		return super.cargarComboBox(item);
	}

}
