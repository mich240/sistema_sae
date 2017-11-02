package singleton;

import modelo.transaccion.TransaccionDao;
import modelo.transaccion.TransaccionModel;

public class Transaccion {

	public static TransaccionModel TransaccionActiva=null;

	public static TransaccionModel getTransaccionActiva() {
		return TransaccionActiva;
	}

	public static void setTransaccionActiva(TransaccionModel transaccionActiva) {
		TransaccionActiva = transaccionActiva;
	}

	public static void recuperaTransaccion() {
		TransaccionDao trs=new TransaccionDao();			
		setTransaccionActiva(trs.recuperaTransaccionActiva());
	}

}
