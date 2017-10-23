package modelo.usuario;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import singleton.Conexion;
import util.StringMD;

public class UsuarioDao {

	
	public UsuarioModel RecuperarUsuarioSesion(String Usuario,String Clave){
		PreparedStatement pst;
		UsuarioModel user=null;
		String sql="SELECT usuario.id,cedula,nombre,apellido,usuario,clave,pregunta_s.preguntas,respuesta_secreta,tipo_usuario.rol,estatus,pregunta_s.id,tipo_usuario.id FROM usuario,pregunta_s,tipo_usuario WHERE usuario=? and clave=? and usuario.pregunta_secreta_id=pregunta_s.id and usuario.tipo_usuario_id=tipo_usuario.id and estatus=1";
		try {
			pst=Conexion.getInstancia().getConnection().prepareStatement(sql);
			pst.setString(1, Usuario);
			pst.setString(2, StringMD.Encriptar(Clave));
			ResultSet rs=pst.executeQuery();
			
			while (rs.next()) {
				user=new UsuarioModel();
				user.setId(rs.getInt(1));
				user.setCedula(rs.getInt(2));
				user.setNombre(rs.getString(3));
				user.setApellido(rs.getString(4));
				user.setUsuario(rs.getString(5));
				user.setClave(rs.getString(6));
				user.setPregunta(rs.getInt(11));
				user.setRespusta(rs.getString(8));
				user.setTipoUsuario(rs.getInt(12));
				user.setStatus(rs.getInt(10));			
			}
						
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}		
		return user;		
	}
	
	public boolean registrarUsuario(UsuarioModel newUser){
		System.out.println(newUser.toString());
		
		return false;
		
	}
	
	
	
}
