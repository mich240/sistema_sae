package modelo.sesion;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import singleton.Conexion;
import singleton.Sesion;

public class SesionDao {
	/**
	 * retorna el id de la sesion al registrarse para asi tener el codigo de la
	 * sesion
	 **/
	public int SesionLoginRegistro(SesionModel ses) {
		//// si la sesion aun no a sido creada
		if (!Sesion.isSesion()) {/// sesion es false
			PreparedStatement pst = null; // declarando el statem
			ResultSet rs = null;
			String sql = "INSERT INTO sesion VALUES(null, ?, ?, ?, ?, ?)";// mi sql
			try {
				pst = Conexion.getInstancia().getConnection().prepareStatement(sql,
						PreparedStatement.RETURN_GENERATED_KEYS);// y creo el statem con el RETURN_GENERATED_KEYS
				/** seteo todos los values necesarios */
				pst.setDate(1, ses.getFechaInicio());
				pst.setTime(2, ses.getHoraInicio());
				pst.setDate(3, ses.getFechaSalida());
				pst.setTime(4, ses.getHoraSalida());
				pst.setInt(5, ses.getUsuario_id());
				/// ejecuto el insert
				pst.executeUpdate();
				rs = pst.getGeneratedKeys();// obtengo la clave primaria generada.
				if (rs.next()) {
					System.out.println("Se registro el inicio de sesión.");
					return rs.getInt(1);// retorno esa clave
				}
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("No se pudo registrar la sesion");
			} finally {
				try {
					if (rs != null) {
						rs.close();
					}
					if (pst != null) {
						pst.close();
					}

				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		} else
			System.out.println("ya existe una sesion creada y registrada.");
		return 0;
	}

	public void SesionLogOutRegistro(SesionModel ses) {
		if (Sesion.isSesion()) {// si hay una sesion activa
			PreparedStatement pst = null;
			String sql = "UPDATE sesion SET finalizo_fecha = ?, finalizo_hora= ? WHERE id= ? ";
			try {
				pst = Conexion.getInstancia().getConnection().prepareStatement(sql);
				pst.setDate(1, ses.getFechaSalida());
				pst.setTime(2, ses.getHoraSalida());
				pst.setInt(3, ses.getId());
				pst.executeUpdate();
				System.out.println("Se registro la finalización de la sesión.");
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				try {

					if (pst != null) {
						pst.close();
					}

				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		} else
			System.out.println("No se ha registrado una sesión");
	}
}
