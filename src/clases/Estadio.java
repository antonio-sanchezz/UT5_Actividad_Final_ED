package clases;

public class Estadio {

	private String nombre;
	private int capacidad;
	private String localidad;

	public Estadio(String nombre, int capacidad, String localidad) {
		this.nombre = nombre;
		this.capacidad = capacidad;
		this.localidad = localidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

}
