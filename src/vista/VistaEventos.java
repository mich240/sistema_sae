package vista;

import java.awt.Color;
import java.awt.Dialog;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GraphicsConfiguration;
import java.awt.Window;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;

import org.dyno.visual.swing.layouts.Bilateral;
import org.dyno.visual.swing.layouts.Constraints;
import org.dyno.visual.swing.layouts.GroupLayout;
import org.dyno.visual.swing.layouts.Leading;

import modelo.auditoria.AuditoriaDao;
import util.Metodos;

//VS4E -- DO NOT REMOVE THIS LINE!
public class VistaEventos extends JDialog {
	
	private static final long serialVersionUID = 1L;
	private int idSesion;
	private JTable jTable0;
	private JScrollPane jScrollPane0;
	private JLabel jLabel0;
	private JPanel jPanel0;
	private JLabel jLabel1;
	private JLabel jLabel2;
	private JSeparator jSeparator0;
	private JSeparator jSeparator1;
	private JLabel jLabel3;
	private JLabel jLabel4;
	@SuppressWarnings("unused")
	private static final String PREFERRED_LOOK_AND_FEEL = "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel";
	public VistaEventos(Dialog parent, boolean modal) {
		super(parent, modal);
		initComponents();
	}

	public VistaEventos(Frame parent, boolean modal,int idSesion) {
		super(parent, modal);
		this.idSesion=idSesion;
		initComponents();
		cargarTablaEventos();
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
		setSize(764, 464);
	}

	private JLabel getJLabel4() {
		if (jLabel4 == null) {
			jLabel4 = new JLabel();
			jLabel4.setFont(new Font("Dialog", Font.BOLD, 15));
			jLabel4.setHorizontalAlignment(SwingConstants.CENTER);
			jLabel4.setText("");
		}
		return jLabel4;
	}

	private JLabel getJLabel3() {
		if (jLabel3 == null) {
			jLabel3 = new JLabel();
			jLabel3.setFont(new Font("Dialog", Font.BOLD, 15));
			jLabel3.setHorizontalAlignment(SwingConstants.CENTER);
			jLabel3.setText("Tiempo de ejecución:");
		}
		return jLabel3;
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

	private JLabel getJLabel2() {
		if (jLabel2 == null) {
			jLabel2 = new JLabel();
			jLabel2.setVerticalAlignment(SwingConstants.TOP);
		}
		return jLabel2;
	}

	private JLabel getJLabel1() {
		if (jLabel1 == null) {
			jLabel1 = new JLabel();
			jLabel1.setFont(new Font("Dialog", Font.BOLD, 15));
			jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
			jLabel1.setText("Descripción del evento");
		}
		return jLabel1;
	}

	private JPanel getJPanel0() {
		if (jPanel0 == null) {
			jPanel0 = new JPanel();
			jPanel0.setBorder(BorderFactory.createTitledBorder(null, "Auditoria de eventos.", TitledBorder.LEADING, TitledBorder.DEFAULT_POSITION,
					new Font("SansSerif", Font.BOLD, 12), new Color(59, 59, 59)));
			jPanel0.setLayout(new GroupLayout());
			jPanel0.add(getJLabel1(), new Constraints(new Leading(376, 320, 10, 10), new Leading(12, 19, 12, 12)));
			jPanel0.add(getJScrollPane0(), new Constraints(new Leading(15, 361, 10, 10), new Bilateral(9, 12, 29)));
			jPanel0.add(getJSeparator0(), new Constraints(new Leading(374, 322, 12, 12), new Leading(34, 10, 10, 10)));
			jPanel0.add(getJLabel2(), new Constraints(new Leading(384, 294, 10, 10), new Leading(39, 219, 10, 10)));
			jPanel0.add(getJSeparator1(), new Constraints(new Leading(374, 322, 12, 12), new Leading(270, 10, 47, 446)));
			jPanel0.add(getJLabel3(), new Constraints(new Leading(375, 320, 12, 12), new Leading(276, 19, 47, 446)));
			jPanel0.add(getJLabel4(), new Constraints(new Leading(374, 320, 12, 12), new Leading(298, 19, 47, 446)));
		}
		return jPanel0;
	}

	private JLabel getJLabel0() {
		if (jLabel0 == null) {
			jLabel0 = new JLabel();
			jLabel0.setFont(new Font("Dialog", Font.BOLD, 15));
			jLabel0.setHorizontalAlignment(SwingConstants.CENTER);
			jLabel0.setText("Eventos registrados");
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
		
			jTable0.addMouseListener(new MouseAdapter() {
	
				public void mouseClicked(MouseEvent event) {
					jTable0MouseMouseClicked(event);
				}
			});
		}
		return jTable0;
	}

	private void cargarTablaEventos() {
		getJTable0().setModel(new AuditoriaDao().cargarTablaEventos(this.idSesion));	
		Metodos.formatearTabla(getJTable0());	
	}

	private void jTable0MouseMouseClicked(MouseEvent event) {
		jLabel2.setText("<html> <p align=\"justify\">"+jTable0.getValueAt(jTable0.getSelectedRow(), 0).toString()+"</p></html>");
		jLabel4.setText(jTable0.getValueAt(jTable0.getSelectedRow(), 1).toString());
	}
	
	
}
