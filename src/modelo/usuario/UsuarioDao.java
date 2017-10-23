package modelo.usuario;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import singleton.Conexion;

public class UsuarioDao {

	public UsuarioModel RecuperarUsuarioSesion(String Usuario, String Clave) {
		PreparedStatement pst;
		UsuarioModel user = null;
		String sql = "SELECT * FROM usuario WHERE usuario=? and clave=? and estatus=1";
		try {
			pst = Conexion.getInstancia().getConnection().prepareStatement(sql);
			pst.setString(1, Usuario);
			pst.setString(2, Clave);
			ResultSet rs = pst.executeQuery();

			while (rs.next()) {
				user = new UsuarioModel();
				user.setId(rs.getInt(1));
				user.setUsuario(rs.getString(2));
				user.setCedula(rs.getInt(3));
				user.setNombre(rs.getString(4));
				user.setApellido(rs.getString(5));
				user.setClave(rs.getString(6));
				user.setPregunta(rs.getInt(7));
				user.setTipoUsuario(rs.getInt(8));
				user.setRespusta(rs.getString(9));
				user.setStatus(rs.getInt(10));
			}

		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		return user;
	}

	public boolean registrarUsuario(UsuarioModel newUser) {
		System.out.println(newUser.toString());

		return false;

	}

}
