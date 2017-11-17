package modelo.usuario;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import modelo.tableModel.MiDefaultTableModel;
import modelo.tipousuario.TipoUsuarioModel;
import singleton.Conexion;
import util.AbstracReporte;

public class UsuarioDao extends AbstracReporte {

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

			if (rs.next()) {
				user = new UsuarioModel();
				user.setId(rs.getInt(1));
				user.setUsuario(rs.getString(2));
				user.setCedula(rs.getInt(3));
				user.setNombre(rs.getString(4));
				user.setApellido(rs.getString(5));
				user.setClave(rs.getString(6));
				user.setPregunta(rs.getInt(7));
				user.setTipoUsuario(rs.getInt(8));
				user.setRespuesta(rs.getString(9));
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
			pst.setString(8, newUser.getRespuesta());
			pst.setInt(9, newUser.getStatus());

			if (pst.executeUpdate() != 0) {
				System.out.println("registro usuario");
				return true;
			}

		} catch (SQLException e) {
			e.printStackTrace();
			if (e.getErrorCode() == 1062) {
				JOptionPane.showMessageDialog(null, "Este nombre de usuario ya esta siendo usado.", "Incorrecto",
						JOptionPane.ERROR_MESSAGE);
			}

			return false;
		} finally {

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

	public int eliminarUsuario(String user) {
		Statement st = null;
		String sql = "DELETE FROM usuario WHERE usuario.usuario='" + user + "' and estatus=1";
		try {
			st = Conexion.getInstancia().getConnection().createStatement();

			return st.executeUpdate(sql);

		} catch (SQLException e) {
			return e.getErrorCode();
		} finally {
			if (st != null) {
				try {
					st.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public boolean actualizarUsuario(UsuarioModel user) {
		PreparedStatement pst = null;
		String sql = "UPDATE usuario SET cedula=?, nombre=?, apellido=? WHERE usuario=? and estatus=1";
		try {
			pst = Conexion.getInstancia().getConnection().prepareStatement(sql);
			pst.setInt(1, user.getCedula());
			pst.setString(2, user.getNombre());
			pst.setString(3, user.getApellido());
			pst.setString(4, user.getUsuario());

			if (pst.executeUpdate() != 0) {
				return true;
			}

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

		return false;

	}

	public UsuarioModel recuperarUsuarioRefresh(int idUser) {
		PreparedStatement pst = null;
		ResultSet rs = null;
		UsuarioModel user = null;
		String sql = "SELECT * FROM usuario WHERE id=? and estatus=1";
		try {
			pst = Conexion.getInstancia().getConnection().prepareStatement(sql);
			pst.setInt(1, idUser);

			rs = pst.executeQuery();
			user = new UsuarioModel();
			if (rs.next()) {
				user.setId(rs.getInt(1));
				user.setUsuario(rs.getString(2));
				user.setCedula(rs.getInt(3));
				user.setNombre(rs.getString(4));
				user.setApellido(rs.getString(5));
				user.setClave(rs.getString(6));
				user.setPregunta(rs.getInt(7));
				user.setTipoUsuario(rs.getInt(8));
				user.setRespuesta(rs.getString(9));
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

	public String recuperarPregunta(String username) {
		Statement st = null;
		ResultSet rs = null;
		String sql = "SELECT preguntas FROM usuario,pregunta_s WHERE usuario='" + username
				+ "' and usuario.pregunta_secreta_id=pregunta_s.id and estatus=1";
		try {
			st = Conexion.getInstancia().getConnection().prepareStatement(sql);

			rs = st.executeQuery(sql);

			if (rs.next()) {
				return rs.getString(1);
			}

		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		} finally {

			try {
				if (rs != null) {
					rs.close();
				}
				if (st != null) {
					st.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		return null;
	}

	public boolean actualizarDatosAccesoUsuario(UsuarioModel user) {
		PreparedStatement pst = null;
		String sql = "UPDATE usuario SET pregunta_secreta_id=?, clave=?, respuesta_secreta=? WHERE usuario=? and estatus=1";
		try {
			pst = Conexion.getInstancia().getConnection().prepareStatement(sql);
			pst.setInt(1, user.getPregunta());
			pst.setString(2, user.getClave());
			pst.setString(3, user.getRespuesta());
			pst.setString(4, user.getUsuario());

			if (pst.executeUpdate() != 0) {
				return true;
			}

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

		return false;
	}

	public TableModel recuperarTodosUsuariosTable() {
		Statement st = null;
		ResultSet rs = null;
		TipoUsuarioModel tusm = null;

		DefaultTableModel modelTabla = new MiDefaultTableModel();

		String sql = "SELECT usuario,cedula,nombre,apellido,rol,estatus,tipo_usuario.id FROM usuario,tipo_usuario WHERE usuario.tipo_usuario_id=tipo_usuario.id";
		modelTabla.setColumnIdentifiers(
				new String[] { "Username", "Cedula", "Nombre", "Apellido", "Privilegio", "Status" });

		try {
			st = Conexion.getInstancia().getConnection().createStatement();

			rs = st.executeQuery(sql);

			while (rs.next()) {
				tusm = new TipoUsuarioModel();
				tusm.setId(rs.getInt(7));
				tusm.setRol(rs.getString(5));

				modelTabla.addRow(new Object[] { rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),
						tusm, rs.getInt(6) == 1 ? "Activo" : "Inactivo" });

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

	public boolean desincorporarUsuario(String username) {
		Statement st = null;
		String sql = "UPDATE usuario SET estatus=0 WHERE usuario='" + username + "'";
		try {
			st = Conexion.getInstancia().getConnection().createStatement();
			if (st.executeUpdate(sql) != 0) {
				return true;
			}
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

		return false;
	}

	public boolean compruebaExisteAdmin() {
		Statement st = null;
		ResultSet rs = null;
		String sql = "SELECT count(tipo_usuario_id) as admin FROM usuario WHERE tipo_usuario_id=1 and estatus=1";

		try {
			st = Conexion.getInstancia().getConnection().createStatement();
			rs = st.executeQuery(sql);
			if (rs.next()) {
				if (rs.getInt(1) > 1) {
					return true;
				} else
					return false;
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

		return false;
	}

	public boolean reIncorporarUsuario(String username) {
		Statement st = null;
		String sql = "UPDATE usuario SET estatus=1 WHERE usuario='" + username + "'";
		try {
			st = Conexion.getInstancia().getConnection().createStatement();
			if (st.executeUpdate(sql) != 0) {
				return true;
			}
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

		return false;
	}

	public boolean actualizaTipoUsuario(String username, int tipoUser_id) {
		Statement st = null;
		String sql = "UPDATE usuario SET tipo_usuario_id='" + tipoUser_id + "' WHERE usuario='" + username
				+ "' and estatus=1";
		try {
			st = Conexion.getInstancia().getConnection().createStatement();
			if (st.executeUpdate(sql) != 0) {
				return true;
			}
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

		return false;
	}

	public String recuperarClaveOtroUsuario(String userName) {
		Statement st = null;
		ResultSet rs = null;
		String sql = "SELECT clave FROM usuario WHERE usuario='" + userName + "'";
		try {
			st = Conexion.getInstancia().getConnection().createStatement();
			rs = st.executeQuery(sql);

			if (rs.next()) {
				return rs.getString(1);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}

	public boolean comprobarRespuesta(String usuario, String respuesta) {
		Statement st = null;
		ResultSet rs = null;
		String sql = "SELECT respuesta_secreta FROM usuario WHERE respuesta_secreta='" + respuesta + "' and usuario='"
				+ usuario + "' and estatus=1";
		try {
			st = Conexion.getInstancia().getConnection().createStatement();
			rs = st.executeQuery(sql);

			if (rs.next()) {
				return true;
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

		return false;
	}

	public boolean cambiarClave(String usuario, String clave) {
		Statement st = null;
		String sql = "UPDATE usuario SET clave='" + clave + "' WHERE usuario='" + usuario + "' and estatus=1";

		try {
			st = Conexion.getInstancia().getConnection().createStatement();

			if (st.executeUpdate(sql) != 0) {
				return true;
			}

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

		return false;
	}

	
}
