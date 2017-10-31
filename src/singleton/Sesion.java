package singleton;

import java.awt.Component;
import java.sql.Time;
import java.util.Date;

import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

import modelo.sesion.SesionDao;
import modelo.sesion.SesionModel;
import modelo.usuario.UsuarioDao;
import modelo.usuario.UsuarioModel;
import util.StringMD;

public class Sesion {
	private static UsuarioModel user;
	private static boolean is_Sesion;
	private static SesionModel ses;
	private static SesionDao ssDao;
	private static Date date;
	private static Sesion Sesion = new Sesion();

	public static Sesion getSesion() {
		return Sesion;
	}

	public static boolean isSesion() {
		return is_Sesion;
	}

	public static void CrearSesion(UsuarioModel us) {
		// registro ahora la Sesion en base al usuario.
		if (user == null) {
			/// establesco los datos de la Sesion
			date = new Date();
			ses = new SesionModel();
			ssDao = new SesionDao();
			ses.setFechaInicio(new java.sql.Date(date.getTime()));
			ses.setHoraInicio(new Time(date.getTime()));
			ses.setFechaSalida(new java.sql.Date(date.getTime()));
			ses.setHoraSalida(new Time(date.getTime()));
			ses.setUsuario_id(us.getId());
			/***
			 * registro la Sesion en la db y recupero el id creado para tenerlo en la Sesion
			 * guardo la clave primaria q retorna el metodo SesionLoginRegistro
			 */
			ses.setId(ssDao.SesionLoginRegistro(ses));

			user = us;// guardo el usuario aqui para acceder a sus datos
			System.out.println("Sesión creada.");
			Auditoria.evento("inicio de sesión.");
			is_Sesion = true;// la Sesion ya existe por lo tanto es una Sesion
		} else// error si intentan volver a crear una Sesion para cambiar datos del usuario
			System.out.println("Imposible volver a crear una Sesión");
	}

	public void DestroyerSesion() {
		if (user != null) {
			Auditoria.evento("cerro sesión.");
			/// establesco los datos para finalizar sesion
			date = new Date();
			ses.setFechaSalida(new java.sql.Date(date.getTime()));
			ses.setHoraSalida(new Time(date.getTime()));
			ssDao.SesionLogOutRegistro(ses);
			user = null;// elimino al usuario y a la sesion activas
			ses = null;
			is_Sesion = false;// ya no tengo sesion
			System.out.println("Sesión terminada.");
		} else
			System.out.println("No se ha iniciado una Sesión");

	}

	public void refresh() {
		UsuarioDao us = new UsuarioDao();
		user = us.recuperarUsuarioRefresh(getSesion().getIdUser());
	}

	public int getIdSesion() {
		return ses.getId();
	}

	public int getIdUser() {
		return user.getId();
	}

	public int getCedula() {
		return user.getCedula();
	}

	public String getNombre() {
		return user.getNombre();
	}

	public String getApellido() {
		return user.getApellido();
	}

	public String getUsuario() {
		return user.getUsuario();
	}

	public String getClave() {
		return user.getClave();
	}

	public int getPregunta() {
		return user.getPregunta();
	}

	public String getRespusta() {
		return user.getRespuesta();
	}

	public int getTipoUsuario() {
		return user.getTipoUsuario();
	}

	public int getStatus() {
		return user.getStatus();
	}

	public String toString() {
		return "[ID_Sesion]=" + ses.getId() + " " + user.toString();
	}

	public static boolean confirmarClave(Component parent) {
		JPasswordField selfpass = new JPasswordField();
		Object confirm[] = { "Confirme su contraseña de usuario.", selfpass };
		if (JOptionPane.showConfirmDialog(parent, confirm, "Confirmar contraseña", JOptionPane.YES_NO_OPTION,
				JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {

			if (StringMD.Encriptar(new String(selfpass.getPassword())).equals(getSesion().getClave())) {
				return true;
			} else {
				JOptionPane.showMessageDialog(parent, "Contraseña incorrecta.", "Incorrecto",
						JOptionPane.ERROR_MESSAGE);
				return false;
			}
		}

		return false;
	}

	public static boolean confirmarClaveOtroUsuario(Component parent, String userName) {
		if (getSesion().getUsuario().trim().equals(userName.trim())) {
			if (confirmarClave(parent)) {
				return true;
			} else
				return false;
		} else if (confirmarClave(parent)) {
			JPasswordField selfpass = new JPasswordField();

			Object confirm[] = { "Confirme la contraseña del usuario \"" + userName + "\"", selfpass };
			if (JOptionPane.showConfirmDialog(parent, confirm, "Usuario " + userName + " confirma tu contraseña.",
					JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
				UsuarioDao useD = new UsuarioDao();

				if (StringMD.Encriptar(new String(selfpass.getPassword()))
						.equals(useD.recuperarClaveOtroUsuario(userName))) {
					return true;
				} else {
					JOptionPane.showMessageDialog(parent, "Contraseña incorrecta.", "Incorrecto",
							JOptionPane.ERROR_MESSAGE);
					return false;
				}
			}
		}
		return false;
	}

	private static  boolean compruebaSiRestringe(){
		if (getSesion().getTipoUsuario()!=1) {
			return true;
		}
		return false;
	}
	
	
	public static void restringeVisible(JComponent componente) {
		if (compruebaSiRestringe()) {
			componente.setVisible(false);
		}
	}

	public static void restringeEnable(JComponent componente) {
		if (compruebaSiRestringe()) {
			componente.setEnabled(false);
		}
	}

}
