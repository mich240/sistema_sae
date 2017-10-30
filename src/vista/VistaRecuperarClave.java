package vista;

import java.awt.Color;
import java.awt.Dialog;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GraphicsConfiguration;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import org.dyno.visual.swing.layouts.Bilateral;
import org.dyno.visual.swing.layouts.Constraints;
import org.dyno.visual.swing.layouts.GroupLayout;
import org.dyno.visual.swing.layouts.Leading;

import modelo.usuario.UsuarioDao;
import util.StringMD;
import util.Validation;

//VS4E -- DO NOT REMOVE THIS LINE!
public class VistaRecuperarClave extends JDialog {

	private static final long serialVersionUID = 1L;
	private JLabel jLabel0;
	private JLabel jLabel1;
	private JTextField jTextField0;
	private JButton jButton0;
	private JLabel jLabel2;
	private JPasswordField jPasswordField0;
	private JButton jButton1;
	private JLabel jLabel3;
	private JPasswordField jPasswordField1;
	private JPasswordField jPasswordField2;
	private JButton jButton2;
	private JLabel jLabel4;
	private static final String PREFERRED_LOOK_AND_FEEL = "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel";

	public VistaRecuperarClave(Window parent) {
		super(parent);
		initComponents();
	}

	public VistaRecuperarClave(Dialog parent, String title, boolean modal, GraphicsConfiguration arg) {
		super(parent, title, modal, arg);
		initComponents();
	}

	public VistaRecuperarClave(Dialog parent, String title, boolean modal) {
		super(parent, title, modal);
		initComponents();
	}

	public VistaRecuperarClave(Dialog parent, String title) {
		super(parent, title);
		initComponents();
	}

	public VistaRecuperarClave(Window parent, String title, ModalityType modalityType, GraphicsConfiguration arg) {
		super(parent, title, modalityType, arg);
		initComponents();
	}

	public VistaRecuperarClave(Window parent, String title, ModalityType modalityType) {
		super(parent, title, modalityType);
		initComponents();
	}

	public VistaRecuperarClave(Window parent, String title) {
		super(parent, title);
		initComponents();
	}

	public VistaRecuperarClave(Window parent, ModalityType modalityType) {
		super(parent, modalityType);
		initComponents();
	}

	public VistaRecuperarClave(Frame parent, String title) {
		super(parent, title);
		initComponents();
	}

	public VistaRecuperarClave(Frame parent, boolean modal) {
		super(parent, modal);
		initComponents();
	}

	public VistaRecuperarClave(Frame parent) {
		super(parent);
		initComponents();
	}

	public VistaRecuperarClave() {
		initComponents();
	}

	public VistaRecuperarClave(Dialog parent, boolean modal) {
		super(parent, modal);
		initComponents();
	}

	public VistaRecuperarClave(Dialog parent) {
		super(parent);
		initComponents();
	}

	public VistaRecuperarClave(Frame parent, String title, boolean modal, GraphicsConfiguration arg) {
		super(parent, title, modal, arg);
		initComponents();
	}

	public VistaRecuperarClave(Frame parent, String title, boolean modal) {
		super(parent, title, modal);
		initComponents();
	}

	private void initComponents() {
		setForeground(Color.black);
		setFont(new Font("Dialog", Font.PLAIN, 12));
		setLayout(new GroupLayout());
		add(getJLabel0(), new Constraints(new Leading(120, 10, 10), new Leading(20, 10, 10)));
		add(getJLabel1(), new Constraints(new Leading(47, 10, 10), new Leading(68, 10, 10)));
		add(getJTextField0(), new Constraints(new Leading(51, 186, 12, 12), new Leading(92, 10, 10)));
		add(getJButton0(), new Constraints(new Leading(250, 92, 10, 10), new Leading(92, 10, 10)));
		add(getJLabel2(), new Constraints(new Bilateral(0, 0, 41), new Leading(135, 24, 10, 10)));
		add(getJPasswordField0(), new Constraints(new Leading(51, 186, 12, 12), new Leading(168, 10, 10)));
		add(getJButton1(), new Constraints(new Leading(252, 92, 10, 10), new Leading(168, 12, 12)));
		add(getJLabel3(), new Constraints(new Bilateral(0, 0, 41), new Leading(214, 24, 12, 12)));
		add(getJPasswordField1(), new Constraints(new Leading(51, 286, 10, 10), new Leading(244, 12, 12)));
		add(getJLabel4(), new Constraints(new Leading(0, 388, 12, 12), new Leading(282, 24, 12, 12)));
		add(getJPasswordField2(), new Constraints(new Leading(51, 286, 10, 63), new Leading(312, 10, 10)));
		add(getJButton2(), new Constraints(new Leading(158, 12, 12), new Leading(356, 10, 10)));
		setSize(400, 443);
	}

