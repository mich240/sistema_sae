package vista.paneles;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import org.dyno.visual.swing.layouts.Constraints;
import org.dyno.visual.swing.layouts.GroupLayout;
import org.dyno.visual.swing.layouts.Leading;
import org.dyno.visual.swing.layouts.Trailing;

import controlador.AppController;
import modelo.pregunta.PreguntaDao;
import modelo.pregunta.PreguntaModel;
import modelo.tipousuario.TipoUsuarioDao;
import modelo.tipousuario.TipoUsuarioModel;
import modelo.usuario.UsuarioModel;
import singleton.Sesion;
import util.StringMD;
import util.Validation;

//VS4E -- DO NOT REMOVE THIS LINE!
public class VistaPanelRegistrarUsuario extends JPanel {

	private static final long serialVersionUID = 1L;
	private JPanel jPanel0;
	private JLabel jLabel0;
	private JLabel jLabel1;
	private JLabel jLabel2;
	private JLabel jLabel3;
	private JTextField jTextField0;
	private JTextField jTextField1;
	private JTextField jTextField2;
	private JPanel jPanel1;
	private JLabel jLabel4;
	private JLabel jLabel5;
	private JLabel jLabel6;
	private JLabel jLabel7;
	private JLabel jLabel9;
	private JLabel jLabel8;
	private JButton jButton1;
	private JButton jButton0;
	private JTextField jTextField3;
	private JComboBox<Object> jComboBox0;
	private JPasswordField jPasswordField0;
	private JPasswordField jPasswordField1;
	private JComboBox<Object> jComboBox1;
	private JPasswordField jPasswordField2;
	private JPanel jPanel2;
	private AppController app;
	@SuppressWarnings("unused")
	private static final String PREFERRED_LOOK_AND_FEEL = "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel";
	public VistaPanelRegistrarUsuario() {
		initComponents();
		Validation.isNumber(getJTextField0(), 8);
		Validation.isLetter(getJTextField1(), 30);
		Validation.isLetter(getJTextField2(), 30);
		Validation.isAll(getJTextField3(), 15);
		Validation.isAll(getJPasswordField0(), 20);
		Validation.isAll(getJPasswordField1(), 20);
		Validation.isAll(getJPasswordField2(), 20);

	}

	private void initComponents() {
		setLayout(new GroupLayout());
		add(getJLabel0(), new Constraints(new Leading(414, 10, 10), new Leading(23, 10, 10)));
		add(getJPanel0(), new Constraints(new Leading(244, 517, 10, 10), new Leading(61, 171, 10, 10)));
		add(getJButton0(), new Constraints(new Leading(247, 10, 10), new Leading(502, 10, 10)));
		add(getJButton1(), new Constraints(new Leading(642, 117, 10, 10), new Leading(506, 12, 12)));
		add(getJPanel1(), new Constraints(new Leading(242, 517, 12, 12), new Leading(244, 244, 12, 12)));
		add(getJPanel2(), new Constraints(new Leading(20, 980, 10, 10), new Leading(20, 530, 10, 10)));
		setSize(1020, 570);
	}

	public AppController getApp() {
		return app;
	}

	public void setApp(AppController app) {
		this.app = app;
	}

	private JLabel getJLabel0() {
		if (jLabel0 == null) {
			jLabel0 = new JLabel();
			jLabel0.setFont(new Font("DejaVu Sans", Font.BOLD, 15));
			jLabel0.setText("Creación de nuevos usuarios");
		}
		return jLabel0;
	}

	private JPanel getJPanel2() {
		if (jPanel2 == null) {
			jPanel2 = new JPanel();
			jPanel2.setBorder(new LineBorder(new Color(196, 196, 255), 1, false));
			jPanel2.setLayout(new GroupLayout());
			jPanel2.add(getJPanel1(), new Constraints(new Leading(210, 560, 10, 10), new Leading(224, 244, 10, 10)));
			jPanel2.add(getJPanel0(), new Constraints(new Leading(210, 560, 12, 12), new Leading(41, 171, 12, 12)));
			jPanel2.add(getJButton0(), new Constraints(new Leading(210, 10, 10), new Leading(480, 33, 10, 10)));
			jPanel2.add(getJButton1(), new Constraints(new Leading(653, 117, 12, 12), new Leading(480, 33, 12, 12)));
			jPanel2.add(getJLabel0(), new Constraints(new Leading(400, 10, 10), new Leading(5, 10, 10)));
		}
		return jPanel2;
	}

	private JPasswordField getJPasswordField2() {
		if (jPasswordField2 == null) {
			jPasswordField2 = new JPasswordField();
			jPasswordField2.setEchoChar('•');
		}
		return jPasswordField2;
	}

