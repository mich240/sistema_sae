package modelo.tableModel;

import javax.swing.table.DefaultTableModel;

public class MiDefaultTableModel extends DefaultTableModel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1943655059041993605L;

	@Override
	public boolean isCellEditable(int row, int column) {
		return false;
	}

}
