package vista;

import java.awt.Color;
import java.awt.Dialog;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GraphicsConfiguration;
import java.awt.Window;

import javax.swing.BorderFactory;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import org.dyno.visual.swing.layouts.Bilateral;
import org.dyno.visual.swing.layouts.Constraints;
import org.dyno.visual.swing.layouts.GroupLayout;
import org.dyno.visual.swing.layouts.Leading;

//VS4E -- DO NOT REMOVE THIS LINE!
public class VistaEventos extends JDialog {

	private static final long serialVersionUID = 1L;
	private int idSesion;
	private JTable jTable0;
	private JScrollPane jScrollPane0;
	private JLabel jLabel0;
	private JPanel jPanel0;
	private JLabel jLabel1;
	private static final String PREFERRED_LOOK_AND_FEEL = "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel";
	public VistaEventos(Dialog parent, boolean modal) {
		super(parent, modal);
		initComponents();
	}

	public VistaEventos(Frame parent, boolean modal,int idSesion) {
		super(parent, modal);
		this.idSesion=idSesion;
		initComponents();
		System.out.println(this.idSesion);
	}

	public VistaEventos(Dialog parent) {
		super(parent);
		initComponents();
	}

	public VistaEventos(Frame parent, String title) {
		super(parent, title);
		initComponents();
	}

	public VistaEventos(Frame parent, String title, boolean modal) {
		super(parent, title, modal);
		initComponents();
	}

	public VistaEventos(Frame parent, String title, boolean modal, GraphicsConfiguration arg) {
		super(parent, title, modal, arg);
		initComponents();
	}

	public VistaEventos(Frame parent) {
		super(parent);
		initComponents();
	}

	public VistaEventos() {
		initComponents();
	}

	public VistaEventos(Window parent, ModalityType modalityType) {
		super(parent, modalityType);
		initComponents();
	}

	public VistaEventos(Window parent, String title) {
		super(parent, title);
		initComponents();
	}

	public VistaEventos(Window parent, String title, ModalityType modalityType) {
		super(parent, title, modalityType);
		initComponents();
	}

	public VistaEventos(Window parent, String title, ModalityType modalityType, GraphicsConfiguration arg) {
		super(parent, title, modalityType, arg);
		initComponents();
	}

	public VistaEventos(Dialog parent, String title) {
		super(parent, title);
		initComponents();
	}

	public VistaEventos(Dialog parent, String title, boolean modal) {
		super(parent, title, modal);
		initComponents();
	}

	public VistaEventos(Dialog parent, String title, boolean modal, GraphicsConfiguration arg) {
		super(parent, title, modal, arg);
		initComponents();
	}

	public VistaEventos(Window parent) {
		super(parent);
		initComponents();
	}

	private void initComponents() {
		setForeground(Color.black);
		setFont(new Font("Dialog", Font.PLAIN, 12));
		setLayout(new GroupLayout());
		add(getJLabel0(), new Constraints(new Bilateral(0, 0, 44), new Leading(6, 10, 10)));
		add(getJPanel0(), new Constraints(new Leading(17, 715, 10, 10), new Leading(28, 388, 10, 10)));
		setSize(753, 430);
	}

	private JLabel getJLabel1() {
		if (jLabel1 == null) {
			jLabel1 = new JLabel();
			jLabel1.setFont(new Font("DejaVu Sans", Font.BOLD, 15));
			jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
			jLabel1.setText("jLabel1");
		}
		return jLabel1;
	}

	private JPanel getJPanel0() {
		if (jPanel0 == null) {
			jPanel0 = new JPanel();
			jPanel0.setBorder(BorderFactory.createTitledBorder(null, "Auditoria de eventos.", TitledBorder.LEADING, TitledBorder.DEFAULT_POSITION,
					new Font("SansSerif", Font.BOLD, 12), new Color(59, 59, 59)));
			jPanel0.setLayout(new GroupLayout());
			jPanel0.add(getJScrollPane0(), new Constraints(new Leading(15, 361, 10, 10), new Leading(9, 206, 10, 10)));
			jPanel0.add(getJLabel1(), new Constraints(new Leading(388, 102, 12, 12), new Leading(31, 19, 10, 10)));
		}
		return jPanel0;
	}

	private JLabel getJLabel0() {
		if (jLabel0 == null) {
			jLabel0 = new JLabel();
			jLabel0.setFont(new Font("DejaVu Sans", Font.BOLD, 15));
			jLabel0.setHorizontalAlignment(SwingConstants.CENTER);
			jLabel0.setText("Eventos registrados.");
		}
		return jLabel0;
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
			jTable0.setModel(new DefaultTableModel(new Object[][] { { "0x0", "0x1", }, { "1x0", "1x1", }, }, new String[] { "Title 0", "Title 1", }) {
				private static final long serialVersionUID = 1L;
				Class<?>[] types = new Class<?>[] { Object.class, Object.class, };
	
				public Class<?> getColumnClass(int columnIndex) {
					return types[columnIndex];
				}
			});
		}
		return jTable0;
	}

}
