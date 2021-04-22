package clases;

public class Jugador extends Persona {

	private int dorsal;
	private int numeroDeGoles;

	public Jugador(String nombre, String apellidos, int edad, String nombreEquipo, Double salario, int dorsal,
			int numeroDeGoles) {
		super(nombre, apellidos, edad, nombreEquipo, salario);
		this.dorsal = dorsal;
		this.numeroDeGoles = numeroDeGoles;
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public int getNumeroDeGoles() {
		return numeroDeGoles;
	}

	public void setNumeroDeGoles(int numeroDeGoles) {
		this.numeroDeGoles = numeroDeGoles;
	}

}
