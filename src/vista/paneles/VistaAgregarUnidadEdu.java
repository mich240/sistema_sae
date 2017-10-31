package vista.paneles;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import org.dyno.visual.swing.layouts.Constraints;
import org.dyno.visual.swing.layouts.GroupLayout;
import org.dyno.visual.swing.layouts.Leading;

import controlador.AppController;
import modelo.unidadeducativa.UnidadEducativaDao;
import singleton.Sesion;
import util.Metodos;
import util.Validation;

//VS4E -- DO NOT REMOVE THIS LINE!
public class VistaAgregarUnidadEdu extends JPanel {

	private static final long serialVersionUID = 1L;
	private JLabel jLabel0;
	private JPanel jPanel0;
	private JPanel jPanel1;
	private AppController app;
	private JTable jTable0;
	private JScrollPane jScrollPane0;
	private JLabel jLabel2;
	private JButton jButton0;
	private JButton jButton1;
	private JLabel jLabel3;
	private JLabel jLabel4;
	private JSeparator jSeparator0;
	private JSeparator jSeparator1;
	private JLabel jLabel5;
	private JButton jButton2;
	private JButton jButton3;
	private JLabel jLabel1;
	private JLabel jLabel6;
	private JLabel jLabel7;
	private JLabel jLabel8;
	private static final String PREFERRED_LOOK_AND_FEEL = "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel";
	public VistaAgregarUnidadEdu() {
		initComponents();
	}

	private void initComponents() {
		setLayout(new GroupLayout());
		add(getJLabel0(), new Constraints(new Leading(414, 10, 10), new Leading(52, 10, 10)));
		add(getJPanel0(), new Constraints(new Leading(237, 527, 10, 10), new Leading(111, 236, 10, 10)));
		add(getJPanel1(), new Constraints(new Leading(20, 980, 10, 10), new Leading(20, 530, 10, 10)));
		setSize(1020, 570);
	}

	private JLabel getJLabel8() {
		if (jLabel8 == null) {
			jLabel8 = new JLabel();
			jLabel8.setHorizontalAlignment(SwingConstants.LEFT);
			jLabel8.setText("");
		}
		return jLabel8;
	}

	private JLabel getJLabel7() {
		if (jLabel7 == null) {
			jLabel7 = new JLabel();
			jLabel7.setHorizontalAlignment(SwingConstants.LEFT);
			jLabel7.setText("");
		}
		return jLabel7;
	}

	private JLabel getJLabel6() {
		if (jLabel6 == null) {
			jLabel6 = new JLabel();
			jLabel6.setFont(new Font("Dialog", Font.BOLD, 12));
			jLabel6.setHorizontalAlignment(SwingConstants.LEFT);
			jLabel6.setText("Nombre:");
		}
		return jLabel6;
	}

	private JLabel getJLabel1() {
		if (jLabel1 == null) {
			jLabel1 = new JLabel();
			jLabel1.setFont(new Font("Dialog", Font.BOLD, 12));
			jLabel1.setHorizontalAlignment(SwingConstants.LEFT);
			jLabel1.setText("Codigo DEA:");
		}
		return jLabel1;
	}

