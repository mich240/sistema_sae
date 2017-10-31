package vista.paneles;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import org.dyno.visual.swing.layouts.Constraints;
import org.dyno.visual.swing.layouts.GroupLayout;
import org.dyno.visual.swing.layouts.Leading;

import controlador.AppController;
import controlador.IniciarController;
import modelo.tipousuario.TipoUsuarioDao;
import modelo.tipousuario.TipoUsuarioModel;
import modelo.usuario.UsuarioDao;
import singleton.Sesion;
import util.Metodos;
import util.Validation;

//VS4E -- DO NOT REMOVE THIS LINE!
public class VistaListarUsuarios extends JPanel {

	private static final long serialVersionUID = 1L;
	private JLabel jLabel0;
	private JPanel jPanel0;
	private JPanel jPanel1;
	private AppController app;
	private JTable jTable0;
	private JScrollPane jScrollPane0;
	private JButton jButton0;
	private JButton jButton1;
	private JLabel jLabel1;
	private JLabel jLabel2;
	private JLabel jLabel3;
	private JLabel jLabel4;
	private JComboBox<Object> jComboBox0;
	private JLabel jLabel5;
	private JLabel jLabel6;
	private JButton jButton2;
	private JSeparator jSeparator0;
	@SuppressWarnings("unused")
	private static final String PREFERRED_LOOK_AND_FEEL = "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel";
	public VistaListarUsuarios() {
		initComponents();		
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
			jSeparator0.setOrientation(SwingConstants.VERTICAL);
		}
		return jSeparator0;
	}

	private JButton getJButton2() {
		if (jButton2 == null) {
			jButton2 = new JButton();
			jButton2.setText("Cambiar");
			jButton2.setEnabled(false);
			jButton2.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent event) {
					jButton2ActionActionPerformed(event);
				}
			});
		}
		return jButton2;
	}

	private JLabel getJLabel6() {
		if (jLabel6 == null) {
			jLabel6 = new JLabel();
			jLabel6.setHorizontalAlignment(SwingConstants.CENTER);
			jLabel6.setText("Seleccione");
		}
		return jLabel6;
	}

	private JLabel getJLabel5() {
		if (jLabel5 == null) {
			jLabel5 = new JLabel();
			jLabel5.setFont(new Font("SansSerif", Font.BOLD, 12));
			jLabel5.setHorizontalAlignment(SwingConstants.CENTER);
			jLabel5.setText("Status:");
		}
		return jLabel5;
	}

	private JComboBox<Object> getJComboBox0() {
		if (jComboBox0 == null) {
			jComboBox0 = new JComboBox<Object>();
			jComboBox0.setModel(new TipoUsuarioDao().cargarTipoUsuarios());
		}
		return jComboBox0;
	}

	private JLabel getJLabel4() {
		if (jLabel4 == null) {
			jLabel4 = new JLabel();
			jLabel4.setFont(new Font("SansSerif", Font.BOLD, 12));
			jLabel4.setHorizontalAlignment(SwingConstants.CENTER);
			jLabel4.setText("Tipo de usuario:");
		}
		return jLabel4;
	}

	private JLabel getJLabel3() {
		if (jLabel3 == null) {
			jLabel3 = new JLabel();
			jLabel3.setHorizontalAlignment(SwingConstants.CENTER);
			jLabel3.setText("Seleccione");
		}
		return jLabel3;
	}

	private JLabel getJLabel2() {
		if (jLabel2 == null) {
			jLabel2 = new JLabel();
			jLabel2.setFont(new Font("SansSerif", Font.BOLD, 12));
			jLabel2.setHorizontalAlignment(SwingConstants.CENTER);
			jLabel2.setText("Usuario:");
		}
		return jLabel2;
	}

	private JLabel getJLabel1() {
		if (jLabel1 == null) {
			jLabel1 = new JLabel();
			jLabel1.setFont(new Font("SansSerif", Font.BOLD, 12));
			jLabel1.setText("Datos del usuario:");
		}
		return jLabel1;
	}

	private JButton getJButton1() {
		if (jButton1 == null) {
			jButton1 = new JButton();
			jButton1.setText("reincorporar");
			jButton1.setEnabled(false);
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
			jButton0.setText("desincorporar ");
			jButton0.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent event) {
					jButton0ActionActionPerformed(event);
				}
			});
		}
		return jButton0;
	}

	private JScrollPane getJScrollPane0() {
		if (jScrollPane0 == null) {
			jScrollPane0 = new JScrollPane();
			jScrollPane0.setViewportView(getJTable0());
		}
		return jScrollPane0;
	}

	private JTable getJTable0() {
		if (jTable0 == null) {
			jTable0 = new JTable();
			jTable0.setToolTipText("Haga click para seleccionar un usuario.");
			jTable0.addMouseListener(new MouseAdapter() {

				public void mouseClicked(MouseEvent event) {
					jTable0MouseMouseClicked(event);
				}
			});
		}
		return jTable0;
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
			jPanel1.add(getJLabel0(), new Constraints(new Leading(428, 10, 10), new Leading(18, 10, 10)));
			jPanel1.add(getJPanel0(), new Constraints(new Leading(62, 857, 10, 10), new Leading(100, 364, 10, 10)));
		}
		return jPanel1;
	}

	private JPanel getJPanel0() {
		if (jPanel0 == null) {
			jPanel0 = new JPanel();
			jPanel0.setBorder(BorderFactory.createTitledBorder(null, "Tabla de usuarios registrados en el sistema.", TitledBorder.LEADING,
					TitledBorder.DEFAULT_POSITION, new Font("SansSerif", Font.BOLD, 12), new Color(59, 59, 59)));
			jPanel0.setLayout(new GroupLayout());
			jPanel0.add(getJLabel3(), new Constraints(new Leading(501, 127, 10, 10), new Leading(68, 10, 238)));
			jPanel0.add(getJLabel2(), new Constraints(new Leading(501, 127, 10, 10), new Leading(44, 10, 262)));
			jPanel0.add(getJLabel5(), new Constraints(new Leading(501, 127, 12, 12), new Leading(130, 10, 10)));
			jPanel0.add(getJLabel6(), new Constraints(new Leading(501, 127, 12, 12), new Leading(154, 10, 10)));
			jPanel0.add(getJButton2(), new Constraints(new Leading(751, 81, 12, 12), new Leading(108, 12, 12)));
			jPanel0.add(getJComboBox0(), new Constraints(new Leading(640, 192, 12, 12), new Leading(61, 30, 10, 10)));
			jPanel0.add(getJScrollPane0(), new Constraints(new Leading(7, 478, 12, 12), new Leading(25, 277, 12, 12)));
			jPanel0.add(getJLabel1(), new Constraints(new Leading(586, 10, 10), new Leading(-3, 12, 12)));
			jPanel0.add(getJSeparator0(), new Constraints(new Leading(632, 17, 12, 12), new Leading(25, 236, 12, 12)));
			jPanel0.add(getJButton1(), new Constraints(new Leading(503, 120, 12, 12), new Leading(200, 10, 10)));
			jPanel0.add(getJLabel4(), new Constraints(new Leading(632, 208, 12, 12), new Leading(44, 12, 12)));
			jPanel0.add(getJButton0(), new Constraints(new Leading(503, 120, 10, 206), new Leading(229, 10, 10)));
		}
		return jPanel0;
	}

	private JLabel getJLabel0() {
		if (jLabel0 == null) {
			jLabel0 = new JLabel();
			jLabel0.setFont(new Font("Dialog", Font.BOLD, 15));
			jLabel0.setText("Lista de usuarios");
		}
		return jLabel0;
	}

	public void cargarTablaUsuarios() {
		getJTable0().setModel(new UsuarioDao().recuperarTodosUsuariosTable());
		getJTable0().getColumnModel().getColumn(4).setPreferredWidth(130);
		Metodos.formatearTabla(getJTable0());
		restablecerTodo();
	}

	private void restablecerTodo() {
		jComboBox0.setSelectedIndex(0);
		jLabel3.setText("Seleccione");
		jLabel6.setText("Seleccione");
		jButton0.setEnabled(false);
		jButton1.setEnabled(false);
		jButton2.setEnabled(false);
		jLabel6.setForeground(Color.black);
		jLabel6.setFont(new Font("SansSerif", Font.PLAIN, 12));
	}

	private void cambiaBotones(boolean estado) {
		jButton0.setEnabled(estado);
		jButton1.setEnabled(!estado);
	}

	private void jTable0MouseMouseClicked(MouseEvent event) {

		getJLabel3().setText(getJTable0().getValueAt(jTable0.getSelectedRow(), 0).toString());
		getJComboBox0().getModel()
				.setSelectedItem(((TipoUsuarioModel) jTable0.getValueAt(jTable0.getSelectedRow(), 4)));
		getJLabel6().setText(getJTable0().getValueAt(jTable0.getSelectedRow(), 5).toString());

		getJLabel6().setFont(new Font("SansSerif", Font.BOLD, 12));
		getJButton2().setEnabled(true);
		if (getJLabel6().getText().trim().equals("Activo")) {
			getJLabel6().setForeground(Color.BLUE);
			cambiaBotones(true);
		} else {
			getJLabel6().setForeground(Color.RED);
			cambiaBotones(false);
		}

	}

	private void jButton0ActionActionPerformed(ActionEvent event) {
		if (jTable0.getSelectedRowCount() > 0) {
			if (JOptionPane.showConfirmDialog(this,
					"Desincorporar un usuario implica que no podra ser usado en el sistema, ¿desea realizar esta acción?",
					"Verifique", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
				String usuarioSeleccionado = jTable0.getValueAt(jTable0.getSelectedRow(), 0).toString().trim();
				if (Sesion.confirmarClaveOtroUsuario(this, usuarioSeleccionado)) {				

					if (getApp().desincorporarUsuario(usuarioSeleccionado)) {
						if (Sesion.getSesion().getUsuario().trim().equals(usuarioSeleccionado)) {
							JOptionPane.showMessageDialog(this,
									"Ha desactivado al usuario actual, el sistema esta obligado a cerrar sesión. ",
									"Cerrar sesión", JOptionPane.INFORMATION_MESSAGE);
							getApp().cerrarSesion();
							getApp().getMp().dispose();
							new IniciarController();
						} else
							JOptionPane.showMessageDialog(this,
									"El usuario seleccionado esta ahora desincorporado del sistema.", "Correcto",
									JOptionPane.INFORMATION_MESSAGE);
						cargarTablaUsuarios();
					}
				}
			}
		}
	}

	private void jButton1ActionActionPerformed(ActionEvent event) {
		if (jTable0.getSelectedRowCount() > 0) {
			if (JOptionPane.showConfirmDialog(this,
					"Este usuario fue desincorporado por alguna razón, ¿en verdad desea realizar esta acción?",
					"Verifique", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
				String usuarioSeleccionado = jTable0.getValueAt(jTable0.getSelectedRow(), 0).toString().trim();
				if (Sesion.confirmarClaveOtroUsuario(this, usuarioSeleccionado)) {	
					if (getApp().reIncorporarUsuario(usuarioSeleccionado)) {
						JOptionPane.showMessageDialog(this, "El usuario ha sido reincorporado al sistema.", "Correcto",
								JOptionPane.INFORMATION_MESSAGE);
						cargarTablaUsuarios();
					}
				}
			}
		}
	}

	private void jButton2ActionActionPerformed(ActionEvent event) {
		if (jTable0.getSelectedRowCount() > 0) {
			String privilegoActual = jTable0.getValueAt(jTable0.getSelectedRow(), 4).toString();
			if (Validation.field(jComboBox0)) {
				if (jTable0.getValueAt(jTable0.getSelectedRow(), 5).toString().trim().equals("Activo")) {
					if (privilegoActual.equals(jComboBox0.getSelectedItem().toString())) {
						JOptionPane.showMessageDialog(this, "No puede actualizar al mismo tipo de usuario.",
								"Verifique", JOptionPane.INFORMATION_MESSAGE);
					} else {

						if (JOptionPane.showConfirmDialog(this,
								"¿Seguro que desea cambiar los privilegios de este usuario?", "Verifique",
								JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
							String usuarioSeleccionado = jTable0.getValueAt(jTable0.getSelectedRow(), 0).toString()
									.trim();
							
								
									if(Sesion.confirmarClaveOtroUsuario(this, usuarioSeleccionado)) {							
								if (getApp().actualizaTipoUsuario(usuarioSeleccionado,
										((TipoUsuarioModel) jComboBox0.getSelectedItem()).getId())) {

									if (Sesion.getSesion().getUsuario().trim().equals(usuarioSeleccionado)) {
										JOptionPane.showMessageDialog(this,
												"Ha cambiado el privilegio del usuario actual, el sistema esta obligado a cerrar sesión ",
												"Cerrar sesión", JOptionPane.INFORMATION_MESSAGE);
										getApp().cerrarSesion();
										getApp().getMp().dispose();
										new IniciarController();
									} else
										JOptionPane.showMessageDialog(this,
												"El tipo de usuario fue cambiaro correctamente.", "Correcto",
												JOptionPane.INFORMATION_MESSAGE);
									cargarTablaUsuarios();
								}
							}
							
						}

					}
				} else
					JOptionPane.showMessageDialog(this, "No se puede actualizar los privilegios de un usuario inactivo",
							"Cuidado", JOptionPane.WARNING_MESSAGE);

			}
		}

	}
	public void aplicarRestriccion(){
		Sesion.restringeVisible(jButton0);
		Sesion.restringeVisible(jButton1);
		Sesion.restringeVisible(jButton2);
		Sesion.restringeEnable(jComboBox0);
	}

}
