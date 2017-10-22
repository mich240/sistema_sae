package controlador;

import javax.swing.JOptionPane;

import modelo.usuario.usuario;
import modelo.usuario.usuarioDao;
import singleton.Conexion;
import singleton.Sesion;
import util.StringMD;
import vista.vista_menu_principal;

public class AppController {
	private vista_menu_principal mp;

	public vista_menu_principal getMp() {
		return mp;
	}

	public void setMp(vista_menu_principal mp) {
		this.mp = mp;
	}

	public boolean iniciarSesion(String Usuario, String Clave) {
		usuarioDao user = new usuarioDao();
		usuario us = user.RecuperarUsuarioSesion(Usuario, StringMD.Encriptar(Clave));/**cuando se llama
		este metodo se iniciara la conexion para poder consultar**/
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
	
	
	

}
