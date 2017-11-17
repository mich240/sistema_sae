package util;

import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.swing.JRViewer;

public class vistaReportePersonalizado extends JRViewer {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1949762956649293161L;

	public vistaReportePersonalizado(JasperPrint jrPrint) {
		super(jrPrint);
	}

}
