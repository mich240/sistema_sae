package controlador;

import javax.swing.JOptionPane;

import modelo.rubro.RubroDao;
import modelo.unidadeducativa.UnidadEducativaDao;
import modelo.usuario.UsuarioDao;
import modelo.usuario.UsuarioModel;
import singleton.Conexion;
import singleton.Sesion;
import vista.VistaMenuPrincipal;

public class AppController {
	private VistaMenuPrincipal mp;
	private IniciarController inicio;
	private UsuarioDao useD = new UsuarioDao();

	public VistaMenuPrincipal getMp() {
		return mp;
	}

	public void setMp(VistaMenuPrincipal mp) {
		this.mp = mp;
	}
	

	public IniciarController getInicio() {
		return inicio;
	}

	public void setInicio(IniciarController inicio) {
		this.inicio = inicio;
	}

	public boolean iniciarSesion(String Usuario, String clave) {
		UsuarioModel us = useD.RecuperarUsuarioSesion(Usuario, clave);
		if (us != null) {
			Sesion.CrearSesion(us);
			return true;
		} else
			JOptionPane.showMessageDialog(null,
					"Usuario o cantraseña invalidos, por favor proporcione la información correcta.", "Error",
					JOptionPane.ERROR_MESSAGE);
		return false;
	}

	public void cerrarSesion() {
		Sesion.getSesion().DestroyerSesion();
		Conexion.Desconectar();
	}

	public void iniciarPrincipal() {
		getMp().setDefaultCloseOperation(0);
		getMp().setTitle("Menú principal");
		getMp().getContentPane().setPreferredSize(getMp().getSize());
		getMp().pack();
		getMp().setLocationRelativeTo(null);
		getMp().setVisible(true);
		///aplicar restrincciones de usuarios.
		getInicio().inicializarRestricciones();
	}

	public boolean registrarUsuario(UsuarioModel newUser) {
		if (useD.registrarUsuario(newUser))
			return true;
		else
			return false;
	}

	public boolean eliminarUsuario(String username) {
		int error = useD.eliminarUsuario(username);
		if (error == 1451) {
			JOptionPane.showMessageDialog(null,
					"Este usuario no se puede eliminar porque ya tiene eventos vinculados a su registro, solo se puede desincorporar el usuario.",
					"Error", JOptionPane.ERROR_MESSAGE);
			return false;
		}
		if (error == 0) {
			JOptionPane.showMessageDialog(null, "Este usuario no existe.", "Incorrecto.", JOptionPane.ERROR_MESSAGE);
			return false;
		} else
			return true;
	}

	public boolean actualizarUsuario(UsuarioModel user) {
		if (useD.actualizarUsuario(user))
			return true;
		else
			return false;
	}

	public boolean actualizarDatosAccesoUsuario(UsuarioModel user) {
		if (useD.actualizarDatosAccesoUsuario(user)) {
			return true;
		} else
			return false;
	}

	public boolean desincorporarUsuario(String username) {
		if (useD.compruebaExisteAdmin()) {
			if (useD.desincorporarUsuario(username)) {
				return true;
			} else {
				return false;
			}
		} else {
			JOptionPane.showMessageDialog(null,
					"No se puede desincorporar, debe haber almenos un usuario ADMINISTRADOR.", "Cuidado",
					JOptionPane.WARNING_MESSAGE);
			return false;
		}

	}

	public boolean reIncorporarUsuario(String username) {
		if (useD.reIncorporarUsuario(username)) {
			return true;
		}
		return false;
	}

	public boolean actualizaTipoUsuario(String username, int tipoUser_id) {
		if (tipoUser_id == 1) {
			if (useD.actualizaTipoUsuario(username, tipoUser_id)) {
				return true;
			} else {
				return false;
			}
		} else if (useD.compruebaExisteAdmin()) {
			if (useD.actualizaTipoUsuario(username, tipoUser_id)) {
				return true;
			} else {
				return false;
			}
		} else {
			JOptionPane.showMessageDialog(null,
					"No se puede cambiar los provilegios para este usuario, debe haber almenos un usuario ADMINISTRADOR.",
					"Cuidado", JOptionPane.WARNING_MESSAGE);
			return false;
		}

	}

	public void registrarRubro(String producto) {
		RubroDao ru = new RubroDao();
		if (!ru.comprobarExistencia(producto)) {
			ru.registrarRubro(producto);
		} else
			JOptionPane.showMessageDialog(null, "Ya agregaste un producto con este nombre.", "Error",
					JOptionPane.ERROR_MESSAGE);

	}

	public void removerRubro(int valorCodigo) {
		RubroDao ru = new RubroDao();
		ru.removerRubro(valorCodigo);

	}

	public void modificaRubro(int valorCodigo, String producto) {
		RubroDao ru = new RubroDao();
		if (!ru.comprobarExistencia(producto)) {
			ru.modificaRubro(valorCodigo, producto);
		} else
			JOptionPane.showMessageDialog(null, "Ya agregaste un producto con este nombre.", "Error",
					JOptionPane.ERROR_MESSAGE);

	}

	public void registrarUnidadEducativa(String codDea, String nombre) {
		UnidadEducativaDao uEdu = new UnidadEducativaDao();
		if (!uEdu.comprobarExistencia(nombre)) {
			uEdu.registrarUnidadEducativa(codDea, nombre);
		} else
			JOptionPane.showMessageDialog(null, "Ya agregaste una unidad educativa con este nombre.", "Error",
					JOptionPane.ERROR_MESSAGE);

	}

	public void removerUnidadEducativa(int valorCodigo) {
		UnidadEducativaDao uEdu = new UnidadEducativaDao();
		uEdu.removerUnidadEducativa(valorCodigo);
	}

	public void modificarUnidadEducativa(boolean modificarTodo, int valorCodigo, String codDea, String nombre) {
		UnidadEducativaDao uEdu = new UnidadEducativaDao();
		if (modificarTodo) {
			if (!uEdu.comprobarExistencia(nombre)) {
				uEdu.modificarUnidadEducativa(valorCodigo, codDea, nombre);
			} else
				JOptionPane.showMessageDialog(null, "Ya agregaste una unidad educativa con este nombre.", "Error",
						JOptionPane.ERROR_MESSAGE);
		} else
			uEdu.modificarUnidadEducativa(valorCodigo, codDea, nombre);

	}

	public void designarUnidadEducativa(int valorCodigo) {
		UnidadEducativaDao uEdu = new UnidadEducativaDao();
		if(uEdu.removerUnidadDesignada()) {
			uEdu.designarUnidadEducativa(valorCodigo);
		}
		
		
	}

}
