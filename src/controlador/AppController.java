package controlador;

import javax.swing.JOptionPane;

import modelo.usuario.UsuarioModel;
import modelo.usuario.UsuarioDao;
import singleton.Conexion;
import singleton.Sesion;
import util.StringMD;
import vista.Vista_menu_principal;

public class AppController {
	private Vista_menu_principal mp;

	public Vista_menu_principal getMp() {
		return mp;
	}

	public void setMp(Vista_menu_principal mp) {
		this.mp = mp;
	}

	public boolean iniciarSesion(String Usuario, String Clave) {
		UsuarioDao user = new UsuarioDao();
		UsuarioModel us = user.RecuperarUsuarioSesion(Usuario, StringMD
				.Encriptar(Clave));/**
									 * cuando se llama este metodo se iniciara
									 * la conexion para poder consultar
									 **/
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
		/// inicio el frame principal
		getMp().setDefaultCloseOperation(0);
		getMp().setTitle("Menú principal");
		getMp().getContentPane().setPreferredSize(getMp().getSize());
		getMp().pack();
		getMp().setLocationRelativeTo(null);
		getMp().setVisible(true);

	}

	public boolean registrarUsuario(UsuarioModel newUser) {
		UsuarioDao useD = new UsuarioDao();
		if (useD.registrarUsuario(newUser))
			return true;
		else
			return false;
	}

}
