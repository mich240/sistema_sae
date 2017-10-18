package vista.paneles;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import org.dyno.visual.swing.layouts.Constraints;
import org.dyno.visual.swing.layouts.GroupLayout;
import org.dyno.visual.swing.layouts.Leading;

//VS4E -- DO NOT REMOVE THIS LINE!
public class vista_panel_registrar_usuario extends JPanel {

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
	private JComboBox jComboBox0;
	private JPasswordField jPasswordField0;
	private JPasswordField jPasswordField1;
	private JComboBox jComboBox1;
	private JPasswordField jPasswordField2;
	private JPanel jPanel2;
	public vista_panel_registrar_usuario() {
		initComponents();
	}

	private void initComponents() {
		setLayout(new GroupLayout());
		add(getJLabel0(), new Constraints(new Leading(414, 10, 10), new Leading(23, 10, 10)));
		add(getJPanel0(), new Constraints(new Leading(244, 517, 10, 10), new Leading(61, 171, 10, 10)));
		add(getJButton0(), new Constraints(new Leading(247, 10, 10), new Leading(502, 10, 10)));
		add(getJButton1(), new Constraints(new Leading(642, 117, 10, 10), new Leading(506, 12, 12)));
		add(getJPanel1(), new Constraints(new Leading(242, 517, 12, 12), new Leading(244, 244, 12, 12)));
		add(getJPanel2(), new Constraints(new Leading(32, 957, 10, 10), new Leading(20, 529, 10, 10)));
		setSize(1020, 570);
	}

	private JPanel getJPanel2() {
		if (jPanel2 == null) {
			jPanel2 = new JPanel();
			jPanel2.setBorder(new LineBorder(new Color(196, 196, 255), 1, false));
			jPanel2.setLayout(new GroupLayout());
			jPanel2.add(getJPanel1(), new Constraints(new Leading(213, 517, 10, 10), new Leading(224, 244, 10, 10)));
			jPanel2.add(getJButton1(), new Constraints(new Leading(611, 117, 10, 10), new Leading(480, 12, 12)));
			jPanel2.add(getJButton0(), new Constraints(new Leading(216, 10, 10), new Leading(480, 12, 12)));
			jPanel2.add(getJPanel0(), new Constraints(new Leading(213, 517, 12, 12), new Leading(41, 171, 12, 12)));
			jPanel2.add(getJLabel0(), new Constraints(new Leading(383, 10, 10), new Leading(7, 12, 12)));
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

	private JComboBox getJComboBox1() {
		if (jComboBox1 == null) {
			jComboBox1 = new JComboBox();
			jComboBox1.setModel(new DefaultComboBoxModel(new Object[] { "item0", "item1", "item2", "item3" }));
			jComboBox1.setDoubleBuffered(false);
			jComboBox1.setBorder(null);
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

	private JComboBox getJComboBox0() {
		if (jComboBox0 == null) {
			jComboBox0 = new JComboBox();
			jComboBox0.setModel(new DefaultComboBoxModel(new Object[] { "item0", "item1", "item2", "item3" }));
			jComboBox0.setDoubleBuffered(false);
			jComboBox0.setBorder(null);
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
		}
		return jButton0;
	}

	private JButton getJButton1() {
		if (jButton1 == null) {
			jButton1 = new JButton();
			jButton1.setText("Limpiar");
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
			jLabel7.setText("Repetir contraseña:");
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
			jPanel1.add(getJTextField3(), new Constraints(new Leading(131, 241, 10, 10), new Leading(14, 12, 12)));
			jPanel1.add(getJLabel4(), new Constraints(new Leading(12, 12, 12), new Leading(14, 12, 12)));
			jPanel1.add(getJComboBox0(), new Constraints(new Leading(131, 240, 12, 12), new Leading(46, 12, 12)));
			jPanel1.add(getJPasswordField0(), new Constraints(new Leading(131, 240, 12, 12), new Leading(83, 12, 12)));
			jPanel1.add(getJLabel9(), new Constraints(new Leading(12, 122, 12, 12), new Leading(198, 10, 10)));
			jPanel1.add(getJLabel8(), new Constraints(new Leading(12, 122, 12, 12), new Leading(166, 10, 10)));
			jPanel1.add(getJLabel5(), new Constraints(new Leading(9, 10, 10), new Leading(50, 12, 12)));
			jPanel1.add(getJLabel6(), new Constraints(new Leading(12, 12, 12), new Leading(84, 12, 12)));
			jPanel1.add(getJLabel7(), new Constraints(new Leading(12, 122, 12, 12), new Leading(121, 12, 12)));
			jPanel1.add(getJPasswordField1(), new Constraints(new Leading(131, 240, 12, 12), new Leading(121, 12, 12)));
			jPanel1.add(getJComboBox1(), new Constraints(new Leading(132, 240, 12, 12), new Leading(162, 12, 12)));
			jPanel1.add(getJPasswordField2(), new Constraints(new Leading(131, 240, 12, 12), new Leading(196, 12, 12)));
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
			jPanel0.add(getJTextField0(), new Constraints(new Leading(133, 241, 12, 12), new Leading(29, 12, 12)));
			jPanel0.add(getJTextField1(), new Constraints(new Leading(133, 241, 12, 12), new Leading(65, 12, 12)));
			jPanel0.add(getJTextField2(), new Constraints(new Leading(133, 241, 12, 12), new Leading(107, 12, 12)));
			jPanel0.add(getJLabel1(), new Constraints(new Leading(55, 10, 10), new Leading(29, 12, 12)));
			jPanel0.add(getJLabel2(), new Constraints(new Leading(55, 10, 10), new Leading(67, 12, 12)));
			jPanel0.add(getJLabel3(), new Constraints(new Leading(55, 10, 10), new Leading(109, 12, 12)));
		}
		return jPanel0;
	}

	private JLabel getJLabel0() {
		if (jLabel0 == null) {
			jLabel0 = new JLabel();
			jLabel0.setText("Creación de nuevos usuarios");
		}
		return jLabel0;
	}

}
