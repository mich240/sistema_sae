package modelo.auditoria;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import modelo.tableModel.MiDefaultTableModel;
import singleton.Conexion;

public class AuditoriaDao {

	
	public void registrarEvento(AuditoriaModel auditor) {
		
		PreparedStatement pst = null;
		String sql ="INSERT INTO auditoria VALUES(null,? ,? ,? ,?)";
		try {
			pst=Conexion.getInstancia().getConnection().prepareStatement(sql);
			pst.setString(1, auditor.getEvento());
			pst.setDate(2, auditor.getFechaEvento());
			pst.setTime(3, auditor.getHoraEvento());
			pst.setInt(4, auditor.getSesionId());
			pst.executeUpdate();
				System.out.println(auditor.getEvento());
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
				try {
				if (pst!=null) {	
					pst.close();
				}
				} catch (SQLException e) {
					e.printStackTrace();
				
			}
		}
	}

	public TableModel cargarTablaEventos(int sesionId) {
		Statement st = null;
		ResultSet rs = null;

		DefaultTableModel modelTabla = new MiDefaultTableModel();
		System.out.println(sesionId);
		String sql = "SELECT evento,fecha,hora FROM auditoria WHERE sesion_id='"+sesionId+"'";
		modelTabla.setColumnIdentifiers(new String[] { "Eventos de esta sesión", "Tiempo" });

		try {
			st = Conexion.getInstancia().getConnection().createStatement();

			rs = st.executeQuery(sql);

			while (rs.next()) {

				modelTabla.addRow(new Object[] { rs.getString(1), rs.getDate(2)+" Hora:"+rs.getTime(3) });

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
	
}
