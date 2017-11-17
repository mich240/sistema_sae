package interfaces;

import java.util.Map;

import util.vistaReportePersonalizado;

public interface ReportModel {

	public void generarReporte(String nombreReporteFuente,Map<String, Object> parametros);
	
	public void generarReporte(String nombreReporteFuente);
	
	public vistaReportePersonalizado generarReporteVisor(String nombreReporteFuente, Map<String, Object> parametros);
	
	public vistaReportePersonalizado generarReporteVisor(String nombreReporteFuente);
	
	public void guardarComoPdf();
	
	public void guardarComoXls();
	
}
