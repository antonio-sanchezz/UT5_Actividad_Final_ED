package clases;

public class Persona {

	private String nombre;
	private String apellidos;
	private int edad;
	private String nombreEquipo;
	private Double salario;

	public Persona(String nombre, String apellidos, int edad, String nombreEquipo, Double salario) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.nombreEquipo = nombreEquipo;
		this.salario = salario;
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

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombreEquipo() {
		return nombreEquipo;
	}

	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	public String obtenerDatosPersonales() {
		return "Nombre: " + nombre + " Apellidos: " + apellidos + " Edad: " + edad;
	}

}
