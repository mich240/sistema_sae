package vista.paneles;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import org.dyno.visual.swing.layouts.Constraints;
import org.dyno.visual.swing.layouts.GroupLayout;
import org.dyno.visual.swing.layouts.Leading;

import controlador.AppController;
import modelo.usuario.UsuarioModel;
import singleton.Sesion;
import util.Validation;

//VS4E -- DO NOT REMOVE THIS LINE!
public class VistaDatosUsuario extends JPanel {

	private static final long serialVersionUID = 1L;
	private JLabel jLabel0;
	private JPanel jPanel0;
	private JLabel jLabel1;
	private JTextField jTextField0;
	private JButton jButton0;
	private JPanel jPanel1;
	private AppController app;
	private JLabel jLabel2;
	private JLabel jLabel3;
	private JLabel jLabel4;
	private JTextField jTextField1;
	private JTextField jTextField2;
	private JTextField jTextField3;
	private JButton jButton1;
	@SuppressWarnings("unused")
	private static final String PREFERRED_LOOK_AND_FEEL = "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel";
	public VistaDatosUsuario() {
		initComponents();
		Validation.isNumber(jTextField1, 8);
		Validation.isLetter(jTextField2, 30);
		Validation.isLetter(jTextField3, 30);

	}

	private void initComponents() {
		setLayout(new GroupLayout());
		add(getJLabel0(), new Constraints(new Leading(414, 10, 10), new Leading(52, 10, 10)));
		add(getJPanel0(), new Constraints(new Leading(237, 527, 10, 10), new Leading(111, 236, 10, 10)));
		add(getJPanel1(), new Constraints(new Leading(20, 980, 10, 10), new Leading(20, 530, 10, 10)));
		setSize(1020, 570);
	}

