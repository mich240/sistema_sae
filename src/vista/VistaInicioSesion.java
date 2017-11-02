package vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.WindowConstants;
import javax.swing.border.LineBorder;

import org.dyno.visual.swing.layouts.Bilateral;
import org.dyno.visual.swing.layouts.Constraints;
import org.dyno.visual.swing.layouts.GroupLayout;
import org.dyno.visual.swing.layouts.Leading;

import controlador.AppController;
import singleton.Conexion;
import util.StringMD;

//VS4E -- DO NOT REMOVE THIS LINE!
public class VistaInicioSesion extends JFrame {

	private static final long serialVersionUID = 1L;
	private JLabel jLabel0;
	private JLabel jLabel2;
	private JTextField jTextField0;
	private JLabel jLabel1;
	private JPasswordField jPasswordField0;
	private JButton jButton0;
	private JButton jButton1;
	private AppController App;
	private JLabel jLabel3;
	private JPanel jPanel0;
	private static final String PREFERRED_LOOK_AND_FEEL = "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel";
	public VistaInicioSesion() {
		initComponents();
	}

	private void initComponents() {
		setLayout(new GroupLayout());
		add(getJTextField0(), new Constraints(new Leading(132, 160, 10, 10), new Leading(71, 12, 12)));
		add(getJPasswordField0(), new Constraints(new Leading(132, 160, 12, 12), new Leading(107, 12, 12)));
		add(getJLabel2(), new Constraints(new Leading(55, 12, 12), new Leading(113, 10, 111)));
		add(getJLabel1(), new Constraints(new Leading(55, 10, 10), new Leading(77, 10, 147)));
		add(getJButton0(), new Constraints(new Leading(55, 95, 10, 10), new Leading(150, 38, 10, 10)));
		add(getJButton1(), new Constraints(new Leading(197, 95, 10, 10), new Leading(150, 38, 12, 12)));
		add(getJLabel3(), new Constraints(new Bilateral(0, 0, 143), new Leading(203, 10, 10)));
		add(getJLabel0(), new Constraints(new Bilateral(-1, 0, 96), new Leading(21, 10, 10)));
		add(getJPanel0(), new Constraints(new Bilateral(37, 38, 0), new Leading(11, 222, 10, 10)));
		addWindowListener(new WindowAdapter() {
	
			public void windowClosing(WindowEvent event) {
				windowWindowClosing(event);
			}
		});
		setSize(353, 250);
	}

	private JPanel getJPanel0() {
		if (jPanel0 == null) {
			jPanel0 = new JPanel();
			jPanel0.setBorder(new LineBorder(new Color(196, 196, 255), 1, false));
			jPanel0.setLayout(new GroupLayout());
		}
		return jPanel0;
	}

	private JLabel getJLabel3() {
		if (jLabel3 == null) {
			jLabel3 = new JLabel();
			jLabel3.setFont(new Font("Dialog", Font.BOLD, 13));
			jLabel3.setHorizontalAlignment(SwingConstants.CENTER);
			jLabel3.setText("¿Olvidaste tu contraseña?");
			jLabel3.addMouseListener(new MouseAdapter() {
	
				public void mouseEntered(MouseEvent event) {
					jLabel3MouseMouseEntered(event);
				}
	
				public void mouseExited(MouseEvent event) {
					jLabel3MouseMouseExited(event);
				}
	
				public void mouseClicked(MouseEvent event) {
					jLabel3MouseMouseClicked(event);
				}
			});
		}
		return jLabel3;
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
			jButton0.setText("Iniciar");
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
			jPasswordField0.setText("root");
			jPasswordField0.setAutoscrolls(true);
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
			jTextField0.setText("root");
			jTextField0.setAutoscrolls(true);
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
			jLabel0.setFont(new Font("Dialog", Font.BOLD, 15));
			jLabel0.setHorizontalAlignment(SwingConstants.CENTER);
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
				VistaInicioSesion frame = new VistaInicioSesion();
				frame.setDefaultCloseOperation(VistaInicioSesion.EXIT_ON_CLOSE);
				frame.setTitle("vista_InicioSesion");
				frame.getContentPane().setPreferredSize(frame.getSize());
				frame.pack();
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
			}
		});
		
	}

	public void IniciarSesion() {
		if (getApp().iniciarSesion(getJTextField0().getText(),StringMD.Encriptar(new String(getJPasswordField0().getPassword())))) {
			this.dispose();
			getApp().iniciarPrincipal();			
		}
	}
	private void jButton1ActionActionPerformed(ActionEvent event) {
	Conexion.Desconectar();
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

	private void windowWindowClosing(WindowEvent event) {
		Conexion.Desconectar();
		System.exit(0);
	}

	private void jLabel3MouseMouseEntered(MouseEvent event) {
		jLabel3.setText("<html><u>"+jLabel3.getText()+"</u></html>");
		jLabel3.setForeground(Color.BLUE);
	}

	private void jLabel3MouseMouseExited(MouseEvent event) {
		jLabel3.setText("¿Olvidaste tu contraseña?");
		jLabel3.setForeground(Color.BLACK);
	}

	private void jLabel3MouseMouseClicked(MouseEvent event) {
		VistaRecuperarClave vr=new VistaRecuperarClave(this,true);
		vr.setTitle("Recuperar Contraseña.");
		vr.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		vr.setLocationRelativeTo(null);
		vr.setVisible(true);
	}

}
