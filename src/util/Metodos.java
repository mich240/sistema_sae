package util;

import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;

public class Metodos {

	public static void formatearTabla(JTable tabla) {
		tabla.getTableHeader().setReorderingAllowed(false);
		tabla.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		if (tabla.getRowCount() != 0) {
			// tabla.setRowSelectionInterval(0, 0);
			tabla.setRowHeight(25);
		}
		centrarTextoTabla(tabla);

	}

	public static void centrarTextoTabla(JTable tabla) {
		DefaultTableCellRenderer alinear = new DefaultTableCellRenderer();
		alinear.setHorizontalAlignment(SwingConstants.CENTER);
		for (int i = 0; i < tabla.getColumnCount(); i++) {
			tabla.getColumnModel().getColumn(i).setCellRenderer(alinear);
		}
		TableCellRenderer tcr = tabla.getTableHeader().getDefaultRenderer();
		tabla.getTableHeader().setDefaultRenderer(new MiTableCellRenderer(tcr));
	}

	public static boolean validaTextoMsj(String producto) {
		if (producto.equals("")) {
			return false;
		} else if (String.valueOf(producto.charAt(0)).equals(" ")) {
			return false;
		} else
			return true;
	}

}
