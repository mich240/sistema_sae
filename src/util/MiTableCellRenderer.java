package util;

import java.awt.Component;

import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

public class MiTableCellRenderer implements TableCellRenderer {
	private TableCellRenderer tcr;

	public MiTableCellRenderer(TableCellRenderer tcr) {
		this.tcr = tcr;
	}

	@Override
	public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus,
			int row, int column) {
		table.getTableHeader().getDefaultRenderer();

		JComponent wth = (JComponent) tcr.getTableCellRendererComponent(table, value, isSelected, hasFocus, row,
				column);

		JLabel label = (JLabel) wth;

		label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		return wth;

	}

}
