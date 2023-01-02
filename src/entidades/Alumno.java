package entidades;

public class Alumno {
	
	private String nombre;
	private String segundoNombre;
	private String apellido;
	private String dni;
	private String email;
	private String telefono;
	private String celular;
	
	private boolean[] esRegular = new boolean [200];
	
	public Alumno(String nombre, String segundoNombre, String apellido, String dni, String email, String telefono,
			String celular) {
		this.nombre = nombre;
		this.segundoNombre = segundoNombre;
		this.apellido = apellido;
		this.dni = dni;
		this.email = email;
		this.telefono = telefono;
		this.celular = celular;
	}

	public void setEsRegular(boolean[] esRegular) {
		this.esRegular = esRegular;
	}

	public boolean[] getEsRegular() {
		return esRegular;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getSegundoNombre() {
		return segundoNombre;
	}

	public void setSegundoNombre(String segundoNombre) {
		this.segundoNombre = segundoNombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}



	
}
