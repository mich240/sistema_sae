package modelo.pregunta;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.DefaultComboBoxModel;

import singleton.Conexion;

public class PreguntaDao {

	public DefaultComboBoxModel<Object> cargarPreguntas() {
		Statement st = null;
		ResultSet rs = null;
		DefaultComboBoxModel<Object> preg = null;
		preg = new DefaultComboBoxModel<>();
		preg.removeAllElements();
		preg.addElement("Seleccione");

		try {
			st = Conexion.getInstancia().getConnection().createStatement();
			rs = st.executeQuery("SELECT * FROM pregunta_s");

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
		} finally {

			try {
				if (rs != null) {
					rs.close();
				}

				if (st != null) {
					st.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();

			}
		}

		return preg;

	}

	public PreguntaModel recuperarPreguntaUsuario(int pregunta) {
		Statement st = null;
		PreguntaModel pgm = null;
		ResultSet rs = null;
		String sql = "SELECT * FROM pregunta_s WHERE id='" + pregunta + "'";
		try {
			st = Conexion.getInstancia().getConnection().createStatement();
			rs = st.executeQuery(sql);
		
			if (rs.next()) {
				pgm = new PreguntaModel();	
				pgm.setId(rs.getInt(1));
				pgm.setPregunta(rs.getString(2));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (st != null) {
					st.close();
				}
				if (rs != null) {
					rs.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return pgm;
	}

}
