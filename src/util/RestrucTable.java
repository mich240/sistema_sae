package util;

import java.awt.Component;

import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;

public class RestrucTable implements TableCellRenderer{

	public static void estilizarTabla(JTable tabla) {
		tabla.getTableHeader().setReorderingAllowed(false);
		tabla.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		if (tabla.getRowCount()!=0) {
		//	tabla.setRowSelectionInterval(0, 0);	
			tabla.setRowHeight(25);
		}
		centarTextoCelda(tabla);
	}
	
	 TableCellRenderer tcr;
	    public RestrucTable(TableCellRenderer tcr){
	        this.tcr = tcr;
	    }
	
	
	public static void centarTextoCelda(JTable tabla){
		DefaultTableCellRenderer alinear = new DefaultTableCellRenderer();
		alinear.setHorizontalAlignment(SwingConstants.CENTER);
		for (int i = 0; i < tabla.getColumnCount(); i++) {
			tabla.getColumnModel().getColumn(i).setCellRenderer(alinear);
		}
	}
	
	
	@Override
	public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
       table.getTableHeader().getDefaultRenderer();
		
		JComponent wth = (JComponent) tcr.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
       
		
		JLabel label = (JLabel)wth;
       
		
		label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        return wth;
        
    }
	
}
