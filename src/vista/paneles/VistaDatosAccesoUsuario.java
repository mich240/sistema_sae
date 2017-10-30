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
import javax.swing.JSeparator;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import org.dyno.visual.swing.layouts.Constraints;
import org.dyno.visual.swing.layouts.GroupLayout;
import org.dyno.visual.swing.layouts.Leading;

import controlador.AppController;
import modelo.pregunta.PreguntaDao;
import modelo.pregunta.PreguntaModel;
import modelo.usuario.UsuarioModel;
import singleton.Sesion;
import util.StringMD;
import util.validation;

//VS4E -- DO NOT REMOVE THIS LINE!
public class VistaDatosAccesoUsuario extends JPanel {

	private static final long serialVersionUID = 1L;
	private JLabel jLabel0;
	private JPanel jPanel0;
	private JLabel jLabel1;
	private JButton jButton0;
	private JPanel jPanel1;
	private AppController app;
	private JLabel jLabel2;
	private JLabel jLabel3;
	private JLabel jLabel4;
	private JButton jButton1;
	private JComboBox<Object> jComboBox0;
	private JPasswordField jPasswordField0;
	private JPasswordField jPasswordField1;
	private JPasswordField jPasswordField2;
	private JSeparator jSeparator0;
	@SuppressWarnings("unused")
	private static final String PREFERRED_LOOK_AND_FEEL = "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel";

	public VistaDatosAccesoUsuario() {
		initComponents();
		validation.isAll(jPasswordField0, 20);
		validation.isAll(jPasswordField1, 20);
		validation.isAll(jPasswordField2, 20);
	}

	private void initComponents() {
		setLayout(new GroupLayout());
		add(getJLabel0(), new Constraints(new Leading(414, 10, 10), new Leading(52, 10, 10)));
		add(getJPanel0(), new Constraints(new Leading(237, 527, 10, 10), new Leading(111, 236, 10, 10)));
		add(getJPanel1(), new Constraints(new Leading(20, 980, 10, 10), new Leading(20, 530, 10, 10)));
		setSize(1020, 570);
	}

	private JSeparator getJSeparator0() {
		if (jSeparator0 == null) {
			jSeparator0 = new JSeparator();
		}
		return jSeparator0;
	}

	private JPasswordField getJPasswordField2() {
		if (jPasswordField2 == null) {
			jPasswordField2 = new JPasswordField();
			jPasswordField2.setAutoscrolls(true);
		}
		return jPasswordField2;
	}

	private JPasswordField getJPasswordField1() {
		if (jPasswordField1 == null) {
			jPasswordField1 = new JPasswordField();
			jPasswordField1.setAutoscrolls(true);
		}
		return jPasswordField1;
	}

	private JPasswordField getJPasswordField0() {
		if (jPasswordField0 == null) {
			jPasswordField0 = new JPasswordField();
			jPasswordField0.setAutoscrolls(true);
		}
		return jPasswordField0;
	}

