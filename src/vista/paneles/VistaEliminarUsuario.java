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
import util.Validation;

//VS4E -- DO NOT REMOVE THIS LINE!
public class VistaEliminarUsuario extends JPanel {

	private static final long serialVersionUID = 1L;
	private JLabel jLabel0;
	private JPanel jPanel0;
	private JLabel jLabel1;
	private JTextField jTextField0;
	private JButton jButton0;
	private JPanel jPanel1;
	private AppController app;
	private static final String PREFERRED_LOOK_AND_FEEL = "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel";
	public VistaEliminarUsuario() {
		initComponents();
		Validation.isAll(getJTextField0(), 15);
	}

	private void initComponents() {
		setLayout(new GroupLayout());
		add(getJLabel0(), new Constraints(new Leading(414, 10, 10), new Leading(52, 10, 10)));
		add(getJPanel0(), new Constraints(new Leading(237, 527, 10, 10), new Leading(111, 236, 10, 10)));
		add(getJPanel1(), new Constraints(new Leading(20, 980, 10, 10), new Leading(20, 530, 10, 10)));
		setSize(1020, 570);
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
			jPanel1.add(getJPanel0(), new Constraints(new Leading(210, 560, 10, 10), new Leading(100, 173, 10, 10)));
			jPanel1.add(getJLabel0(), new Constraints(new Leading(424, 10, 10), new Leading(15, 10, 10)));
		}
		return jPanel1;
	}

	private JButton getJButton0() {
		if (jButton0 == null) {
			jButton0 = new JButton();
			jButton0.setText("Eliminar");
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
			jPanel0.setBorder(BorderFactory.createTitledBorder(null, "Ingrese el nombre de usuario:",
					TitledBorder.LEADING, TitledBorder.DEFAULT_POSITION, new Font("SansSerif", Font.BOLD, 12),
					new Color(59, 59, 59)));
			jPanel0.setLayout(new GroupLayout());
			jPanel0.add(getJLabel1(), new Constraints(new Leading(64, 10, 10), new Leading(48, 10, 10)));
			jPanel0.add(getJTextField0(), new Constraints(new Leading(117, 228, 10, 10), new Leading(42, 10, 10)));
			jPanel0.add(getJButton0(), new Constraints(new Leading(354, 85, 10, 10), new Leading(42, 12, 12)));
		}
		return jPanel0;
	}

	private JLabel getJLabel0() {
		if (jLabel0 == null) {
			jLabel0 = new JLabel();
			jLabel0.setFont(new Font("DejaVu Sans", Font.BOLD, 15));
			jLabel0.setText("Eliminar usuarios");
		}
		return jLabel0;
	}

	private void jButton0ActionActionPerformed(ActionEvent event) {
		if (Validation.field(getJTextField0())) {
			if (JOptionPane.showConfirmDialog(this, "¿Desea eliminar este usuario?", "Eliminar", JOptionPane.YES_OPTION,
					JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {

				if (getApp().eliminarUsuario(getJTextField0().getText())) {
					JOptionPane.showMessageDialog(this, "Usuario eliminado correctamente.", "Correcto.",
							JOptionPane.INFORMATION_MESSAGE);
					
				}else 
					getJTextField0().setText("");
			}
		}
	}

}
