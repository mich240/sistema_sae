package vista.paneles;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Date;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import org.dyno.visual.swing.layouts.Bilateral;
import org.dyno.visual.swing.layouts.Constraints;
import org.dyno.visual.swing.layouts.GroupLayout;
import org.dyno.visual.swing.layouts.Leading;
import org.dyno.visual.swing.layouts.Trailing;

import com.toedter.calendar.JDateChooser;
import com.toedter.calendar.JTextFieldDateEditor;

import controlador.AppController;
import modelo.sesion.SesionDao;
import util.Metodos;
import util.Validation;
import vista.VistaEventos;

//VS4E -- DO NOT REMOVE THIS LINE!
public class VistaAuditoria extends JPanel {

	private static final long serialVersionUID = 1L;
	private JLabel jLabel0;
	private JPanel jPanel0;
	private JPanel jPanel1;
	private AppController app;
	private JTable jTable0;
	private JScrollPane jScrollPane0;
	private JLabel jLabel2;
	private JTextField jTextField0;
	private JLabel jLabel1;
	private JToggleButton jToggleButton0;
	private JDateChooser jDateChooser0;
	private JDateChooser jDateChooser1;
	private JLabel jLabel3;
	private JLabel jLabel4;
	private JLabel jLabel5;
	private JSeparator jSeparator0;
	private JButton jButton0;
	private JButton jButton1;
	private static final String PREFERRED_LOOK_AND_FEEL = "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel";
	public VistaAuditoria() {
		initComponents();
		cargarTablaBitacora();
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
			jButton1.setText("Visualizar eventos");
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
			jButton0.setText("Buscar");
			jButton0.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent event) {
					jButton0ActionActionPerformed(event);
				}
			});
		}
		return jButton0;
	}

	private JSeparator getJSeparator0() {
		if (jSeparator0 == null) {
			jSeparator0 = new JSeparator();
		}
		return jSeparator0;
	}

	private JLabel getJLabel5() {
		if (jLabel5 == null) {
			jLabel5 = new JLabel();
			jLabel5.setHorizontalAlignment(SwingConstants.CENTER);
			jLabel5.setText("Hasta:");
		}
		return jLabel5;
	}

	private JLabel getJLabel4() {
		if (jLabel4 == null) {
			jLabel4 = new JLabel();
			jLabel4.setHorizontalAlignment(SwingConstants.CENTER);
			jLabel4.setText("Desde:");
		}
		return jLabel4;
	}

	private JLabel getJLabel3() {
		if (jLabel3 == null) {
			jLabel3 = new JLabel();
			jLabel3.setHorizontalAlignment(SwingConstants.CENTER);
			jLabel3.setText("Seleccione una fecha:");
		}
		return jLabel3;
	}

	private JDateChooser getJDateChooser1() {
		if (jDateChooser1 == null) {
			jDateChooser1 = new JDateChooser();
			jDateChooser1.setDateFormatString("dd/MM/yyyy");
			jDateChooser1.setEnabled(false);
			jDateChooser1.setDate(new Date());
			JTextFieldDateEditor editor = (JTextFieldDateEditor) jDateChooser1.getDateEditor();
			editor.setEditable(false);
			jDateChooser1.setMaxSelectableDate(new Date(253370782864100L));
			jDateChooser1.setMinSelectableDate(new Date(-62135751535900L));
		}
		return jDateChooser1;
	}

	private JDateChooser getJDateChooser0() {
		if (jDateChooser0 == null) {
			jDateChooser0 = new JDateChooser();
			jDateChooser0.setDateFormatString("dd/MM/yyyy");
			jDateChooser0.setEnabled(false);
			long date = new Date().getTime();
			jDateChooser0.setDate(new Date(date - new Long("2592000000")));
			JTextFieldDateEditor editor = (JTextFieldDateEditor) jDateChooser0.getDateEditor();
			editor.setEditable(false);
			jDateChooser0.setMaxSelectableDate(new Date(253370782917840L));
			jDateChooser0.setMinSelectableDate(new Date(-62135751482160L));
		}
		return jDateChooser0;
	}

	private JToggleButton getJToggleButton0() {
		if (jToggleButton0 == null) {
			jToggleButton0 = new JToggleButton();
			jToggleButton0.setText("Activar");
			jToggleButton0.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent event) {
					jToggleButton0ActionActionPerformed(event);
				}
			});
		}
		return jToggleButton0;
	}

	private JLabel getJLabel1() {
		if (jLabel1 == null) {
			jLabel1 = new JLabel();
			jLabel1.setFont(new Font("Dialog", Font.BOLD, 15));
			jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
			jLabel1.setText("Filtro de fechas.");
		}
		return jLabel1;
	}

	private JTextField getJTextField0() {
		if (jTextField0 == null) {
			jTextField0 = new JTextField();
			jTextField0.setToolTipText("Escriba un nombre de usuario para buscarlo automaticamente.");
			jTextField0.setAutoscrolls(true);
			jTextField0.addKeyListener(new KeyAdapter() {

				public void keyReleased(KeyEvent event) {
					jTextField0KeyKeyReleased(event);
				}
			});
		}
		return jTextField0;
	}

	private JLabel getJLabel2() {
		if (jLabel2 == null) {
			jLabel2 = new JLabel();
			jLabel2.setText("Busqueda avanzada del usuario:");
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
			jTable0.setToolTipText("Haga doble click para visualizar los eventos.");
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
			jPanel1.add(getJLabel0(), new Constraints(new Leading(406, 10, 10), new Leading(17, 10, 10)));
			jPanel1.add(getJPanel0(), new Constraints(new Leading(62, 857, 10, 10), new Leading(63, 401, 10, 10)));
		}
		return jPanel1;
	}

	private JPanel getJPanel0() {
		if (jPanel0 == null) {
			jPanel0 = new JPanel();
			jPanel0.setBorder(BorderFactory.createTitledBorder(null, "Tabla de bitácora de los usuarios del sistema.", TitledBorder.LEADING,
					TitledBorder.DEFAULT_POSITION, new Font("SansSerif", Font.BOLD, 12), new Color(59, 59, 59)));
			jPanel0.setLayout(new GroupLayout());
			jPanel0.add(getJLabel2(), new Constraints(new Leading(7, 213, 12, 12), new Leading(0, 47, 424)));
			jPanel0.add(getJTextField0(), new Constraints(new Leading(222, 152, 10, 10), new Leading(-6, 53, 347)));
			jPanel0.add(getJLabel1(), new Constraints(new Leading(569, 269, 10, 10), new Leading(0, 12, 12)));
			jPanel0.add(getJToggleButton0(), new Constraints(new Leading(664, 93, 10, 10), new Trailing(292, 30, 30)));
			jPanel0.add(getJDateChooser1(), new Constraints(new Leading(681, 142, 10, 10), new Trailing(158, 10, 176)));
			jPanel0.add(getJDateChooser0(), new Constraints(new Leading(681, 142, 12, 12), new Leading(114, 10, 220)));
			jPanel0.add(getJLabel3(), new Constraints(new Leading(570, 268, 12, 12), new Leading(91, 10, 10)));
			jPanel0.add(getJLabel4(), new Constraints(new Leading(569, 104, 10, 10), new Leading(120, 10, 10)));
			jPanel0.add(getJLabel5(), new Constraints(new Leading(569, 104, 12, 12), new Trailing(163, 147, 147)));
			jPanel0.add(getJSeparator0(), new Constraints(new Leading(567, 272, 12, 12), new Trailing(135, 10, 147, 147)));
			jPanel0.add(getJButton0(), new Constraints(new Leading(377, 93, 10, 10), new Leading(-6, 53, 331)));
			jPanel0.add(getJButton1(), new Constraints(new Leading(675, 148, 10, 10), new Bilateral(305, 12, 40)));
		}
		return jPanel0;
	}

	private JLabel getJLabel0() {
		if (jLabel0 == null) {
			jLabel0 = new JLabel();
			jLabel0.setFont(new Font("Dialog", Font.BOLD, 15));
			jLabel0.setText("Bitácora de procesos");
		}
		return jLabel0;
	}

	public void cargarTablaBitacora() {
		getJTable0().setModel(new SesionDao().recuperarTodaSesionesTable());
		getJTable0().getColumnModel().getColumn(0).setPreferredWidth(10);
		getJTable0().getColumnModel().getColumn(1).setPreferredWidth(10);
		getJTable0().getColumnModel().getColumn(2).setPreferredWidth(100);
		getJTable0().getColumnModel().getColumn(3).setPreferredWidth(100);
		Metodos.formatearTabla(getJTable0());

	}

	public void cargartablBusquedaAvanzada(String username) {
		getJTable0().setModel(new SesionDao().busquedaAvanzadaSesionTabla(username));
		getJTable0().getColumnModel().getColumn(0).setPreferredWidth(10);
		getJTable0().getColumnModel().getColumn(1).setPreferredWidth(10);
		getJTable0().getColumnModel().getColumn(2).setPreferredWidth(100);
		getJTable0().getColumnModel().getColumn(3).setPreferredWidth(100);
		Metodos.formatearTabla(getJTable0());
	}

	private void cargartablBusquedaAvanzada(String username, java.sql.Date fechaInicio, java.sql.Date fechaCierre) {
		getJTable0().setModel(new SesionDao().busquedaAvanzadaSesionTabla(username, fechaInicio, fechaCierre));
		getJTable0().getColumnModel().getColumn(0).setPreferredWidth(10);
		getJTable0().getColumnModel().getColumn(1).setPreferredWidth(10);
		getJTable0().getColumnModel().getColumn(2).setPreferredWidth(100);
		getJTable0().getColumnModel().getColumn(3).setPreferredWidth(100);
		Metodos.formatearTabla(getJTable0());
	}

	private void jTable0MouseMouseClicked(MouseEvent event) {
		if (event.getClickCount() == 2) {
			mostrarVistaEventos();
		}
	}

	private void buscar() {

		if (jToggleButton0.isSelected()) {
			long fechaMayor = jDateChooser1.getDate().getTime() - jDateChooser0.getDate().getTime();
			if (fechaMayor < 0) {
				JOptionPane.showMessageDialog(this, "El criterio de las fechas es incorrecto.", "Error",
						JOptionPane.ERROR_MESSAGE);
			} else {
				cargartablBusquedaAvanzada(jTextField0.getText(), new java.sql.Date(jDateChooser0.getDate().getTime()),
						new java.sql.Date(jDateChooser1.getDate().getTime()));
			}
		} else
			cargartablBusquedaAvanzada(jTextField0.getText());

	}

	private void jTextField0KeyKeyReleased(KeyEvent event) {
		buscar();
	}

	private void activarFechas(boolean enable) {
		jDateChooser0.setEnabled(enable);
		jDateChooser1.setEnabled(enable);

	}

	private void jToggleButton0ActionActionPerformed(ActionEvent event) {
		activarFechas(jToggleButton0.isSelected());
		// System.out.println(jDateChooser0.getDate().getTime()-jDateChooser1.getDate().getTime());

	}

	private void jButton0ActionActionPerformed(ActionEvent event) {
		if (Validation.field(jTextField0)) {
			buscar();
		}
	}

	private void mostrarVistaEventos() {
		VistaEventos eventos = new VistaEventos(new JFrame(), true,
				(int) jTable0.getValueAt(jTable0.getSelectedRow(), 0));
		eventos.setTitle("Visualización de los eventos");
		eventos.setLocationRelativeTo(null);
		eventos.setVisible(true);

	}

	private void jButton1ActionActionPerformed(ActionEvent event) {
		if (jTable0.getSelectedRowCount() > 0) {
			mostrarVistaEventos();
		} else
			JOptionPane.showMessageDialog(this, "Seleccione un elemento en la tabla.", "Error",
					JOptionPane.ERROR_MESSAGE);
	}

}
