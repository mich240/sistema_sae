package modelo.tipousuario;

import javax.swing.DefaultComboBoxModel;

import interfaces.itemComboModel;
import modelo.abstracto.abstractCargaCombo;

public class tipoUsuarioDao extends abstractCargaCombo {

	@Override
	public DefaultComboBoxModel<Object> cargarComboBox(itemComboModel item) {
		setSqlQuery("SELECT * FROM tipo_usuario");
		return super.cargarComboBox(item);
	}

}