	private JComboBox<Object> getJComboBox0() {
		if (jComboBox0 == null) {
			jComboBox0 = new JComboBox<Object>();
			jComboBox0.setModel(new PreguntaDao().cargarPreguntas());
		}
		return jComboBox0;
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

	private JLabel getJLabel4() {
		if (jLabel4 == null) {
			jLabel4 = new JLabel();
			jLabel4.setText("Confirmar contraseña:");
		}
		return jLabel4;
	}

	private JLabel getJLabel3() {
		if (jLabel3 == null) {
			jLabel3 = new JLabel();
			jLabel3.setText("Contraseña:");
		}
		return jLabel3;
	}

	private JLabel getJLabel2() {
		if (jLabel2 == null) {
			jLabel2 = new JLabel();
			jLabel2.setText("Respuesta secreta:");
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
			jPanel1.add(getJButton0(), new Constraints(new Leading(210, 85, 10, 10), new Leading(393, 36, 10, 10)));
			jPanel1.add(getJButton1(), new Constraints(new Leading(685, 85, 12, 12), new Leading(393, 36, 10, 10)));
			jPanel1.add(getJLabel0(), new Constraints(new Leading(358, 10, 10), new Leading(17, 10, 10)));
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

	private JLabel getJLabel1() {
		if (jLabel1 == null) {
			jLabel1 = new JLabel();
			jLabel1.setText("Pregunta secreta:");
		}
		return jLabel1;
	}

	private JPanel getJPanel0() {
		if (jPanel0 == null) {
			jPanel0 = new JPanel();
			jPanel0.setBorder(BorderFactory.createTitledBorder(null, "Actualice sus datos de acceso:",
					TitledBorder.LEADING, TitledBorder.DEFAULT_POSITION, new Font("SansSerif", Font.BOLD, 12),
					new Color(59, 59, 59)));
			jPanel0.setLayout(new GroupLayout());
			jPanel0.add(getJLabel1(), new Constraints(new Leading(23, 12, 12), new Leading(45, 10, 10)));
			jPanel0.add(getJLabel2(), new Constraints(new Leading(23, 122, 10, 10), new Leading(94, 12, 12)));
			jPanel0.add(getJLabel4(), new Constraints(new Leading(23, 135, 12, 12), new Leading(186, 12, 12)));
			jPanel0.add(getJComboBox0(), new Constraints(new Leading(152, 272, 12, 12), new Leading(35, 36, 10, 170)));
			jPanel0.add(getJPasswordField0(),
					new Constraints(new Leading(152, 272, 12, 12), new Leading(88, 28, 10, 125)));
			jPanel0.add(getJPasswordField2(),
					new Constraints(new Leading(152, 272, 10, 10), new Leading(180, 28, 10, 33)));
			jPanel0.add(getJLabel3(), new Constraints(new Leading(23, 100, 12, 12), new Leading(146, 12, 12)));
			jPanel0.add(getJPasswordField1(),
					new Constraints(new Leading(152, 272, 12, 12), new Leading(140, 28, 10, 73)));
			jPanel0.add(getJSeparator0(), new Constraints(new Leading(21, 489, 10, 10), new Leading(132, 10, 10, 10)));
		}
		return jPanel0;
	}

	private JLabel getJLabel0() {
		if (jLabel0 == null) {
			jLabel0 = new JLabel();
			jLabel0.setFont(new Font("Dialog", Font.BOLD, 15));
			jLabel0.setText("Actualizar datos de acceso del usuario");
		}
		return jLabel0;
	}

	public void cargarDatosAccesoActivo() {	
		jComboBox0.getModel().setSelectedItem(new PreguntaDao().recuperarPreguntaUsuario(Sesion.getSesion().getPregunta()));
		jPasswordField0.setText(Sesion.getSesion().getRespusta());
	}

	private void jButton0ActionActionPerformed(ActionEvent event) {

		if (validation.field(jComboBox0, jPasswordField0, jPasswordField1, jPasswordField2)) {

			if (new String(jPasswordField1.getPassword()).equals(new String(jPasswordField2.getPassword()))) {

				if (JOptionPane.showConfirmDialog(this, "¿Esta seguro que los datos son correctos?", "Actualiza",
						JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {

					if (Sesion.confirmarClave(this)) {

						UsuarioModel user = new UsuarioModel();
						user.setUsuario(Sesion.getSesion().getUsuario());
						user.setPregunta(((PreguntaModel) jComboBox0.getSelectedItem()).getId());
						user.setClave(StringMD.Encriptar(new String(jPasswordField1.getPassword())));

						if (new String(jPasswordField0.getPassword()).equals(Sesion.getSesion().getRespusta())) {
							user.setRespuesta(Sesion.getSesion().getRespusta());
						} else
							user.setRespuesta(StringMD.Encriptar(new String(jPasswordField0.getPassword())));

						if (getApp().actualizarDatosAccesoUsuario(user)) {
							JOptionPane.showMessageDialog(this, "Datos actualizados correctamente.",
									"Datos actualizados", JOptionPane.INFORMATION_MESSAGE);
							Sesion.getSesion().refresh();
							validation.restoreField(jPasswordField1,jPasswordField2);
						}
					}
				}
			} else
				JOptionPane.showMessageDialog(this, "Las contraseñas no coinciden.", "No coinciden",
						JOptionPane.ERROR_MESSAGE);
		}

	}

	private void jButton1ActionActionPerformed(ActionEvent event) {
		validation.restoreField(jPasswordField1,jPasswordField2);
	}

}
