package clases;

import java.util.List;

public class Entrenador extends Persona {

	private List<Equipo> EquiposEntrenados;

	public Entrenador(String nombre, String apellidos, int edad, String nombreEquipo, Double salario,
			List<Equipo> equiposEntrenados) {
		super(nombre, apellidos, edad, nombreEquipo, salario);
		EquiposEntrenados = equiposEntrenados;
	}

	public List<Equipo> getEquiposEntrenados() {
		return EquiposEntrenados;
	}

	public void setEquiposEntrenados(List<Equipo> equiposEntrenados) {
		EquiposEntrenados = equiposEntrenados;
	}

}
