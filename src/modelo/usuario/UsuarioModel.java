package modelo.usuario;

public class UsuarioModel {
	private int Id;
	private int Cedula;
	private String Nombre;
	private String Apellido;
	private String Usuario;
	private String Clave;
	private int Pregunta;
	private String Respusta;
	private int TipoUsuario;
	private int Status = 1;/// activo es 1 inactivo es 0 por eso po pongo en 1 por defecto.

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public int getCedula() {
		return Cedula;
	}

	public void setCedula(int cedula) {
		Cedula = cedula;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public String getUsuario() {
		return Usuario;
	}

	public void setUsuario(String usuario) {
		Usuario = usuario;
	}

	public String getClave() {
		return Clave;
	}

	public void setClave(String clave) {
		Clave = clave;
	}

	public String getRespusta() {
		return Respusta;
	}

	public void setRespusta(String respusta) {
		Respusta = respusta;
	}

	public int getStatus() {
		return Status;
	}

	public void setStatus(int status) {
		Status = status;
	}

	public int getPregunta() {
		return Pregunta;
	}

	public void setPregunta(int pregunta) {
		Pregunta = pregunta;
	}

	public int getTipoUsuario() {
		return TipoUsuario;
	}

	public void setTipoUsuario(int tipoUsuario) {
		TipoUsuario = tipoUsuario;
	}

	@Override
	public String toString() {
		return "usuario [Id=" + Id + ", Cedula=" + Cedula + ", Nombre=" + Nombre + ", Apellido=" + Apellido
				+ ", Usuario=" + Usuario + ", Clave=" + Clave + ", Pregunta=" + Pregunta + ", Respusta=" + Respusta
				+ ", TipoUsuario=" + TipoUsuario + ", Status=" + Status + "]";
	}

}
