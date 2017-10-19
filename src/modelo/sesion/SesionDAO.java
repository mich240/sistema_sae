package modelo.sesion;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import singleton.Conexion;
import singleton.Sesion;

public class SesionDAO {
	private Date date = new Date();

	//// retorna el id de la sesion al registrarse para asi tener el codigo de
	//// la sesion
	public int SesionLoginRegistro(int usuario_id) {

		if (!Sesion.isSesion()) {
			PreparedStatement pst;
			SimpleDateFormat fecha = new SimpleDateFormat("yyy-MM-dd");
			SimpleDateFormat hora = new SimpleDateFormat("HH:mm:ss");
			String sql = "INSERT INTO sesion VALUES(null, ?, ?, ?, ?, ?)";

			try {
				pst = Conexion.getInstancia().getConnection().prepareStatement(sql,
						PreparedStatement.RETURN_GENERATED_KEYS);
				pst.setString(1, fecha.format(date));
				pst.setString(2, hora.format(date));
				pst.setString(3, fecha.format(date));
				pst.setString(4, hora.format(date));
				pst.setInt(5, usuario_id);

				pst.executeUpdate();

				ResultSet rs = pst.getGeneratedKeys();
				if (rs.next()) {
					System.out.println("Sesion registrada.");
					return rs.getInt(1);
				}

			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("No se pudo registrar la sesion");
			}
		} else
			System.out.println("ya existe una sesion creada y registrada.");

		return 0;
	}

	public void SesionLogOutRegistro(int sesion_id) {

	}

}
