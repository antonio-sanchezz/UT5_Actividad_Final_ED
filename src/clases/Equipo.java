package clases;

public class Equipo {

	private String nombre;
	private String localidad;
	private int victorias;
	
	

	public Equipo(String nombre, String localidad, int victorias) {
		this.nombre = nombre;
		this.localidad = localidad;
		this.victorias = victorias;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public int getVictorias() {
		return victorias;
	}

	public void setVictorias(int victorias) {
		this.victorias = victorias;
	}
}
