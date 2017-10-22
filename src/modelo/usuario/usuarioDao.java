package modelo.usuario;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import singleton.Conexion;

public class usuarioDao {

	
	public usuario RecuperarUsuarioSesion(String Usuario,String Clave){
		PreparedStatement pst;
		usuario user=null;
		String sql="SELECT usuario.id,cedula,nombre,apellido,usuario,clave,pregunta_s.preguntas,respuesta_secreta,tipo_usuario.rol,estatus FROM usuario,pregunta_s,tipo_usuario WHERE usuario=? and clave=? and usuario.pregunta_secreta_id=pregunta_s.id and usuario.tipo_usuario_id=tipo_usuario.id and estatus=1";
		try {
			pst=Conexion.getInstancia().getConnection().prepareStatement(sql);
			pst.setString(1, Usuario);
			pst.setString(2, Clave);
			ResultSet rs=pst.executeQuery();
			
			while (rs.next()) {
				user=new usuario();
				user.setId(rs.getInt(1));
				user.setCedula(rs.getInt(2));
				user.setNombre(rs.getString(3));
				user.setApellido(rs.getString(4));
				user.setUsuario(rs.getString(5));
				user.setClave(rs.getString(6));
				user.setPregunta(rs.getString(7));
				user.setRespusta(rs.getString(8));
				user.setTipoUsuario(rs.getString(9));
				user.setStatus(rs.getInt(10));			
			}
						
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}		
		return user;		
	}
	
	
	
	
}
