package vista.paneles;

import java.awt.Graphics;
import java.awt.Image;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import org.dyno.visual.swing.layouts.GroupLayout;

//VS4E -- DO NOT REMOVE THIS LINE!
public class vista_panel_index extends JPanel {

	private static final long serialVersionUID = 1L;
	private Image index_panel;

	public vista_panel_index() {
		initComponents();	
		setIndex_panel(getClass().getResource("/img/index.jpg"));
	}

	public Image getIndex_panel() {
		return index_panel;
	}

	public void setIndex_panel(String index_panel) {
		this.index_panel = new ImageIcon(index_panel).getImage();
		repaint();
	}
	public void setIndex_panel(URL index_panel) {
		this.index_panel = new ImageIcon(index_panel).getImage();
		repaint();
	}

	@Override
	protected void paintComponent(Graphics g) {

		if (this.index_panel != null) {
			g.drawImage(getIndex_panel(), 0, 0, this.getSize().width, this.getSize().height, null);
			setOpaque(false);
		} else
			setOpaque(true);

		super.paintComponent(g);
	}

	private void initComponents() {
		setLayout(new GroupLayout());
		setSize(1020, 570);
	}

}
