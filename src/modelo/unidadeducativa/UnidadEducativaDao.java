package modelo.unidadeducativa;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import modelo.tableModel.MiDefaultTableModel;
import singleton.Conexion;

public class UnidadEducativaDao {

	public TableModel recuperarTodoUnidadEduTabla() {
		Statement st = null;
		ResultSet rs = null;

		DefaultTableModel modelTabla = new MiDefaultTableModel();

		String sql = "SELECT * FROM unidad_educativa ORDER BY designar DESC";
		modelTabla.setColumnIdentifiers(new String[] { "Codigo", "Codigo DEA", "Nombre", "Designada" });

		try {
			st = Conexion.getInstancia().getConnection().createStatement();

			rs = st.executeQuery(sql);

			while (rs.next()) {

				modelTabla.addRow(new Object[] { rs.getInt(1), rs.getString(2), rs.getString(3),
						rs.getInt(5) == 1 ? "SI" : "NO" });

			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {

			try {
				if (st != null)
					st.close();
				if (rs != null)
					rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return modelTabla;
	}

	public void registrarUnidadEducativa(String codDea, String nombre) {
		PreparedStatement pst = null;
		String sql = "INSERT INTO unidad_educativa VALUES(null,?,?,1,0)";
		try {
			pst = Conexion.getInstancia().getConnection().prepareStatement(sql);
			pst.setString(1, codDea);
			pst.setString(2, nombre);

			pst.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {

			try {
				if (pst != null)
					pst.close();

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	public boolean comprobarExistencia(String nombre) {
		PreparedStatement pst = null;
		ResultSet rs = null;
		String sql = "SELECT id FROM unidad_educativa WHERE nombre=?";
		try {
			pst = Conexion.getInstancia().getConnection().prepareStatement(sql);
			pst.setString(1, nombre);
			rs = pst.executeQuery();

			if (rs.next()) {
				return true;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {

			try {
				if (pst != null)
					pst.close();
				if (rs != null)
					rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return false;
	}

	public void removerUnidadEducativa(int valorCodigo) {
		Statement st = null;
		String sql = "DELETE FROM unidad_educativa WHERE id='" + valorCodigo + "'";

		try {
			st = Conexion.getInstancia().getConnection().createStatement();

			st.executeUpdate(sql);

		} catch (SQLException e) {
			if (e.getErrorCode() == 1451) {
				JOptionPane.showMessageDialog(null,
						"Esta unidad educativa ya no se puede remover porque ya tiene eventos vinculados a su registro.",
						"Error", JOptionPane.ERROR_MESSAGE);
			}

		} finally {

			try {
				if (st != null)
					st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public void modificarUnidadEducativa(int valorCodigo, String codDea, String nombre) {
		PreparedStatement pst = null;
		String sql = "UPDATE unidad_educativa SET codigo_dea=?, nombre=? WHERE id=?";
		try {
			pst = Conexion.getInstancia().getConnection().prepareStatement(sql);
			pst.setString(1, codDea);
			pst.setString(2, nombre);
			pst.setInt(3, valorCodigo);

			pst.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {

			try {
				if (pst != null)
					pst.close();

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	public boolean removerUnidadDesignada() {
		Statement st = null;
		String sql = "UPDATE unidad_educativa SET designar=0 WHERE designar=1";
		try {
			st = Conexion.getInstancia().getConnection().createStatement();
			st.executeUpdate(sql);
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		} finally {
			try {
				if (st != null)
					st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public void designarUnidadEducativa(int valorCodigo) {
		Statement st = null;
		String sql = "UPDATE unidad_educativa SET designar=1 WHERE id='"+valorCodigo+"'";
		try {
			st = Conexion.getInstancia().getConnection().createStatement();
			st.executeUpdate(sql);

		} catch (SQLException e) {
			e.printStackTrace();

		} finally {
			try {
				if (st != null)
					st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