	private JLabel getJLabel4() {
		if (jLabel4 == null) {
			jLabel4 = new JLabel();
			jLabel4.setFont(new Font("Dialog", Font.BOLD, 12));
			jLabel4.setHorizontalAlignment(SwingConstants.CENTER);
			jLabel4.setText("Confirmar contraseña:");
		}
		return jLabel4;
	}

	private JButton getJButton2() {
		if (jButton2 == null) {
			jButton2 = new JButton();
			jButton2.setText("Guardar");
			jButton2.setEnabled(false);
			jButton2.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent event) {
					jButton2ActionActionPerformed(event);
				}
			});
		}
		return jButton2;
	}

	private JPasswordField getJPasswordField2() {
		if (jPasswordField2 == null) {
			jPasswordField2 = new JPasswordField();
			jPasswordField2.setAutoscrolls(true);
			jPasswordField2.setEnabled(false);
			jPasswordField2.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent event) {
					jPasswordField2ActionActionPerformed(event);
				}
			});
		}
		return jPasswordField2;
	}

	private JPasswordField getJPasswordField1() {
		if (jPasswordField1 == null) {
			jPasswordField1 = new JPasswordField();
			jPasswordField1.setAutoscrolls(true);
			jPasswordField1.setEnabled(false);
			jPasswordField1.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent event) {
					jPasswordField1ActionActionPerformed(event);
				}
			});
		}
		return jPasswordField1;
	}

	private JLabel getJLabel3() {
		if (jLabel3 == null) {
			jLabel3 = new JLabel();
			jLabel3.setFont(new Font("Dialog", Font.BOLD, 12));
			jLabel3.setHorizontalAlignment(SwingConstants.CENTER);
			jLabel3.setText("Ingrese su nueva contraseña:");
		}
		return jLabel3;
	}

	private JButton getJButton1() {
		if (jButton1 == null) {
			jButton1 = new JButton();
			jButton1.setText("Verificar");
			jButton1.setEnabled(false);
			jButton1.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent event) {
					jButton1ActionActionPerformed(event);
				}
			});
		}
		return jButton1;
	}

	private JPasswordField getJPasswordField0() {
		if (jPasswordField0 == null) {
			jPasswordField0 = new JPasswordField();
			jPasswordField0.setAutoscrolls(true);
			jPasswordField0.setEnabled(false);
			jPasswordField0.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent event) {
					jPasswordField0ActionActionPerformed(event);
				}
			});
		}
		return jPasswordField0;
	}

	private JLabel getJLabel2() {
		if (jLabel2 == null) {
			jLabel2 = new JLabel();
			jLabel2.setFont(new Font("Dialog", Font.BOLD, 12));
			jLabel2.setHorizontalAlignment(SwingConstants.CENTER);
			jLabel2.setText("");
		}
		return jLabel2;
	}

	private JButton getJButton0() {
		if (jButton0 == null) {
			jButton0 = new JButton();
			jButton0.setText("Buscar");
			jButton0.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent event) {
					jButton0ActionActionPerformed(event);
				}
			});
		}
		return jButton0;
	}

	private JTextField getJTextField0() {
		if (jTextField0 == null) {
			jTextField0 = new JTextField();
			jTextField0.setAutoscrolls(true);
			jTextField0.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent event) {
					jTextField0ActionActionPerformed(event);
				}
			});
		}
		return jTextField0;
	}

	private JLabel getJLabel1() {
		if (jLabel1 == null) {
			jLabel1 = new JLabel();
			jLabel1.setText("Ingrese su nombre de usuario:");
		}
		return jLabel1;
	}

	private JLabel getJLabel0() {
		if (jLabel0 == null) {
			jLabel0 = new JLabel();
			jLabel0.setFont(new Font("Dialog", Font.BOLD, 15));
			jLabel0.setText("Recuperar contraseña");
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
	 * Main entry of the class. Note: This class is only created so that you can
	 * easily preview the result at runtime. It is not expected to be managed by the
	 * designer. You can modify it as you like.
	 */
	public static void main(String[] args) {
		installLnF();
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				VistaRecuperarClave dialog = new VistaRecuperarClave();
				dialog.setDefaultCloseOperation(VistaRecuperarClave.DISPOSE_ON_CLOSE);
				dialog.setTitle("RecuperarClave");
				dialog.setLocationRelativeTo(null);
				dialog.getContentPane().setPreferredSize(dialog.getSize());
				dialog.pack();
				dialog.setVisible(true);
			}
		});
	}

	private void jButton0ActionActionPerformed(ActionEvent event) {
		if (Validation.field(jTextField0)) {
			UsuarioDao useD = new UsuarioDao();
			String respuesta = useD.recuperarPregunta(jTextField0.getText());
			if (respuesta == null) {
				JOptionPane.showMessageDialog(this, "No se encontro el usuario.", "Error", JOptionPane.ERROR_MESSAGE);
			} else {
				jLabel2.setText(respuesta);
				jButton0.setEnabled(false);
				jTextField0.setEnabled(false);
				// ---------------------------
				jPasswordField0.setEnabled(true);
				jButton1.setEnabled(true);

			}
		}
	}

	private void jButton1ActionActionPerformed(ActionEvent event) {

		if (Validation.field(jPasswordField0)) {
			UsuarioDao useD = new UsuarioDao();
			if (useD.comprobarRespuesta(jTextField0.getText(),
					StringMD.Encriptar(new String(jPasswordField0.getPassword())))) {
				jButton1.setEnabled(false);
				jPasswordField0.setEnabled(false);
				// --------------------------------
				jButton2.setEnabled(true);
				jPasswordField1.setEnabled(true);
				jPasswordField2.setEnabled(true);
			} else
				JOptionPane.showMessageDialog(this, "Respuesta incorrecta.", "Incorrecto", JOptionPane.ERROR_MESSAGE);
		}

	}

	private void jButton2ActionActionPerformed(ActionEvent event) {
		if (Validation.field(jPasswordField1, jPasswordField2)) {
			if (new String(jPasswordField1.getPassword()).equals(new String(jPasswordField2.getPassword()))) {
				UsuarioDao useD = new UsuarioDao();
				if (useD.cambiarClave(jTextField0.getText(),
						StringMD.Encriptar(new String(jPasswordField1.getPassword())))) {
					JOptionPane.showMessageDialog(this, "Contraseña cambiada satisfactoriamente.", "Correcto",
							JOptionPane.INFORMATION_MESSAGE);
					this.dispose();
				}
			} else
				JOptionPane.showMessageDialog(this, "Las contraseñas no coinciden.", "Error",
						JOptionPane.ERROR_MESSAGE);
		}

	}

	private void jTextField0ActionActionPerformed(ActionEvent event) {
		jButton0.doClick();
	}

	private void jPasswordField0ActionActionPerformed(ActionEvent event) {
		jButton1.doClick();
	}

	private void jPasswordField1ActionActionPerformed(ActionEvent event) {
		jButton2.doClick();
	}

	private void jPasswordField2ActionActionPerformed(ActionEvent event) {
		jButton2.doClick();
	}

}
