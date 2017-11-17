package util;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.Map;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

import interfaces.ReportModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.engine.export.ooxml.JRXlsxExporter;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.export.SimpleExporterInput;
import net.sf.jasperreports.export.SimpleOutputStreamExporterOutput;
import net.sf.jasperreports.export.SimplePdfReportConfiguration;
import net.sf.jasperreports.export.SimpleXlsxReportConfiguration;
import net.sf.jasperreports.view.JasperViewer;
import singleton.Conexion;

public abstract class AbstracReporte implements ReportModel {
	private JasperPrint print = null;

	@Override
	public void generarReporte(String nombreReporteFuente, Map<String, Object> parametros) {

		try {
			JasperReport report = (JasperReport) JRLoader
					.loadObjectFromFile("reportes/" + nombreReporteFuente + ".jasper");

			JasperPrint print = JasperFillManager.fillReport(report, parametros,
					Conexion.getInstancia().getConnection());

			JasperViewer viewer = new JasperViewer(print, false);
			viewer.setVisible(true);

		} catch (JRException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void generarReporte(String nombreReporteFuente) {
		generarReporte(nombreReporteFuente, null);
	}

	@Override
	public vistaReportePersonalizado generarReporteVisor(String nombreReporteFuente, Map<String, Object> parametros) {

		try {
			JasperReport report = (JasperReport) JRLoader
					.loadObjectFromFile("reportes/" + nombreReporteFuente + ".jasper");

			print = JasperFillManager.fillReport(report, parametros, Conexion.getInstancia().getConnection());

		} catch (JRException e) {
			e.printStackTrace();
		}

		return new vistaReportePersonalizado(print);

	}

	@Override
	public vistaReportePersonalizado generarReporteVisor(String nombreReporteFuente) {
		return generarReporteVisor(nombreReporteFuente, null);
	}

	private String obtenerRuta(FileNameExtensionFilter filtro) {

		JFileChooser jf = new JFileChooser();

		jf.setFileFilter(filtro);
		jf.setSelectedFile(new File(System.getProperty("user.home") + "/desktop/filename"));

		if (jf.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {

			return jf.getSelectedFile().getPath();
		}
		return null;

	}

	private void abrirArchivo(String ruta) {
		try {
			Desktop.getDesktop().open(new File(ruta));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void guardarComoPdf() {
		String extensionDocument="pdf";
		FileNameExtensionFilter filtro = new FileNameExtensionFilter("*."+extensionDocument+"", extensionDocument);
		String ruta = obtenerRuta(filtro);

		boolean compruebaExtension = ruta.trim().toLowerCase().substring(ruta.length() - 3, ruta.length())
				.equals(extensionDocument);
		String rutaFinal = compruebaExtension ? ruta : ruta + "." +extensionDocument;
		try {
			// JasperExportManager.exportReportToPdfFile(print, rutaFinal);
			JRPdfExporter exp = new JRPdfExporter();
			exp.setExporterInput(new SimpleExporterInput(print));
			exp.setExporterOutput(new SimpleOutputStreamExporterOutput(rutaFinal));
			SimplePdfReportConfiguration conf = new SimplePdfReportConfiguration();
			exp.setConfiguration(conf);
			exp.exportReport();

			abrirArchivo(rutaFinal);

		} catch (JRException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void guardarComoXls() {
		String extensionDocument="xlsx";
		FileNameExtensionFilter filtro = new FileNameExtensionFilter("*."+extensionDocument+"", extensionDocument);
		String ruta = obtenerRuta(filtro);

		boolean compruebaExtension = ruta.trim().toLowerCase().substring(ruta.length() - 3, ruta.length()-1)
				.equals(extensionDocument);
		String rutaFinal = compruebaExtension ? ruta : ruta + "." +extensionDocument;
		try {
			JRXlsxExporter exp = new JRXlsxExporter();
			exp.setExporterInput(new SimpleExporterInput(print));
			exp.setExporterOutput(new SimpleOutputStreamExporterOutput(rutaFinal));
			SimpleXlsxReportConfiguration conf = new SimpleXlsxReportConfiguration();
			conf.setOnePagePerSheet(true);
			exp.setConfiguration(conf);
			exp.exportReport();

			abrirArchivo(rutaFinal);

		} catch (JRException e) {
			e.printStackTrace();
		}
	}

}
