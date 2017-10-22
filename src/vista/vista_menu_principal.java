package vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import controlador.AppController;
import controlador.IniciarController;
import vista.paneles.vista_panel_index;
import vista.paneles.vista_panel_registrar_usuario;

//VS4E -- DO NOT REMOVE THIS LINE!
public class vista_menu_principal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JMenuItem jMenuItem0;
	private JMenu jMenu0;
	private JMenuBar jMenuBar0;
	private JMenuItem jMenuItem1;
	private JMenuItem jMenuItem2;
	private JMenu jMenu1;
	private JMenuItem jMenuItem3;
	private JMenuItem jMenuItem4;
	private JMenu jMenu2;
	private JMenuItem jMenuItem5;
	private JMenuItem jMenuItem6;
	private JMenu jMenu3;
	private JMenuItem jMenuItem8;
	private JMenuItem jMenuItem9;
	private JMenu jMenu4;
	private JMenuItem jMenuItem10;
	private JMenuItem jMenuItem11;
	private JMenu jMenu5;
	private JMenuItem jMenuItem12;
	private JMenu jMenu6;
	private JMenuItem jMenuItem13;
	private JMenu jMenu7;
	private JPanel Vista_panel_actual;
	private vista_panel_registrar_usuario RegistrarUser;
	private vista_panel_index VistaIndex;
	private AppController app;
	private static final String PREFERRED_LOOK_AND_FEEL = "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel";
	public vista_menu_principal() {
		initComponents();
	}

	private void initComponents() {
		setLayout(null);
		addWindowListener(new WindowAdapter() {
	
			public void windowClosing(WindowEvent event) {
				windowWindowClosing(event);
			}
		});
		setJMenuBar(getJMenuBar0());
		setSize(1020, 570);
	}
	
	
	
	
	public AppController getApp() {
		return app;
	}

	public void setApp(AppController app) {
		this.app = app;
	}

	public JPanel getVista_panel_actual() {
		return Vista_panel_actual;
	}

	public void setVista_panel_actual(JPanel vista_panel_actual) {
		Vista_panel_actual = vista_panel_actual;
	}

	public vista_panel_registrar_usuario getRegistrarUser() {
		return RegistrarUser;
	}

	public void setRegistrarUser(vista_panel_registrar_usuario registrarUser) {
		RegistrarUser = registrarUser;
	}
	
	public vista_panel_index getVistaIndex() {
		return VistaIndex;
	}

	public void setVistaIndex(vista_panel_index vistaIndex) {
		VistaIndex = vistaIndex;
	}

	private JMenu getJMenu7() {
		if (jMenu7 == null) {
			jMenu7 = new JMenu();
			jMenu7.setText("Ayuda");
			jMenu7.add(getJMenuItem13());
		}
		return jMenu7;
	}

	private JMenuItem getJMenuItem13() {
		if (jMenuItem13 == null) {
			jMenuItem13 = new JMenuItem();
			jMenuItem13.setText("Acerca de...");
		}
		return jMenuItem13;
	}

	private JMenu getJMenu6() {
		if (jMenu6 == null) {
			jMenu6 = new JMenu();
			jMenu6.setText("Procesar");
			jMenu6.setOpaque(false);
			jMenu6.add(getJMenuItem12());
		}
		return jMenu6;
	}

	private JMenuItem getJMenuItem12() {
		if (jMenuItem12 == null) {
			jMenuItem12 = new JMenuItem();
			jMenuItem12.setText("Dividir Rubros");
		}
		return jMenuItem12;
	}

	private JMenu getJMenu5() {
		if (jMenu5 == null) {
			jMenu5 = new JMenu();
			jMenu5.setText("Auditoria");
			jMenu5.setOpaque(false);
			jMenu5.add(getJMenuItem11());
		}
		return jMenu5;
	}

	private JMenuItem getJMenuItem11() {
		if (jMenuItem11 == null) {
			jMenuItem11 = new JMenuItem();
			jMenuItem11.setText("Mostrar auditoria");
		}
		return jMenuItem11;
	}

	private JMenuItem getJMenuItem10() {
		if (jMenuItem10 == null) {
			jMenuItem10 = new JMenuItem();
			jMenuItem10.setText("Unidad Educativa");
		}
		return jMenuItem10;
	}

	private JMenu getJMenu4() {
		if (jMenu4 == null) {
			jMenu4 = new JMenu();
			jMenu4.setText("Registrar");
			jMenu4.add(getJMenuItem9());
			jMenu4.add(getJMenuItem10());
		}
		return jMenu4;
	}

	private JMenuItem getJMenuItem9() {
		if (jMenuItem9 == null) {
			jMenuItem9 = new JMenuItem();
			jMenuItem9.setText("Rubros");
		}
		return jMenuItem9;
	}

	private JMenuItem getJMenuItem8() {
		if (jMenuItem8 == null) {
			jMenuItem8 = new JMenuItem();
			jMenuItem8.setText("Eliminar Usuario");
		}
		return jMenuItem8;
	}

	private JMenu getJMenu3() {
		if (jMenu3 == null) {
			jMenu3 = new JMenu();
			jMenu3.setText("Actualizar");
			jMenu3.setOpaque(false);
			jMenu3.add(getJMenuItem3());
			jMenu3.add(getJMenuItem5());
			jMenu3.add(getJMenuItem6());
			
		}
		return jMenu3;
	}

	private JMenuItem getJMenuItem6() {
		if (jMenuItem6 == null) {
			jMenuItem6 = new JMenuItem();
			jMenuItem6.setText("Estatus de usuario");
		}
		return jMenuItem6;
	}

	private JMenuItem getJMenuItem5() {
		if (jMenuItem5 == null) {
			jMenuItem5 = new JMenuItem();
			jMenuItem5.setText("Datos de acceso");
		}
		return jMenuItem5;
	}

	private JMenu getJMenu2() {
		if (jMenu2 == null) {
			jMenu2 = new JMenu();
			jMenu2.setText("Respaldo");
			jMenu2.add(getJMenuItem4());
		}
		return jMenu2;
	}

	private JMenuItem getJMenuItem4() {
		if (jMenuItem4 == null) {
			jMenuItem4 = new JMenuItem();
			jMenuItem4.setText("Base de datos");
		}
		return jMenuItem4;
	}

	private JMenuItem getJMenuItem3() {
		if (jMenuItem3 == null) {
			jMenuItem3 = new JMenuItem();
			jMenuItem3.setText("Datos de usuario");
		}
		return jMenuItem3;
	}

	private JMenu getJMenu1() {
		if (jMenu1 == null) {
			jMenu1 = new JMenu();
			jMenu1.setText("Usuario");
			jMenu1.add(getJMenuItem2());
			jMenu1.add(getJMenu3());
			jMenu1.add(getJMenuItem8());
			
		}
		return jMenu1;
	}

	private JMenuItem getJMenuItem2() {
		if (jMenuItem2 == null) {
			jMenuItem2 = new JMenuItem();
			jMenuItem2.setText("Crear usuario");
			jMenuItem2.addActionListener(new ActionListener() {
	
				public void actionPerformed(ActionEvent event) {
					jMenuItem2ActionActionPerformed(event);
				}
			});
		}
		return jMenuItem2;
	}

	private JMenuItem getJMenuItem1() {
		if (jMenuItem1 == null) {
			jMenuItem1 = new JMenuItem();
			jMenuItem1.setText("Cerrar sesión");
			jMenuItem1.addActionListener(new ActionListener() {
	
				public void actionPerformed(ActionEvent event) {
					jMenuItem1ActionActionPerformed(event);
				}
			});
		}
		return jMenuItem1;
	}

	private JMenuBar getJMenuBar0() {
		if (jMenuBar0 == null) {
			jMenuBar0 = new JMenuBar();
			jMenuBar0.add(getJMenu0());
			jMenuBar0.add(getJMenu1());
			jMenuBar0.add(getJMenu6());
			jMenuBar0.add(getJMenu5());
			jMenuBar0.add(getJMenu7());
		}
		return jMenuBar0;
	}

	private JMenu getJMenu0() {
		if (jMenu0 == null) {
			jMenu0 = new JMenu();
			jMenu0.setText("Archivo");
			jMenu0.add(getJMenuItem0());
			jMenu0.add(getJMenu2());
			jMenu0.add(getJMenu4());
			jMenu0.add(getJMenuItem1());
		}
		return jMenu0;
	}

	private JMenuItem getJMenuItem0() {
		if (jMenuItem0 == null) {
			jMenuItem0 = new JMenuItem();
			jMenuItem0.setText("Inicio");
			jMenuItem0.addActionListener(new ActionListener() {
	
				public void actionPerformed(ActionEvent event) {
					jMenuItem0ActionActionPerformed(event);
				}
			});
		}
		return jMenuItem0;
	}

	private static void installLnF() {
		try {
			String lnfClassname = PREFERRED_LOOK_AND_FEEL;
			if (lnfClassname == null)
				lnfClassname = UIManager.getCrossPlatformLookAndFeelClassName();
			UIManager.setLookAndFeel(lnfClassname);
		} catch (Exception e) {
			System.err.println("Cannot install " + PREFERRED_LOOK_AND_FEEL + " on this platform:" + e.getMessage());
		}
	}

	/**
	* Main entry of the class.
	* Note: This class is only created so that you can easily preview the result at runtime.
	* It is not expected to be managed by the designer.
	* You can modify it as you like.
	*/
	public static void main(String[] args) {
		installLnF();
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				vista_menu_principal frame = new vista_menu_principal();
				frame.setDefaultCloseOperation(vista_menu_principal.EXIT_ON_CLOSE);
				frame.setTitle("vista_menu_principal");
				frame.getContentPane().setPreferredSize(frame.getSize());
				frame.pack();
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
			}
		});
	}
	
	private void MostrarPanel(JPanel NuevaVista) {
		if (getVista_panel_actual()!=null) {
			getVista_panel_actual().setVisible(false);
			setVista_panel_actual(NuevaVista);
			NuevaVista.setVisible(true);
		}
	}
	

	private void jMenuItem0ActionActionPerformed(ActionEvent event) {
	
	getApp().cerrarSesion();
	//	System.out.println(Sesion.getSesion().toString());
	//	MostrarPanel(getVistaIndex());	
		
		
	}

	private void jMenuItem1ActionActionPerformed(ActionEvent event) {
	int res=JOptionPane.showConfirmDialog(this,"¿Desea cerrar sesión?", "Cerrar sesión", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
	if (res==JOptionPane.YES_OPTION) {
		getApp().cerrarSesion();
		this.dispose();
		new IniciarController();
	}
	}

	private void jMenuItem2ActionActionPerformed(ActionEvent event) {
		MostrarPanel(getRegistrarUser());
	}

	private void windowWindowClosing(WindowEvent event) {
		int res=JOptionPane.showConfirmDialog(this,"¿Desea salir del sistema?", "Salir del sistema", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
	if (res==JOptionPane.YES_OPTION) {
		getApp().cerrarSesion();
		System.exit(0);
	}
	}

}
