package util;

import javax.swing.JTable;
import javax.swing.ListSelectionModel;

public class restruc {

	public static void estilizarTabla(JTable tabla) {
		tabla.getTableHeader().setReorderingAllowed(false);
		tabla.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		if (tabla.getRowCount()!=0) {
		//	tabla.setRowSelectionInterval(0, 0);	
			tabla.setRowHeight(25);
		}
	}
	
}
