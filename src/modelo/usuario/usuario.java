package modelo.usuario;


public class usuario {
	private int Id;
	private int Cedula=20088808;
	private String Nombre;
	private String Apellido;
	private String Usuario;
	private String Clave;
	private String Pregunta;
	private String Respusta;
	private String TipoUsuario;
	private int Status;
	
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
	
	public String getPregunta() {
		return Pregunta;
	}
	public void setPregunta(String pregunta) {
		Pregunta = pregunta;
	}
	
	public String getRespusta() {
		return Respusta;
	}
	public void setRespusta(String respusta) {
		Respusta = respusta;
	}
	
	public String getTipoUsuario() {
		return TipoUsuario;
	}
	public void setTipoUsuario(String tipoUsuario) {
		TipoUsuario = tipoUsuario;
	}
	
	public int getStatus() {
		return Status;
	}
	public void setStatus(int status) {
		Status = status;
	}
	@Override
	public String toString() {
		return "usuario [Id=" + Id + ", Cedula=" + Cedula + ", Nombre=" + Nombre + ", Apellido=" + Apellido
				+ ", Usuario=" + Usuario + ", Clave=" + Clave + ", Pregunta=" + Pregunta + ", Respusta=" + Respusta
				+ ", TipoUsuario=" + TipoUsuario + ", Status=" + Status + "]";
	}
	
}
