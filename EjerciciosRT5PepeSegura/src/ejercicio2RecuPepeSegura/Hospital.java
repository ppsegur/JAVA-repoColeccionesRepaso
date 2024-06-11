package ejercicio2RecuPepeSegura;

import java.util.ArrayList;

public class Hospital {
	
	private ArrayList<Paciente> pacientes;

	public ArrayList<Paciente> getPacientes() {
		return pacientes;
	}

	public void setPacientes(ArrayList<Paciente> pacientes) {
		this.pacientes = pacientes;
	}
	
	public void agregarPaciente(Paciente p) {
		 pacientes.add(p);
	}
	
}
