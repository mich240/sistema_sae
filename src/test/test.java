package test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Timer;

import javax.swing.JButton;
import javax.swing.JFrame;

import org.dyno.visual.swing.layouts.Constraints;
import org.dyno.visual.swing.layouts.GroupLayout;
import org.dyno.visual.swing.layouts.Leading;

import singleton.Conexion;

//VS4E -- DO NOT REMOVE THIS LINE!
public class test extends JFrame {

	private static final long serialVersionUID = 1L;
	private JButton jButton0;

	public test() {
		initComponents();
	}

	private void initComponents() {
		setLayout(new GroupLayout());
		add(getJButton0(), new Constraints(new Leading(142, 10, 10), new Leading(67, 10, 10)));
		setSize(483, 240);
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

	public static void main(String[] args) {
		test t=new test();
		t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		t.setTitle("test");	
		t.pack();
		t.setLocationRelativeTo(null);
		t.setVisible(true);
	}
	
	private void jButton0ActionActionPerformed(ActionEvent event) {
		
//		java.util.Date utilDate = new java.util.Date(); //fecha actual
//		  long lnMilisegundos = utilDate.getTime();
//		  java.sql.Date sqlDate = new java.sql.Date(lnMilisegundos);
//		  java.sql.Time sqlTime = new java.sql.Time(lnMilisegundos);
//		  java.sql.Timestamp sqlTimestamp = new java.sql.Timestamp(lnMilisegundos);
//		  System.out.println("util.Date: "+utilDate);
//		  System.out.println("sql.Date: "+sqlDate);
//		  System.out.println("sql.Time: "+sqlTime);
//		  System.out.println("sql.Timestamp: "+sqlTimestamp);
//		  SimpleDateFormat s=new SimpleDateFormat("HH:mm:ss");
		  
		java.sql.Date dateSql = null;
		java.util.Date dateUtil = null;
		Time timeSql = null;
		Timestamp timeS = null;
		
		
		try {
			Statement st=Conexion.getInstancia().getConnection().createStatement();
			
			ResultSet rs=st.executeQuery("select * from test");
				
			
			while(rs.next()) {
				timeS=rs.getTimestamp(4);
			}
			System.out.println(timeS);
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		  System.out.println();
		  
	}

}
