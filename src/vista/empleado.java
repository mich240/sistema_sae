package vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import org.dyno.visual.swing.layouts.Constraints;
import org.dyno.visual.swing.layouts.GroupLayout;
import org.dyno.visual.swing.layouts.Leading;
import org.dyno.visual.swing.layouts.Trailing;

import singleton.Conexion;

//VS4E -- DO NOT REMOVE THIS LINE!
public class empleado extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextField cedula;
	private JTextField jTextField1;
	private JTextField jTextField2;
	private JButton jButton0;
	private JTextArea jTextArea0;
	private JScrollPane jScrollPane0;
	private JButton jButton1;
	private static final String PREFERRED_LOOK_AND_FEEL = "javax.swing.plaf.metal.MetalLookAndFeel";
	public empleado() {
		initComponents();
	}

	private void initComponents() {
		setLayout(new GroupLayout());
		add(getCedula(), new Constraints(new Leading(22, 127, 10, 10), new Leading(30, 10, 10)));
		add(getJTextField1(), new Constraints(new Leading(28, 121, 12, 12), new Leading(70, 10, 10)));
		add(getJTextField2(), new Constraints(new Leading(30, 116, 12, 12), new Leading(108, 12, 12)));
		add(getJButton0(), new Constraints(new Trailing(12, 12, 12), new Leading(148, 10, 10)));
		add(getJScrollPane0(), new Constraints(new Leading(160, 126, 10, 10), new Leading(53, 80, 10, 10)));
		add(getJButton1(), new Constraints(new Leading(47, 135, 10, 10), new Leading(183, 10, 10)));
		setSize(320, 240);
	}

	private JButton getJButton1() {
		if (jButton1 == null) {
			jButton1 = new JButton();
			jButton1.setText("Sin commint");
			jButton1.addActionListener(new ActionListener() {
	
				public void actionPerformed(ActionEvent event) {
					jButton1ActionActionPerformed(event);
				}
			});
		}
		return jButton1;
	}

	private JScrollPane getJScrollPane0() {
		if (jScrollPane0 == null) {
			jScrollPane0 = new JScrollPane();
			jScrollPane0.setViewportView(getJTextArea0());
		}
		return jScrollPane0;
	}

	private JTextArea getJTextArea0() {
		if (jTextArea0 == null) {
			jTextArea0 = new JTextArea();
			jTextArea0.setText("Direccion de calle");
		}
		return jTextArea0;
	}

	private JButton getJButton0() {
		if (jButton0 == null) {
			jButton0 = new JButton();
			jButton0.setText("Aceptar");
			jButton0.addActionListener(new ActionListener() {
	
				public void actionPerformed(ActionEvent event) {
					jButton0ActionActionPerformed(event);
				}
			});
		}
		return jButton0;
	}

	private JTextField getJTextField2() {
		if (jTextField2 == null) {
			jTextField2 = new JTextField();
			jTextField2.setText("apellido");
		}
		return jTextField2;
	}

	private JTextField getJTextField1() {
		if (jTextField1 == null) {
			jTextField1 = new JTextField();
			jTextField1.setText("noombre");
		}
		return jTextField1;
	}

	private JTextField getCedula() {
		if (cedula == null) {
			cedula = new JTextField();
			cedula.setText("20088808");
		}
		return cedula;
	}

	private static void installLnF() {
		try {
			String lnfClassname = PREFERRED_LOOK_AND_FEEL;
			if (lnfClassname == null)
				lnfClassname = UIManager.getCrossPlatformLookAndFeelClassName();
			UIManager.setLookAndFeel(lnfClassname);
		} catch (Exception e) {
			System.err.println("Cannot install " + PREFERRED_LOOK_AND_FEEL + " on this platform:" + e.getMessage());
		}
	}

	/**
	* Main entry of the class.
	* Note: This class is only created so that you can easily preview the result at runtime.
	* It is not expected to be managed by the designer.
	* You can modify it as you like.
	*/
	public static void main(String[] args) {
		installLnF();
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				empleado frame = new empleado();
				frame.setDefaultCloseOperation(empleado.EXIT_ON_CLOSE);
				frame.setTitle("empleado");
				frame.getContentPane().setPreferredSize(frame.getSize());
				frame.pack();
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
			}
		});
	}

	private void jButton0ActionActionPerformed(ActionEvent event) {
		PreparedStatement pst;		
		try {
		
			Conexion.getInstancia().getConnection().setAutoCommit(false);	
			
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		
		String sql="insert into empleado values (null,? ,? ,?)";
		try {
			
			pst=Conexion.getInstancia().getConnection().prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
			pst.setInt(1,Integer.parseInt(getCedula().getText()));
			pst.setString(2, getJTextField1().getText());
			pst.setString(3, getJTextField2().getText());
			
			pst.executeUpdate();
			
			System.out.println("Se creo el SQL: "+pst.toString());
			
			
			ResultSet rs=pst.getGeneratedKeys();
			if (rs.next()) {
			//	System.out.println(rs.getInt(1));
			pst=Conexion.getInstancia().getConnection().prepareStatement("insert into dato values(null,?,?)");
			pst.setString(1, jTextArea0.getText());
			pst.setInt(2, rs.getInt(1));
			pst.executeUpdate();
			System.out.println("Se creo el SQL: "+pst.toString());
			}
			Conexion.getInstancia().getConnection().commit();
			System.out.println("Commit ejecutado.");
		} catch (SQLException e) {
		//	e.printStackTrace();
			System.out.println(e.getErrorCode()+" "+e);	
			if (e.getErrorCode()==1062) {
				JOptionPane.showMessageDialog(null, "Este empleado ya a sido registrado.");
			}
			try {
				Conexion.getInstancia().getConnection().rollback();
				
				System.out.println("RollBack ejecutado.");
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}finally {
		//	Conexion.Desconectar();
			try {
				Conexion.getInstancia().getConnection().setAutoCommit(true);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
	
	}

	private void jButton1ActionActionPerformed(ActionEvent event) {
		PreparedStatement pst;		
//		try {
//			Conexion.getInstancia().getConnection().setAutoCommit(false);
//		} catch (SQLException e1) {
//			e1.printStackTrace();
//		}
		
		String sql="insert into empleado values (null,? ,? ,?)";
		try {
			System.out.println(Conexion.getInstancia().getConnection().getAutoCommit());
			
			pst=Conexion.getInstancia().getConnection().prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
			pst.setInt(1,Integer.parseInt(getCedula().getText()));
			pst.setString(2, getJTextField1().getText());
			pst.setString(3, getJTextField2().getText());
			
			pst.executeUpdate();
			
			System.out.println("Se creo el SQL: "+pst.toString());
			
			
			ResultSet rs=pst.getGeneratedKeys();
			if (rs.next()) {
			//	System.out.println(rs.getInt(1));
			pst=Conexion.getInstancia().getConnection().prepareStatement("insert into dato values(null,?,?)");
			pst.setString(1, jTextArea0.getText());
			pst.setInt(2, rs.getInt(1));
			pst.executeUpdate();
			System.out.println("Se creo el SQL: "+pst.toString());
			}
		//	Conexion.getInstancia().getConnection().commit();
		//	System.out.println("Commit ejecutado.");
		} catch (SQLException e) {
		//	e.printStackTrace();
			System.out.println(e.getErrorCode()+" "+e);	
			if (e.getErrorCode()==1062) {
				JOptionPane.showMessageDialog(null, "Este empleado ya a sido registrado.");
			}
//			try {
//				Conexion.getInstancia().getConnection().rollback();
//				System.out.println("RollBack ejecutado.");
//			} catch (SQLException e1) {
//				e1.printStackTrace();
//			}
		}finally {
		//	Conexion.Desconectar();
			
		}
	
	
	}

}
