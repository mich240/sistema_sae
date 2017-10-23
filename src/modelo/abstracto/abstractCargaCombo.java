package modelo.abstracto;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

import interfaces.cargaComboModel;
import interfaces.itemComboModel;
import singleton.Conexion;

public class abstractCargaCombo implements cargaComboModel {
	private String sqlQuery;

	public String getSqlQuery() {
		return sqlQuery;
	}

	public void setSqlQuery(String sqlQuery) {
		this.sqlQuery = sqlQuery;
	}

	@Override
	public DefaultComboBoxModel<Object> cargarComboBox(itemComboModel item) {

		DefaultComboBoxModel<Object> preg = null;
		if (getSqlQuery() != null) {
			preg = new DefaultComboBoxModel<>();
			preg.removeAllElements();
			preg.addElement("Seleccione");

			try {
				Statement st = Conexion.getInstancia().getConnection().createStatement();
				ResultSet rs = st.executeQuery(getSqlQuery());

				while (rs.next()) {
					itemComboModel it=item;
					it.setId(rs.getInt(1));// creo un modelo por cada item
					it.setItem(rs.getString(2));
					preg.addElement(it);/***
										 * agrego el modelo a los item pero el
										 * muestra el toString mediante una
										 * conversion interna. (eso es de java)
										 **/
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}
		} else
			JOptionPane.showMessageDialog(null, "Debe cargar la consulta del comboBox");
		return preg;

	}

}
