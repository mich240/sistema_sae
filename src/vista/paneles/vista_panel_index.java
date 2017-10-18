package vista.paneles;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import org.dyno.visual.swing.layouts.GroupLayout;


//VS4E -- DO NOT REMOVE THIS LINE!
public class vista_panel_index extends JPanel {

	private static final long serialVersionUID = 1L;
	public vista_panel_index() {
		initComponents();
	}
	@Override
	protected void paintComponent(Graphics g) {

		System.out.println(System.getProperty("user.dir")+"/img/index.jpg");
		Dimension tam=getSize();
		Image index=new ImageIcon(System.getProperty("user.dir")+"/img/index.jpg").getImage();
		g.drawImage(index, 0, 0, tam.width, tam.height, null);
		setOpaque(false);
		super.paintComponent(g);
	}

	private void initComponents() {
		setLayout(new GroupLayout());
		setSize(1020, 570);
	}

}
