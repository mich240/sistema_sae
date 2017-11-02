package modelo.transaccion;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

import javax.swing.JOptionPane;

import singleton.Conexion;

public class TransaccionDao {

	public TransaccionModel recuperaTransaccionActiva() {
		Statement st = null;
		ResultSet rs = null;
		TransaccionModel trs = null;
		String sql = "SELECT * FROM transaccion WHERE estatus=1";
		try {
			st = Conexion.getInstancia().getConnection().prepareStatement(sql);

			rs = st.executeQuery(sql);

			if (rs.next()) {
				trs = new TransaccionModel();
				trs.setId(rs.getInt(1));
				trs.setFecha(rs.getDate(2));
				trs.setUnidad_edu_id(rs.getInt(3));
				trs.setStatus(rs.getInt(4));
			}

		} catch (SQLException e) {
			e.printStackTrace();
			return null;
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
		return trs;
	}

	public boolean crearTransaccion() {
		Statement st = null;

		String sql = "INSERT INTO transaccion VALUES (null,'" + new java.sql.Date(new Date().getTime())
				+ "',(SELECT id FROM unidad_educativa WHERE designar=1),1)";
		try {
			st = Conexion.getInstancia().getConnection().prepareStatement(sql);

			if (st.executeUpdate(sql) != 0) {
				return true;
			}

		} catch (SQLException e) {
			e.printStackTrace();
			if (e.getErrorCode() == 1048) {
				JOptionPane.showMessageDialog(null, "No ha designado una unidad educativa como predeterminada.",
						"Error", JOptionPane.ERROR_MESSAGE);
				return false;
			}

		} finally {

			try {

				if (st != null) {
					st.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		return false;

	}

	public boolean terminarTransaccion(int transaccion_id) {
		Statement st = null;

		String sql = "UPDATE transaccion SET estatus=0 WHERE id='" + transaccion_id + "'";
		try {
			st = Conexion.getInstancia().getConnection().prepareStatement(sql);

			if (st.executeUpdate(sql) != 0) {
				return true;
			}

		} catch (SQLException e) {
			e.printStackTrace();

			return false;

		} finally {

			try {

				if (st != null) {
					st.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		return false;
	}

}
