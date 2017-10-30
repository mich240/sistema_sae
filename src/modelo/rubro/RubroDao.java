package modelo.rubro;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import modelo.tableModel.MiDefaultTableModel;
import singleton.Conexion;

public class RubroDao {

	public TableModel recuperaTodosRubroTabla() {
		Statement st = null;
		ResultSet rs = null;

		DefaultTableModel modelTabla = new MiDefaultTableModel();

		String sql = "SELECT * FROM rubro";
		modelTabla.setColumnIdentifiers(new String[] { "Codigo", "Rubros" });

		try {
			st = Conexion.getInstancia().getConnection().createStatement();

			rs = st.executeQuery(sql);

			while (rs.next()) {

				modelTabla.addRow(new Object[] { rs.getInt(1), rs.getString(2) });

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return modelTabla;

	}

}
