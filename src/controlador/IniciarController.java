package controlador;

import java.nio.charset.Charset;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import vista.vista_InicioSesion;
import vista.vista_menu_principal;
import vista.paneles.vista_panel_index;
import vista.paneles.vista_panel_registrar_usuario;

public class IniciarController {
	private AppController app;
	private vista_InicioSesion InicioSesion;
	private vista_menu_principal menuPrincipal;
	private vista_panel_registrar_usuario regisUsu;
	private vista_panel_index index;
	/// constructor
	public IniciarController() {
		//////////////// iniciarlisar controladores y
		//////////////// vistas////////////////////////
		inicializarController();
		inicializarVistas();
		////// enlazar controller con vistas///
		app.setMp(menuPrincipal);
		//// enlazar vistas con controller
		InicioSesion.setApp(app);
		/// a�adir paneles al menuprincipal
		menuPrincipal.setVistaIndex(index);
		menuPrincipal.add(index);
		menuPrincipal.setVista_panel_actual(index);/// coloco index como panel
													/// principal /// actual
		/// a�ado mas paneles
		menuPrincipal.setRegistrarUser(regisUsu);
		menuPrincipal.add(regisUsu);
		//// iniciar sistema por el inicio de sesion
		InicioSesion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		InicioSesion.setTitle("Inicio de Sesión");
		InicioSesion.getContentPane().setPreferredSize(InicioSesion.getSize());
		InicioSesion.pack();
		InicioSesion.setLocationRelativeTo(null);
		InicioSesion.setVisible(true);
	}

	public static void main(String[] args) {
		installLnF("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		new IniciarController();
		System.out.println(Charset.defaultCharset());
	}

	private void inicializarController() {
		app = new AppController();
	}

	private void inicializarVistas() {
		menuPrincipal = new vista_menu_principal();
		InicioSesion = new vista_InicioSesion();
		///// iniciamos los paneles todos en false menos el de index

		index = new vista_panel_index();
		index.setVisible(true);
		regisUsu = new vista_panel_registrar_usuario();
		regisUsu.setVisible(false);
	}

	private static void installLnF(String LnF) {
		try {
			UIManager.setLookAndFeel(LnF);
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
	}
}
