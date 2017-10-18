package vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import org.dyno.visual.swing.layouts.Constraints;
import org.dyno.visual.swing.layouts.GroupLayout;
import org.dyno.visual.swing.layouts.Leading;

import controlador.AppController;

//VS4E -- DO NOT REMOVE THIS LINE!
public class vista_InicioSesion extends JFrame {

	private static final long serialVersionUID = 1L;
	private JLabel jLabel0;
	private JLabel jLabel2;
	private JTextField jTextField0;
	private JLabel jLabel1;
	private JPasswordField jPasswordField0;
	private JButton jButton0;
	private JButton jButton1;
	private AppController App;
	private static final String PREFERRED_LOOK_AND_FEEL = "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel";
	public vista_InicioSesion() {
		initComponents();
	}

	private void initComponents() {
		setLayout(new GroupLayout());
		add(getJLabel0(), new Constraints(new Leading(139, 10, 10), new Leading(28, 10, 10)));
		add(getJTextField0(), new Constraints(new Leading(132, 160, 10, 10), new Leading(71, 12, 12)));
		add(getJPasswordField0(), new Constraints(new Leading(132, 160, 12, 12), new Leading(107, 12, 12)));
		add(getJButton1(), new Constraints(new Leading(207, 12, 12), new Leading(150, 12, 12)));
		add(getJButton0(), new Constraints(new Leading(55, 10, 10), new Leading(150, 12, 12)));
		add(getJLabel2(), new Constraints(new Leading(49, 12, 12), new Leading(113, 12, 12)));
		add(getJLabel1(), new Constraints(new Leading(51, 10, 10), new Leading(77, 12, 12)));
		setSize(353, 240);
	}

	public AppController getApp() {
		return App;
	}

	public void setApp(AppController app) {
		App = app;
	}

	private JButton getJButton1() {
		if (jButton1 == null) {
			jButton1 = new JButton();
			jButton1.setText("Cancelar");
			jButton1.addActionListener(new ActionListener() {
	
				public void actionPerformed(ActionEvent event) {
					jButton1ActionActionPerformed(event);
				}
			});
		}
		return jButton1;
	}

	private JButton getJButton0() {
		if (jButton0 == null) {
			jButton0 = new JButton();
			jButton0.setText("Aceptar");
			jButton0.addActionListener(new ActionListener() {
	
				public void actionPerformed(ActionEvent event) {
					jButton0ActionActionPerformed(event);
				}
			});
		}
		return jButton0;
	}

	private JPasswordField getJPasswordField0() {
		if (jPasswordField0 == null) {
			jPasswordField0 = new JPasswordField();
			jPasswordField0.setEchoChar('•');
			jPasswordField0.addActionListener(new ActionListener() {
	
				public void actionPerformed(ActionEvent event) {
					jPasswordField0ActionActionPerformed(event);
				}
			});
		}
		return jPasswordField0;
	}

	private JLabel getJLabel1() {
		if (jLabel1 == null) {
			jLabel1 = new JLabel();
			jLabel1.setText("Usuario:");
		}
		return jLabel1;
	}

	private JTextField getJTextField0() {
		if (jTextField0 == null) {
			jTextField0 = new JTextField();
			jTextField0.addActionListener(new ActionListener() {
	
				public void actionPerformed(ActionEvent event) {
					jTextField0ActionActionPerformed(event);
				}
			});
		}
		return jTextField0;
	}

	private JLabel getJLabel2() {
		if (jLabel2 == null) {
			jLabel2 = new JLabel();
			jLabel2.setText("Contraseña:");
		}
		return jLabel2;
	}

	private JLabel getJLabel0() {
		if (jLabel0 == null) {
			jLabel0 = new JLabel();
			jLabel0.setText("Iniciar Sesión");
		}
		return jLabel0;
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
				vista_InicioSesion frame = new vista_InicioSesion();
				frame.setDefaultCloseOperation(vista_InicioSesion.EXIT_ON_CLOSE);
				frame.setTitle("vista_InicioSesion");
				frame.getContentPane().setPreferredSize(frame.getSize());
				frame.pack();
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
			}
		});
		
	}

	public void IniciarSesion() {
		if (getApp().IniciarSesion(getJTextField0().getText(),new String(getJPasswordField0().getPassword()))) {
			this.dispose();
			getApp().iniciarPrincipal();
		}
	}
	private void jButton1ActionActionPerformed(ActionEvent event) {
	System.exit(0);
	}

	private void jButton0ActionActionPerformed(ActionEvent event) {		
		IniciarSesion();
	}

	private void jTextField0ActionActionPerformed(ActionEvent event) {
		IniciarSesion();
	}

	private void jPasswordField0ActionActionPerformed(ActionEvent event) {
		IniciarSesion();
	}

}
