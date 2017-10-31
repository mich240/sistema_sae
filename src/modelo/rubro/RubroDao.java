package modelo.rubro;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import modelo.tableModel.MiDefaultTableModel;
import singleton.Conexion;

public class RubroDao {

	public TableModel recuperaTodosRubroTabla() {
		Statement st = null;
		ResultSet rs = null;

		DefaultTableModel modelTabla = new MiDefaultTableModel();

		String sql = "SELECT * FROM rubro";
		modelTabla.setColumnIdentifiers(new String[] { "Codigo", "Rubros" });

		try {
			st = Conexion.getInstancia().getConnection().createStatement();

			rs = st.executeQuery(sql);

			while (rs.next()) {

				modelTabla.addRow(new Object[] { rs.getInt(1), rs.getString(2) });

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			
				try {
					if(st!=null)
					st.close();
					if(rs!=null)
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}

		return modelTabla;

	}

	public void registrarRubro(String producto) {
		PreparedStatement pst = null;
		String sql = "INSERT INTO rubro VALUES(null,?)";
		try {
			pst = Conexion.getInstancia().getConnection().prepareStatement(sql);
			pst.setString(1, producto);

			pst.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			
			try {
				if(pst!=null)
				pst.close();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
	}

	}

	public void removerRubro(int valorCodigo) {
		Statement st = null;
		String sql = "DELETE FROM rubro WHERE id='" + valorCodigo + "'";

		try {
			st = Conexion.getInstancia().getConnection().createStatement();

			st.executeUpdate(sql);

		} catch (SQLException e) {
			if (e.getErrorCode() == 1451) {
				JOptionPane.showMessageDialog(null,
						"Este rubro ya no se puede remover porque ya tiene eventos vinculados a su registro.", "Error",
						JOptionPane.ERROR_MESSAGE);
			}

		}finally {
			
			try {
				if(st!=null)
				st.close();			
			} catch (SQLException e) {
				e.printStackTrace();
			}
	}

	}

	public void modificaRubro(int valorCodigo, String producto) {
		PreparedStatement pst = null;
		String sql = "UPDATE rubro SET descripcion=? WHERE id=?";
		try {
			pst = Conexion.getInstancia().getConnection().prepareStatement(sql);
			pst.setString(1, producto);
			pst.setInt(2, valorCodigo);

			pst.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			
			try {
				if(pst!=null)
				pst.close();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
	}

	}

	public boolean comprobarExistencia(String producto) {
		PreparedStatement pst=null;
		ResultSet rs=null;
		String sql="SELECT id FROM rubro WHERE descripcion=?";
		try {
			pst=Conexion.getInstancia().getConnection().prepareStatement(sql);
			pst.setString(1, producto);
			rs=pst.executeQuery();
			
			if (rs.next()) {
				return true;
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			
			try {
				if(pst!=null)
				pst.close();
				if(rs!=null)
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
	}
		return false;
	}

}
