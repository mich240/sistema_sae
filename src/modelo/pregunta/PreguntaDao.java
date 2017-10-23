package modelo.pregunta;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.DefaultComboBoxModel;

import singleton.Conexion;

public class PreguntaDao {

	public DefaultComboBoxModel<Object> cargarPreguntas() {

		DefaultComboBoxModel<Object> preg = null;
		preg = new DefaultComboBoxModel<>();
		preg.removeAllElements();
		preg.addElement("Seleccione");

		try {
			Statement st = Conexion.getInstancia().getConnection().createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM pregunta_s");

			while (rs.next()) {
				PreguntaModel it = new PreguntaModel();
				it.setId(rs.getInt(1));// creo un modelo por cada pregunta
				it.setPregunta(rs.getString(2));
				preg.addElement(it);/***
									 * agrego el modelo a los item pero el muestra el toString mediante una
									 * conversion interna. (eso es de java)
									 **/
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return preg;

	}

}