	private JButton getJButton3() {
		if (jButton3 == null) {
			jButton3 = new JButton();
			jButton3.setText("Designar");
			jButton3.setToolTipText(
					"Designar implica ser la unidad educativa predeterminada a la cual llegaran los rubros.");
			jButton3.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent event) {
					jButton3ActionActionPerformed(event);
				}
			});
		}
		return jButton3;
	}

	private JButton getJButton2() {
		if (jButton2 == null) {
			jButton2 = new JButton();
			jButton2.setText("Modificar");
			jButton2.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent event) {
					jButton2ActionActionPerformed(event);
				}
			});
		}
		return jButton2;
	}

	private JLabel getJLabel5() {
		if (jLabel5 == null) {
			jLabel5 = new JLabel();
			jLabel5.setHorizontalAlignment(SwingConstants.CENTER);
			jLabel5.setText("Modificar unidad educativa:");
		}
		return jLabel5;
	}

	private JSeparator getJSeparator1() {
		if (jSeparator1 == null) {
			jSeparator1 = new JSeparator();
		}
		return jSeparator1;
	}

	private JSeparator getJSeparator0() {
		if (jSeparator0 == null) {
			jSeparator0 = new JSeparator();
		}
		return jSeparator0;
	}

	private JLabel getJLabel4() {
		if (jLabel4 == null) {
			jLabel4 = new JLabel();
			jLabel4.setHorizontalAlignment(SwingConstants.CENTER);
			jLabel4.setText("Remover unidad educativa:");
		}
		return jLabel4;
	}

	private JLabel getJLabel3() {
		if (jLabel3 == null) {
			jLabel3 = new JLabel();
			jLabel3.setHorizontalAlignment(SwingConstants.CENTER);
			jLabel3.setText("Agregar nueva unidad educativa:");
		}
		return jLabel3;
	}

	private JButton getJButton1() {
		if (jButton1 == null) {
			jButton1 = new JButton();
			jButton1.setText("Remover");
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
			jButton0.setText("Agregar");
			jButton0.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent event) {
					jButton0ActionActionPerformed(event);
				}
			});
		}
		return jButton0;
	}

	private JLabel getJLabel2() {
		if (jLabel2 == null) {
			jLabel2 = new JLabel();
			jLabel2.setFont(new Font("DejaVu Sans", Font.BOLD, 12));
			jLabel2.setHorizontalAlignment(SwingConstants.CENTER);
			jLabel2.setText("Acciones:");
		}
		return jLabel2;
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
			jPanel1.add(getJPanel0(), new Constraints(new Leading(210, 560, 10, 10), new Leading(65, 416, 10, 10)));
			jPanel1.add(getJLabel0(), new Constraints(new Leading(377, 10, 10), new Leading(20, 10, 10)));
		}
		return jPanel1;
	}

	private JPanel getJPanel0() {
		if (jPanel0 == null) {
			jPanel0 = new JPanel();
			jPanel0.setBorder(BorderFactory.createTitledBorder(null, "Tabla de todas las UE registradas.", TitledBorder.LEADING, TitledBorder.DEFAULT_POSITION,
					new Font("SansSerif", Font.BOLD, 12), new Color(59, 59, 59)));
			jPanel0.setLayout(new GroupLayout());
			jPanel0.add(getJLabel2(), new Constraints(new Leading(298, 247, 10, 10), new Leading(5, 12, 12)));
			jPanel0.add(getJLabel3(), new Constraints(new Leading(298, 246, 12, 12), new Leading(53, 10, 10)));
			jPanel0.add(getJLabel4(), new Constraints(new Leading(298, 246, 12, 12), new Leading(114, 12, 12)));
			jPanel0.add(getJButton1(), new Constraints(new Leading(366, 110, 10, 56), new Leading(137, 10, 10)));
			jPanel0.add(getJSeparator0(), new Constraints(new Leading(298, 243, 10, 10), new Leading(104, 10, 10, 10)));
			jPanel0.add(getJSeparator1(), new Constraints(new Leading(299, 243, 12, 12), new Leading(176, 10, 12, 12)));
			jPanel0.add(getJLabel5(), new Constraints(new Leading(298, 246, 12, 12), new Leading(185, 12, 12)));
			jPanel0.add(getJButton2(), new Constraints(new Leading(366, 110, 10, 56), new Leading(210, 10, 10)));
			jPanel0.add(getJButton0(), new Constraints(new Leading(366, 110, 10, 56), new Leading(69, 12, 12)));
			jPanel0.add(getJScrollPane0(), new Constraints(new Leading(0, 302, 10, 10), new Leading(103, 266, 12, 12)));
			jPanel0.add(getJLabel7(), new Constraints(new Leading(88, 214, 12, 12), new Leading(21, 10, 10)));
			jPanel0.add(getJLabel8(), new Constraints(new Leading(88, 214, 12, 12), new Leading(52, 12, 12)));
			jPanel0.add(getJLabel1(), new Constraints(new Leading(0, 88, 10, 10), new Leading(21, 10, 10)));
			jPanel0.add(getJLabel6(), new Constraints(new Leading(0, 88, 12, 12), new Leading(52, 12, 12)));
			jPanel0.add(getJButton3(), new Constraints(new Leading(206, 92, 10, 10), new Leading(74, 12, 12)));
		}
		return jPanel0;
	}

	private JLabel getJLabel0() {
		if (jLabel0 == null) {
			jLabel0 = new JLabel();
			jLabel0.setFont(new Font("Dialog", Font.BOLD, 15));
			jLabel0.setText("Unidades educativas del sistema");
		}
		return jLabel0;
	}

	private void jButton0ActionActionPerformed(ActionEvent event) {
		JTextField codDea = new JTextField();
		JTextField nombre = new JTextField();

		Object confirm[] = { "Por favor ingrese los datos necesarios, si\n"
				+ "no conoce el codigo DEA puede colocar \"0\"\n" + "\n Codigo DEA:", codDea,
				"\n Nombre de unidad educativa:", nombre };
		if (JOptionPane.showOptionDialog(this, confirm, "Ingrese los datos necesarios", JOptionPane.YES_NO_OPTION,
				JOptionPane.QUESTION_MESSAGE, null, new Object[] { "Aceptar", "Cancelar" },
				null) == JOptionPane.YES_OPTION) {
			if (Validation.field(codDea, nombre)) {

				getApp().registrarUnidadEducativa(
						codDea.getText().trim().equals("0") ? "NO DISPONIBLE" : codDea.getText().toUpperCase(),
						nombre.getText().toUpperCase());
				cargarTablaUedu();
			}
		}
	}

	private void jButton1ActionActionPerformed(ActionEvent event) {
		if (jTable0.getSelectedRowCount() > 0) {
			String valorEscogido = jTable0.getValueAt(jTable0.getSelectedRow(), 2).toString();
			int valorCodigo = (int) jTable0.getValueAt(jTable0.getSelectedRow(), 0);

			if (JOptionPane.showConfirmDialog(this,
					"¿Seguro que desea remover esta unidad educativa \"" + valorEscogido + "\" de la lista?",
					"Remover.", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
				getApp().removerUnidadEducativa(valorCodigo);
				cargarTablaUedu();
			}
		} else
			JOptionPane.showMessageDialog(this, "Seleccione una unidad educativa de la lista.", "Seleccione.",
					JOptionPane.WARNING_MESSAGE);

	}

	private void jButton2ActionActionPerformed(ActionEvent event) {
		if (jTable0.getSelectedRowCount() > 0) {
			int valorCodigo = (int) jTable0.getValueAt(jTable0.getSelectedRow(), 0);
			String valorCodDea = jTable0.getValueAt(jTable0.getSelectedRow(), 1).toString();
			String valorNombre = jTable0.getValueAt(jTable0.getSelectedRow(), 2).toString();

			JTextField campoDea = new JTextField();
			campoDea.setText(valorCodDea);
			JTextField campoNombre = new JTextField();
			campoNombre.setText(valorNombre);

			Object modifica[] = { "Por favor ingrese los datos necesarios, si\n"
					+ "no conoce el codigo DEA puede colocar \"0\"\n" + "\n Codigo DEA:", campoDea,
					"\n Nombre de unidad educativa:", campoNombre };
			if (JOptionPane.showOptionDialog(this, modifica, "Cambiar.", JOptionPane.YES_NO_OPTION,
					JOptionPane.QUESTION_MESSAGE, null, new Object[] { "Aceptar", "Cancelar" },
					null) == JOptionPane.YES_OPTION) {

				// String producto = JOptionPane.conf(this, "Ingrese el nuevo nombre del
				// producto.", "Ingrese nombre.",
				// JOptionPane.INFORMATION_MESSAGE);

				// if (Metodos.validaTextoMsj(producto)) {
				if (Validation.field(campoDea, campoNombre)) {
					boolean modificarTodo = true;
					if (valorNombre.trim().equals(campoNombre.getText().trim())) {
						modificarTodo = false;
					}
					getApp().modificarUnidadEducativa(modificarTodo, valorCodigo,
							campoDea.getText().trim().equals("0") ? "NO DISPONIBLE" : campoDea.getText().toUpperCase(),
							campoNombre.getText().toUpperCase());
					cargarTablaUedu();
				}

			}

		} else
			JOptionPane.showMessageDialog(this, "Seleccione una unidad educativa en la tabla.", "Seleccione.",
					JOptionPane.WARNING_MESSAGE);
	}

	public void cargarTablaUedu() {
		jTable0.setModel(new UnidadEducativaDao().recuperarTodoUnidadEduTabla());
		jTable0.getColumnModel().getColumn(0).setPreferredWidth(45);
		Metodos.formatearTabla(jTable0);
		jButton3.setEnabled(false);
	}

	private void jTable0MouseMouseClicked(MouseEvent event) {
		if (jTable0.getSelectedRowCount() > 0) {
			String valorCodDea = jTable0.getValueAt(jTable0.getSelectedRow(), 1).toString();
			String valorNombre = jTable0.getValueAt(jTable0.getSelectedRow(), 2).toString();
			jLabel7.setText(valorCodDea);
			jLabel8.setText(valorNombre);
			jButton3.setEnabled(true);
		}
	}

	public void aplicarRestriccion() {
		Sesion.restringeVisible(jButton3);
	}

	private void jButton3ActionActionPerformed(ActionEvent event) {
		if (jTable0.getSelectedRowCount() > 0) {
			String valorEscogido = jTable0.getValueAt(jTable0.getSelectedRow(), 2).toString();
			int valorCodigo = (int) jTable0.getValueAt(jTable0.getSelectedRow(), 0);

			if (JOptionPane.showConfirmDialog(this,
					"¿Seguro que desea designar la unidad educativa \"" + valorEscogido + "\" como predeterminada?",
					"Designar.", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
				if (Sesion.confirmarClave(this)) {
					getApp().designarUnidadEducativa(valorCodigo);
					cargarTablaUedu();
				}

			}
		} else
			JOptionPane.showMessageDialog(this, "Seleccione una unidad educativa de la lista.", "Seleccione.",
					JOptionPane.WARNING_MESSAGE);

	}
}
