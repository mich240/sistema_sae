package controlador;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import singleton.Conexion;
import vista.Vista_InicioSesion;
import vista.Vista_menu_principal;
import vista.paneles.Vista_panel_index;
import vista.paneles.Vista_panel_registrar_usuario;

public class IniciarController {
	private AppController app;
	private Vista_InicioSesion InicioSesion;
	private Vista_menu_principal menuPrincipal;
	private Vista_panel_registrar_usuario regisUsu;
	private Vista_panel_index index;

	/// constructor
	public IniciarController() {
		/*
		 * iniciar instancia de la conexion, tambien puede ser que se haga un metodo
		 * para inicializar varias cosas que necesiten conexion a base de datos
		 */
		Conexion.getInstancia();
		// iniciarlisar controladores y vistas
		inicializarController();
		inicializarVistas();
		// enlazar controller con vistas
		app.setMp(menuPrincipal);
		// enlazar vistas con controller
		InicioSesion.setApp(app);
		menuPrincipal.setApp(app);
		regisUsu.setApp(app);
		// agrego los paneles al menuprincipal
		menuPrincipal.setVistaIndex(index);
		menuPrincipal.add(index);
		menuPrincipal.setVista_panel_actual(index);/// coloco index como panel
													/// de inicio actual
		// agrego mas paneles
		menuPrincipal.setRegistrarUser(regisUsu);
		menuPrincipal.add(regisUsu);
		// iniciar sistema por el inicio de sesion
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
	}

	private void inicializarController() {
		app = new AppController();
	}

	private void inicializarVistas() {
		menuPrincipal = new Vista_menu_principal();
		InicioSesion = new Vista_InicioSesion();
		// iniciamos los paneles todos en false menos el de index
		index = new Vista_panel_index();
		index.setVisible(true);
		regisUsu = new Vista_panel_registrar_usuario();
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
