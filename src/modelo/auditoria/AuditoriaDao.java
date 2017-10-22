package modelo.auditoria;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import singleton.Conexion;

public class AuditoriaDao {

	
	public void registrarEvento(AuditoriaModel auditor) {
		
		PreparedStatement pst;
		String sql ="INSERT INTO auditoria VALUES(null,? ,? ,? ,?)";
		try {
			pst=Conexion.getInstancia().getConnection().prepareStatement(sql);
			pst.setString(1, auditor.getEvento());
			pst.setString(2, auditor.getFechaEvento());
			pst.setString(3, auditor.getHoraEvento());
			pst.setInt(4, auditor.getSesionId());
			pst.executeUpdate();
				System.out.println(auditor.getEvento());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
