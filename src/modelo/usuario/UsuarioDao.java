package modelo.usuario;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import singleton.Conexion;

public class UsuarioDao {

	public UsuarioModel RecuperarUsuarioSesion(String Usuario, String Clave) {
		PreparedStatement pst = null;
		ResultSet rs = null;
		UsuarioModel user = null;
		String sql = "SELECT * FROM usuario WHERE usuario=? and clave=? and estatus=1";
		try {
			pst = Conexion.getInstancia().getConnection().prepareStatement(sql);
			pst.setString(1, Usuario);
			pst.setString(2, Clave);
			rs = pst.executeQuery();

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
		return user;
	}

	public boolean registrarUsuario(UsuarioModel newUser) {
		PreparedStatement pst = null;
		String sql = "INSERT INTO usuario VALUES(null,?,?,?,?,?,?,?,?,?)";
		try {
			pst = Conexion.getInstancia().getConnection().prepareStatement(sql);
			pst.setString(1, newUser.getUsuario());
			pst.setInt(2, newUser.getCedula());
			pst.setString(3, newUser.getNombre());
			pst.setString(4, newUser.getApellido());
			pst.setString(5, newUser.getClave());
			pst.setInt(6, newUser.getPregunta());
			pst.setInt(7, newUser.getTipoUsuario());
			pst.setString(8, newUser.getRespusta());
			pst.setInt(9, newUser.getStatus());
			
			if (pst.executeUpdate()!=0) {
				System.out.println("registro usuario" );
				return true;
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
			if (e.getErrorCode() == 1062) {
				JOptionPane.showMessageDialog(null, "Este nombre de usuario ya esta siendo usado.","Incorrecto",JOptionPane.ERROR_MESSAGE);
			}
			
			return false;
		}finally {

			try {				
				if (pst != null) {
					pst.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		return false;

	}

}