	private JComboBox<Object> getJComboBox1() {
		if (jComboBox1 == null) {
			jComboBox1 = new JComboBox<Object>();
			jComboBox1.setModel(new PreguntaDao().cargarPreguntas());

		}
		return jComboBox1;
	}

	private JPasswordField getJPasswordField1() {
		if (jPasswordField1 == null) {
			jPasswordField1 = new JPasswordField();
			jPasswordField1.setEchoChar('•');
		}
		return jPasswordField1;
	}

	private JPasswordField getJPasswordField0() {
		if (jPasswordField0 == null) {
			jPasswordField0 = new JPasswordField();
			jPasswordField0.setEchoChar('•');
		}
		return jPasswordField0;
	}

	private JComboBox<Object> getJComboBox0() {
		if (jComboBox0 == null) {
			jComboBox0 = new JComboBox<Object>();
			jComboBox0.setModel(new TipoUsuarioDao().cargarTipoUsuarios());
		}
		return jComboBox0;
	}

	private JTextField getJTextField3() {
		if (jTextField3 == null) {
			jTextField3 = new JTextField();
		}
		return jTextField3;
	}

	private JButton getJButton0() {
		if (jButton0 == null) {
			jButton0 = new JButton();
			jButton0.setText("Crear Usuario");
			jButton0.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent event) {
					jButton0ActionActionPerformed(event);
				}
			});
		}
		return jButton0;
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

	private JLabel getJLabel8() {
		if (jLabel8 == null) {
			jLabel8 = new JLabel();
			jLabel8.setText("Pregustan secreta:");
		}
		return jLabel8;
	}

	private JLabel getJLabel9() {
		if (jLabel9 == null) {
			jLabel9 = new JLabel();
			jLabel9.setText("Respuesta secreta:");
		}
		return jLabel9;
	}

	private JLabel getJLabel7() {
		if (jLabel7 == null) {
			jLabel7 = new JLabel();
			jLabel7.setText("Confirmar contraseña:");
		}
		return jLabel7;
	}

	private JLabel getJLabel6() {
		if (jLabel6 == null) {
			jLabel6 = new JLabel();
			jLabel6.setText("Contraseña:");
		}
		return jLabel6;
	}

	private JLabel getJLabel5() {
		if (jLabel5 == null) {
			jLabel5 = new JLabel();
			jLabel5.setText("Tipo de Usuario:");
		}
		return jLabel5;
	}

	private JLabel getJLabel4() {
		if (jLabel4 == null) {
			jLabel4 = new JLabel();
			jLabel4.setText("Usuario:");
		}
		return jLabel4;
	}

	private JPanel getJPanel1() {
		if (jPanel1 == null) {
			jPanel1 = new JPanel();
			jPanel1.setBorder(BorderFactory.createTitledBorder(null, "Datos del usuario", TitledBorder.LEADING, TitledBorder.DEFAULT_POSITION,
					new Font("Dialog", Font.BOLD, 12), new Color(51, 51, 51)));
			jPanel1.setLayout(new GroupLayout());
			jPanel1.add(getJTextField3(), new Constraints(new Leading(180, 240, 10, 10), new Leading(-2, 10, 10)));
			jPanel1.add(getJPasswordField0(), new Constraints(new Leading(180, 240, 10, 10), new Leading(69, 27, 10, 108)));
			jPanel1.add(getJPasswordField1(), new Constraints(new Leading(180, 240, 10, 10), new Leading(103, 10, 74)));
			jPanel1.add(getJPasswordField2(), new Constraints(new Leading(180, 240, 12, 12), new Leading(173, 12, 12)));
			jPanel1.add(getJComboBox1(), new Constraints(new Leading(180, 240, 12, 12), new Leading(136, 31, 12, 12)));
			jPanel1.add(getJComboBox0(), new Constraints(new Leading(180, 240, 12, 12), new Leading(30, 30, 12, 12)));
			jPanel1.add(getJLabel4(), new Constraints(new Leading(35, 10, 10), new Leading(3, 16, 10, 184)));
			jPanel1.add(getJLabel5(), new Constraints(new Leading(35, 10, 10), new Leading(37, 16, 10, 150)));
			jPanel1.add(getJLabel6(), new Constraints(new Leading(35, 10, 10), new Leading(74, 16, 12, 12)));
			jPanel1.add(getJLabel8(), new Constraints(new Leading(35, 158, 12, 12), new Leading(144, 16, 12, 12)));
			jPanel1.add(getJLabel9(), new Constraints(new Leading(35, 147, 10, 10), new Leading(178, 16, 10, 9)));
			jPanel1.add(getJLabel7(), new Constraints(new Leading(35, 147, 10, 10), new Leading(108, 16, 10, 79)));
		}
		return jPanel1;
	}

	private JTextField getJTextField2() {
		if (jTextField2 == null) {
			jTextField2 = new JTextField();
		}
		return jTextField2;
	}

	private JTextField getJTextField1() {
		if (jTextField1 == null) {
			jTextField1 = new JTextField();
		}
		return jTextField1;
	}

	private JTextField getJTextField0() {
		if (jTextField0 == null) {
			jTextField0 = new JTextField();
		}
		return jTextField0;
	}

	private JLabel getJLabel3() {
		if (jLabel3 == null) {
			jLabel3 = new JLabel();
			jLabel3.setText("Apellido:");
		}
		return jLabel3;
	}

	private JLabel getJLabel2() {
		if (jLabel2 == null) {
			jLabel2 = new JLabel();
			jLabel2.setText("Nombre:");
		}
		return jLabel2;
	}

	private JLabel getJLabel1() {
		if (jLabel1 == null) {
			jLabel1 = new JLabel();
			jLabel1.setText("Cedula:");
		}
		return jLabel1;
	}

	private JPanel getJPanel0() {
		if (jPanel0 == null) {
			jPanel0 = new JPanel();
			jPanel0.setBorder(BorderFactory.createTitledBorder(null, "Datos personales", TitledBorder.LEADING, TitledBorder.DEFAULT_POSITION,
					new Font("Dialog", Font.BOLD, 12), new Color(51, 51, 51)));
			jPanel0.setLayout(new GroupLayout());
			jPanel0.add(getJTextField0(), new Constraints(new Leading(180, 241, 10, 10), new Leading(16, 10, 10)));
			jPanel0.add(getJTextField1(), new Constraints(new Leading(180, 241, 10, 10), new Leading(51, 10, 10)));
			jPanel0.add(getJTextField2(), new Constraints(new Leading(180, 241, 10, 10), new Trailing(12, 91, 91)));
			jPanel0.add(getJLabel3(), new Constraints(new Leading(40, 10, 10), new Trailing(19, 15, 10, 97)));
			jPanel0.add(getJLabel2(), new Constraints(new Leading(39, 10, 10), new Trailing(57, 12, 12)));
			jPanel0.add(getJLabel1(), new Constraints(new Leading(37, 10, 10), new Leading(22, 15, 10, 95)));
		}
		return jPanel0;
	}

	private void jButton1ActionActionPerformed(ActionEvent event) {

		Validation.restoreField(jTextField0, jTextField1, jTextField2, jTextField3, jPasswordField0, jPasswordField1,
				jPasswordField2, jComboBox0, jComboBox1);

	}

	private void jButton0ActionActionPerformed(ActionEvent event) {
		// jComboBox0.getModel().setSelectedItem(p);

		if (Validation.field(jTextField0, jTextField1, jTextField2, jTextField3, jComboBox0, jComboBox1,
				jPasswordField0, jPasswordField1, jPasswordField2)) {

			if (new String(jPasswordField0.getPassword()).equals(new String(jPasswordField1.getPassword()))) {

				if (Sesion.confirmarClave(this)) {
					UsuarioModel newUser = new UsuarioModel();
					newUser.setCedula(Integer.parseInt(getJTextField0().getText()));
					newUser.setNombre(getJTextField1().getText());
					newUser.setApellido(getJTextField2().getText());
					newUser.setUsuario(getJTextField3().getText());
					newUser.setTipoUsuario(((TipoUsuarioModel) getJComboBox0().getSelectedItem()).getId());
					newUser.setClave(StringMD.Encriptar(new String(getJPasswordField0().getPassword())));
					newUser.setPregunta(((PreguntaModel) getJComboBox1().getSelectedItem()).getId());
					newUser.setRespuesta(StringMD.Encriptar(new String(getJPasswordField2().getPassword())));

					if (getApp().registrarUsuario(newUser)) {
						JOptionPane.showMessageDialog(this, "usuario registrado correctamente.", "Registro exitoso.",
								JOptionPane.INFORMATION_MESSAGE);
						Validation.restoreField(jTextField0, jTextField1, jTextField2, jTextField3, jPasswordField0,
								jPasswordField1, jPasswordField2, jComboBox0, jComboBox1);
					}

				}

			} else
				JOptionPane.showMessageDialog(this, "Las contraseñas no coinciden.", "No coinciden",
						JOptionPane.ERROR_MESSAGE);

		}

	}

}
