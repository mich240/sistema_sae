package controlador;

import javax.swing.JOptionPane;

import modelo.usuario.usuario;
import modelo.usuario.usuarioDAO;
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
	
	public boolean IniciarSesion(String Usuario,String Clave) {
		usuarioDAO user=new usuarioDAO();
		usuario us=user.RecuperarUsuarioSesion(Usuario, StringMD.Encriptar(Clave));		
		if (us!=null) {
		Sesion.getSesion().SetUser(us);
		return true;
		}
		else JOptionPane.showMessageDialog(null, "Usuario o cantraseña invalidos, por favor proporcione la información correcta.", "Error", JOptionPane.ERROR_MESSAGE);	
		return false;		
	}
	

	public void iniciarPrincipal() {		
		///inicio el frame principal
		getMp().setDefaultCloseOperation(0);
		getMp().setTitle("Menú principal");
		getMp().getContentPane().setPreferredSize(getMp().getSize());
		getMp().pack();
		getMp().setLocationRelativeTo(null);
		getMp().setVisible(true);
		
	}
	
	
	
}
