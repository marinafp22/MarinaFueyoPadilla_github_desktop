package ppGitHubDesktop;

public class Usuario {
	
	String DNI, nombre, apellidos;

	public Usuario(String dNI, String nombre, String apellidos) {
		super();
		DNI = dNI;
		this.nombre = nombre;
		this.apellidos = apellidos;
	}

	public Usuario() {
		super();
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dni) {
		DNI = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

}

