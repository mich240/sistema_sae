package modelo.tipousuario;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import singleton.Conexion;

public class tipoUsuarioDao {

	public DefaultComboBoxModel<Object> cargarTipoUsuarios() {

		DefaultComboBoxModel<Object> preg = null;
		preg = new DefaultComboBoxModel<>();
		preg.removeAllElements();
		preg.addElement("Seleccione");
		Statement st = null;
		ResultSet rs = null;

		try {
			st = Conexion.getInstancia().getConnection().createStatement();
			rs = st.executeQuery("SELECT * FROM tipo_usuario");

			while (rs.next()) {
				tipoUsuarioModel it = new tipoUsuarioModel();
				it.setId(rs.getInt(1));// creo un modelo por cada rol
				it.setRol(rs.getString(2));
				preg.addElement(it);/***
									 * agrego el modelo a los item pero el
									 * muestra el toString mediante una
									 * conversion interna. (eso es de java)
									 **/
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {

			try {
				if (rs != null)
					rs.close();
				if (st != null)
					st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

		return preg;

	}

}
