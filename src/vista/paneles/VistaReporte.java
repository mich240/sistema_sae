package vista.paneles;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import org.dyno.visual.swing.layouts.Bilateral;
import org.dyno.visual.swing.layouts.Constraints;
import org.dyno.visual.swing.layouts.GroupLayout;
import org.dyno.visual.swing.layouts.Leading;

import controlador.AppController;
import util.vistaReportePersonalizado;

//VS4E -- DO NOT REMOVE THIS LINE!
public class VistaReporte extends JPanel {

	private static final long serialVersionUID = 1L;
	private JLabel jLabel0;
	private JPanel jPanel0;
	private JPanel jPanel1;
	private AppController app;
	private JPanel jPanel2;
	private JLabel jLabel1;
	private JPanel jPanel3;
	private JButton jButton0;
	private JButton jButton1;
	@SuppressWarnings("unused")
	private static final String PREFERRED_LOOK_AND_FEEL = "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel";
	public VistaReporte() {
		initComponents();
	
	}

	private void initComponents() {
		setLayout(new GroupLayout());
		add(getJLabel0(), new Constraints(new Leading(414, 10, 10), new Leading(52, 10, 10)));
		add(getJPanel0(), new Constraints(new Leading(237, 527, 10, 10), new Leading(111, 236, 10, 10)));
		add(getJPanel1(), new Constraints(new Leading(20, 980, 10, 10), new Leading(20, 530, 10, 10)));
		setSize(1020, 570);
	}

	private JLabel getJLabel0() {
		if (jLabel0 == null) {
			jLabel0 = new JLabel();
			jLabel0.setFont(new Font("Dialog", Font.BOLD, 15));
			jLabel0.setHorizontalAlignment(SwingConstants.CENTER);
			jLabel0.setText("Visor de reportes");
		}
		return jLabel0;
	}

	private JButton getJButton1() {
		if (jButton1 == null) {
			jButton1 = new JButton();
			jButton1.setIcon(new ImageIcon(getClass().getResource("/img/xls.png")));
			jButton1.setText("Guardar");
		}
		return jButton1;
	}

	private JButton getJButton0() {
		if (jButton0 == null) {
			jButton0 = new JButton();
			jButton0.setIcon(new ImageIcon(getClass().getResource("/img/pdf.png")));
			jButton0.setText("Guardar");
			jButton0.addActionListener(new ActionListener() {
	
				public void actionPerformed(ActionEvent event) {
					jButton0ActionActionPerformed(event);
				}
			});
		}
		return jButton0;
	}

	private JPanel getJPanel3() {
		if (jPanel3 == null) {
			jPanel3 = new JPanel();
			jPanel3.setBorder(new LineBorder(Color.gray, 1, false));
			jPanel3.setLayout(new BorderLayout());
		}
		return jPanel3;
	}

	private JLabel getJLabel1() {
		if (jLabel1 == null) {
			jLabel1 = new JLabel();
			jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
			jLabel1.setText("Acciones");
		}
		return jLabel1;
	}

	private JPanel getJPanel2() {
		if (jPanel2 == null) {
			jPanel2 = new JPanel();
			jPanel2.setBorder(new LineBorder(Color.gray, 1, false));
			jPanel2.setLayout(new GroupLayout());
			jPanel2.add(getJButton0(), new Constraints(new Bilateral(0, 0, 93), new Leading(19, 10, 10)));
			jPanel2.add(getJButton1(), new Constraints(new Bilateral(0, 0, 93), new Leading(71, 10, 10)));
		}
		return jPanel2;
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
			jPanel1.add(getJLabel0(), new Constraints(new Bilateral(0, 0, 122), new Leading(15, 10, 10)));
			jPanel1.add(getJPanel0(), new Constraints(new Bilateral(8, 8, 0), new Leading(41, 478, 10, 10)));
		}
		return jPanel1;
	}

	private JPanel getJPanel0() {
		if (jPanel0 == null) {
			jPanel0 = new JPanel();
			jPanel0.setBorder(BorderFactory.createTitledBorder(null, "", TitledBorder.LEADING, TitledBorder.DEFAULT_POSITION,
					new Font("SansSerif", Font.BOLD, 12), new Color(59, 59, 59)));
			jPanel0.setLayout(new GroupLayout());
			jPanel0.add(getJPanel2(), new Constraints(new Leading(839, 100, 10, 10), new Leading(28, 427, 10, 10)));
			jPanel0.add(getJLabel1(), new Constraints(new Leading(839, 100, 12, 12), new Leading(0, 12, 12)));
			jPanel0.add(getJPanel3(), new Constraints(new Leading(-2, 838, 10, 10), new Leading(4, 451, 12, 12)));
		}
		return jPanel0;
	}

	public void addVistareport(vistaReportePersonalizado vistaReportePersonalizado) {
		getJPanel3().removeAll();
		getJPanel3().add(vistaReportePersonalizado,BorderLayout.CENTER);
	}

	private void jButton0ActionActionPerformed(ActionEvent event) {
		getApp().generarReporteGuardarComoPdf();
	}

	

}
