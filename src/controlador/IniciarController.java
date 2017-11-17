package controlador;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import singleton.Conexion;
import singleton.Transaccion;
import vista.VistaInicioSesion;
import vista.VistaMenuPrincipal;
import vista.paneles.VistaAgregarUnidadEdu;
import vista.paneles.VistaAuditoria;
import vista.paneles.VistaDatosAccesoUsuario;
import vista.paneles.VistaDatosUsuario;
import vista.paneles.VistaEliminarUsuario;
import vista.paneles.VistaListaRubros;
import vista.paneles.VistaListarUsuarios;
import vista.paneles.VistaPanelIndex;
import vista.paneles.VistaPanelRegistrarUsuario;
import vista.paneles.VistaReporte;

public class IniciarController {
	private AppController app;
	private VistaInicioSesion InicioSesion;
	private VistaMenuPrincipal menuPrincipal;
	private VistaPanelRegistrarUsuario regisUsu;
	private VistaPanelIndex index;
	private VistaEliminarUsuario eliminarUser;
	private VistaDatosUsuario datosUser;
	private VistaDatosAccesoUsuario datosAccesoUsuario;
	private VistaListarUsuarios listaUsuarios;
	private VistaListaRubros listaRubro;
	private VistaAgregarUnidadEdu unidadesEdu;
	private VistaAuditoria auditoria;
	private VistaReporte visorReporte;

	/// constructor
	public IniciarController() {
		/*
		 * iniciar instancia de la conexion, tambien puede ser que se haga un
		 * metodo para inicializar varias cosas que necesiten conexion a base de
		 * datos
		 */
		Conexion.getInstancia();
		Transaccion.recuperaTransaccion();	
		// iniciarlisar controladores y vistas
		inicializarController();
		inicializarVistas();
		app.setInicio(this);// iniciar instancia mutua
		// enlazar controller con vistas
		app.setMp(menuPrincipal);
		// enlazar vistas con controller
		InicioSesion.setApp(app);
		menuPrincipal.setApp(app);
		regisUsu.setApp(app);
		eliminarUser.setApp(app);
		datosUser.setApp(app);
		datosAccesoUsuario.setApp(app);
		listaUsuarios.setApp(app);
		listaRubro.setApp(app);
		unidadesEdu.setApp(app);
		auditoria.setApp(app);
		visorReporte.setApp(app);
		

		// agrego los paneles al menuprincipal
		menuPrincipal.setVistaIndex(index);
		menuPrincipal.add(index);
		menuPrincipal.setVista_panel_actual(index);/// coloco index como panel

		// agrego mas paneles
		menuPrincipal.setRegistrarUser(regisUsu);
		menuPrincipal.add(regisUsu);
		menuPrincipal.setEliminarUser(eliminarUser);
		menuPrincipal.add(eliminarUser);
		menuPrincipal.setDatosUser(datosUser);
		menuPrincipal.add(datosUser);
		menuPrincipal.setDatosAccesoUsuario(datosAccesoUsuario);																
		menuPrincipal.add(datosAccesoUsuario);
		menuPrincipal.setListaUsuario(listaUsuarios);
		menuPrincipal.add(listaUsuarios);
		menuPrincipal.setListaRubro(listaRubro);
		menuPrincipal.add(listaRubro);
		menuPrincipal.setUnidadesEdu(unidadesEdu);
		menuPrincipal.add(unidadesEdu);
		menuPrincipal.setAuditoria(auditoria);
		menuPrincipal.add(auditoria);
		menuPrincipal.setVisorReportes(visorReporte);
		menuPrincipal.add(visorReporte);

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
		menuPrincipal = new VistaMenuPrincipal();
		InicioSesion = new VistaInicioSesion();
		// iniciamos los paneles todos en false menos el de index
		index = new VistaPanelIndex();
		index.setVisible(true);
		regisUsu = new VistaPanelRegistrarUsuario();
		regisUsu.setVisible(false);
		eliminarUser = new VistaEliminarUsuario();
		eliminarUser.setVisible(false);
		datosUser = new VistaDatosUsuario();
		datosUser.setVisible(false);
		datosAccesoUsuario = new VistaDatosAccesoUsuario();
		datosAccesoUsuario.setVisible(false);
		listaUsuarios = new VistaListarUsuarios();
		listaUsuarios.setVisible(false);
		listaRubro = new VistaListaRubros();
		listaRubro.setVisible(false);
		unidadesEdu = new VistaAgregarUnidadEdu();
		unidadesEdu.setVisible(false);
		auditoria=new VistaAuditoria();
		auditoria.setVisible(false);
		visorReporte=new VistaReporte();
		visorReporte.setVisible(false);
	}

	private static void installLnF(String LnF) {
		try {
			UIManager.setLookAndFeel(LnF);
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
	}

	public void inicializarRestricciones() {
		menuPrincipal.aplicarRestriccion();
		listaUsuarios.aplicarRestriccion();
		unidadesEdu.aplicarRestriccion();
		
	}
}