	private JButton getJButton1() {
		if (jButton1 == null) {
			jButton1 = new JButton();
			jButton1.setText("Limpiar");
			jButton1.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent event) {
					jButton1ActionActionPerformed(event);
				}
			});
		}
		return jButton1;
	}

	private JTextField getJTextField3() {
		if (jTextField3 == null) {
			jTextField3 = new JTextField();
			jTextField3.setAutoscrolls(true);
		}
		return jTextField3;
	}

	private JTextField getJTextField2() {
		if (jTextField2 == null) {
			jTextField2 = new JTextField();
			jTextField2.setAutoscrolls(true);
		}
		return jTextField2;
	}

	private JTextField getJTextField1() {
		if (jTextField1 == null) {
			jTextField1 = new JTextField();
			jTextField1.setAutoscrolls(true);
		}
		return jTextField1;
	}

	private JLabel getJLabel4() {
		if (jLabel4 == null) {
			jLabel4 = new JLabel();
			jLabel4.setText("Apellido:");
		}
		return jLabel4;
	}

	private JLabel getJLabel3() {
		if (jLabel3 == null) {
			jLabel3 = new JLabel();
			jLabel3.setText("Nombre:");
		}
		return jLabel3;
	}

	private JLabel getJLabel2() {
		if (jLabel2 == null) {
			jLabel2 = new JLabel();
			jLabel2.setText("Cedula:");
		}
		return jLabel2;
	}

	public AppController getApp() {
		return app;
	}

	public void setApp(AppController app) {
		this.app = app;
	}

	private JPanel getJPanel1() {
		if (jPanel1 == null) {
			jPanel1 = new JPanel();
			jPanel1.setBorder(new LineBorder(new Color(196, 196, 255), 1, false));
			jPanel1.setLayout(new GroupLayout());
			jPanel1.add(getJPanel0(), new Constraints(new Leading(210, 560, 10, 10), new Leading(100, 283, 10, 10)));
			jPanel1.add(getJButton1(), new Constraints(new Leading(685, 85, 12, 12), new Leading(393, 36, 10, 10)));
			jPanel1.add(getJLabel0(), new Constraints(new Leading(399, 10, 10), new Leading(20, 10, 10)));
			jPanel1.add(getJButton0(), new Constraints(new Leading(210, 95, 10, 10), new Leading(393, 36, 10, 10)));
		}
		return jPanel1;
	}

	private JButton getJButton0() {
		if (jButton0 == null) {
			jButton0 = new JButton();
			jButton0.setText("Actualizar");
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
			jTextField0.setEditable(false);
		}
		return jTextField0;
	}

	private JLabel getJLabel1() {
		if (jLabel1 == null) {
			jLabel1 = new JLabel();
			jLabel1.setText("Usuario:");
		}
		return jLabel1;
	}

	private JPanel getJPanel0() {
		if (jPanel0 == null) {
			jPanel0 = new JPanel();
			jPanel0.setBorder(BorderFactory.createTitledBorder(null, "Actualice sus datos:", TitledBorder.LEADING,
					TitledBorder.DEFAULT_POSITION, new Font("SansSerif", Font.BOLD, 12), new Color(59, 59, 59)));
			jPanel0.setLayout(new GroupLayout());
			jPanel0.add(getJLabel1(), new Constraints(new Leading(75, 10, 10), new Leading(48, 16, 10, 202)));
			jPanel0.add(getJTextField0(), new Constraints(new Leading(170, 228, 10, 10), new Leading(42, 28, 10, 196)));
			jPanel0.add(getJLabel2(), new Constraints(new Leading(75, 47, 10, 10), new Leading(94, 16, 10, 156)));
			jPanel0.add(getJLabel3(), new Constraints(new Leading(75, 64, 10, 10), new Leading(137, 16, 10, 113)));
			jPanel0.add(getJButton0(), new Constraints(new Leading(85, 85, 10, 10), new Leading(223, 10, 10)));
			jPanel0.add(getJTextField1(), new Constraints(new Leading(170, 228, 10, 10), new Leading(88, 28, 12, 12)));
			jPanel0.add(getJTextField2(),
					new Constraints(new Leading(170, 228, 10, 10), new Leading(131, 28, 10, 107)));
			jPanel0.add(getJLabel4(), new Constraints(new Leading(75, 64, 10, 10), new Leading(186, 16, 10, 64)));
			jPanel0.add(getJTextField3(), new Constraints(new Leading(170, 228, 12, 12), new Leading(180, 28, 10, 10)));
		}
		return jPanel0;
	}

	private JLabel getJLabel0() {
		if (jLabel0 == null) {
			jLabel0 = new JLabel();
			jLabel0.setFont(new Font("Dialog", Font.BOLD, 15));
			jLabel0.setText("Actualizar datos de usuario");
		}
		return jLabel0;
	}

	public void cargarDatosActivo() {
		jTextField0.setText(Sesion.getSesion().getUsuario());
		jTextField1.setText(String.valueOf(Sesion.getSesion().getCedula()));
		jTextField2.setText(Sesion.getSesion().getNombre());
		jTextField3.setText(Sesion.getSesion().getApellido());
	}

	private void jButton0ActionActionPerformed(ActionEvent event) {

		if (Validation.field(jTextField0, jTextField1, jTextField2, jTextField3)) {
			
			if (JOptionPane.showConfirmDialog(this, "¿Esta seguro que los datos son correctos?", "Actualiza",
					JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
				
				if (Sesion.confirmarClave(this)) {
					UsuarioModel user = new UsuarioModel();
					user.setUsuario(jTextField0.getText());
					user.setCedula(Integer.parseInt(jTextField1.getText()));
					user.setNombre(jTextField2.getText());
					user.setApellido(jTextField3.getText());

					if (getApp().actualizarUsuario(user)) {
						JOptionPane.showMessageDialog(this, "Datos actualizados correctamente.", "Datos actualizados",
								JOptionPane.INFORMATION_MESSAGE);
						Sesion.getSesion().refresh();
					}
				}
			}
		}

	}

	private void jButton1ActionActionPerformed(ActionEvent event) {
		Validation.restoreField(jTextField1, jTextField2, jTextField3);
	}

}
