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
import modelo.rubro.RubroDao;
import util.Metodos;
import util.Validation;

//VS4E -- DO NOT REMOVE THIS LINE!
public class VistaListaRubros extends JPanel {

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
	@SuppressWarnings("unused")
	private static final String PREFERRED_LOOK_AND_FEEL = "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel";

	public VistaListaRubros() {
		initComponents();
	}

	private void initComponents() {
		setLayout(new GroupLayout());
		add(getJLabel0(), new Constraints(new Leading(414, 10, 10), new Leading(52, 10, 10)));
		add(getJPanel0(), new Constraints(new Leading(237, 527, 10, 10), new Leading(111, 236, 10, 10)));
		add(getJPanel1(), new Constraints(new Leading(20, 980, 10, 10), new Leading(20, 530, 10, 10)));
		setSize(1020, 570);
	}

	private JButton getJButton2() {
		if (jButton2 == null) {
			jButton2 = new JButton();
			jButton2.setText("Cambiar");
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
			jLabel5.setText("Cambiar nombre del rubro:");
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
			jLabel4.setText("Remover rubro de la lista:");
		}
		return jLabel4;
	}

	private JLabel getJLabel3() {
		if (jLabel3 == null) {
			jLabel3 = new JLabel();
			jLabel3.setHorizontalAlignment(SwingConstants.CENTER);
			jLabel3.setText("Agregar nuevo rubro:");
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
			jPanel1.add(getJLabel0(), new Constraints(new Leading(388, 10, 10), new Leading(20, 10, 10)));
			jPanel1.add(getJPanel0(), new Constraints(new Leading(210, 560, 10, 10), new Leading(65, 416, 10, 10)));
		}
		return jPanel1;
	}

	private JPanel getJPanel0() {
		if (jPanel0 == null) {
			jPanel0 = new JPanel();
			jPanel0.setBorder(BorderFactory.createTitledBorder(null, "Tabla de rubros.", TitledBorder.LEADING,
					TitledBorder.DEFAULT_POSITION, new Font("SansSerif", Font.BOLD, 12), new Color(59, 59, 59)));
			jPanel0.setLayout(new GroupLayout());
			jPanel0.add(getJLabel2(), new Constraints(new Leading(298, 247, 10, 10), new Leading(5, 12, 12)));
			jPanel0.add(getJLabel3(), new Constraints(new Leading(298, 246, 12, 12), new Leading(53, 10, 10)));
			jPanel0.add(getJLabel4(), new Constraints(new Leading(298, 246, 12, 12), new Leading(114, 12, 12)));
			jPanel0.add(getJButton1(), new Constraints(new Leading(366, 110, 10, 56), new Leading(137, 10, 10)));
			jPanel0.add(getJSeparator0(), new Constraints(new Leading(298, 243, 10, 10), new Leading(105, 10, 10, 10)));
			jPanel0.add(getJSeparator1(), new Constraints(new Leading(298, 243, 12, 12), new Leading(176, 10, 12, 12)));
			jPanel0.add(getJLabel5(), new Constraints(new Leading(298, 246, 12, 12), new Leading(185, 12, 12)));
			jPanel0.add(getJButton2(), new Constraints(new Leading(366, 110, 10, 56), new Leading(210, 10, 10)));
			jPanel0.add(getJButton0(), new Constraints(new Leading(366, 110, 10, 56), new Leading(69, 12, 12)));
			jPanel0.add(getJScrollPane0(), new Constraints(new Leading(-1, 302, 10, 10), new Leading(5, 364, 12, 12)));
		}
		return jPanel0;
	}

	private JLabel getJLabel0() {
		if (jLabel0 == null) {
			jLabel0 = new JLabel();
			jLabel0.setFont(new Font("DejaVu Sans", Font.BOLD, 15));
			jLabel0.setText("Lista de rubros del sistema");
		}
		return jLabel0;
	}

	public void cargarTablaRubro() {
		jTable0.setModel(new RubroDao().recuperaTodosRubroTabla());
		jTable0.getColumnModel().getColumn(1).setPreferredWidth(350);
		Metodos.estilizarTabla(jTable0);
	}

	private void jButton0ActionActionPerformed(ActionEvent event) {
		String producto = JOptionPane.showInputDialog(this, "Ingrese el nombre del producto.", "Ingrese nombre.",
				JOptionPane.INFORMATION_MESSAGE);

		if (Metodos.validaTextoMsj(producto)) {
			getApp().registrarRubro(producto.toUpperCase());
			cargarTablaRubro();
		} else
			JOptionPane.showMessageDialog(this, "No ha ingresado nada.", "Cuidado", JOptionPane.INFORMATION_MESSAGE);
	}

	private void jButton1ActionActionPerformed(ActionEvent event) {
		if (jTable0.getSelectedRowCount() > 0) {
			String valorEscogido = jTable0.getValueAt(jTable0.getSelectedRow(), 1).toString();
			int valorCodigo = (int) jTable0.getValueAt(jTable0.getSelectedRow(), 0);

			if (JOptionPane.showConfirmDialog(this,
					"¿Seguro que desea remover este producto \"" + valorEscogido + "\" de la lista?", "Remover.",
					JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
				getApp().removerRubro(valorCodigo);
				cargarTablaRubro();
			}
		} else
			JOptionPane.showMessageDialog(this, "Seleccione un rubro en la tabla.", "Seleccione.",
					JOptionPane.WARNING_MESSAGE);

	}

	private void jButton2ActionActionPerformed(ActionEvent event) {
		if (jTable0.getSelectedRowCount() > 0) {
			String valorEscogido = jTable0.getValueAt(jTable0.getSelectedRow(), 1).toString();
			int valorCodigo = (int) jTable0.getValueAt(jTable0.getSelectedRow(), 0);
			JTextField miCampoEdit = new JTextField();
			miCampoEdit.setText(valorEscogido);

			Object[] modifica = { "Ingrese el nuevo nombre:", miCampoEdit };
			if (JOptionPane.showConfirmDialog(this, modifica, "Cambiar.", JOptionPane.YES_NO_OPTION,
					JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {

				// String producto = JOptionPane.conf(this, "Ingrese el nuevo nombre del
				// producto.", "Ingrese nombre.",
				// JOptionPane.INFORMATION_MESSAGE);

				// if (Metodos.validaTextoMsj(producto)) {
				if (Validation.field(miCampoEdit)) {
					getApp().modificaRubro(valorCodigo, miCampoEdit.getText().toUpperCase());
					cargarTablaRubro();
				}

			}

		} else
			JOptionPane.showMessageDialog(this, "Seleccione un rubro en la tabla.", "Seleccione.",
					JOptionPane.WARNING_MESSAGE);

	}
}
