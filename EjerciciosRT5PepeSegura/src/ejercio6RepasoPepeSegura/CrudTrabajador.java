package ejercio6RepasoPepeSegura;
/*Guardar varios trabajadores en una colección y mostrar los trabajadores ordenados
según el número
de horas trabajadas(de menor a mayor y viceversa) y según el sueldo (del que más al que menos cobra).
Se deben usar las interfaces comparable y/o comparator*/

import java.util.List;

public class CrudTrabajador {
	//Atributos
	private List<Trabajador> listilla;

	//Constructor
	public CrudTrabajador(List<Trabajador> listilla) {
		super();
		this.listilla = listilla;
	}
	//Gettter and setter
	//Listar trabajadores
	public List<Trabajador> getListilla() {
		return listilla;
	}

	public void setListilla(List<Trabajador> listilla) {
		this.listilla = listilla;
	}
	//Agregar Trabajador
	public void agregarTrabajador(Trabajador t) {
		listilla.add(t);
	}
	//Eliminar trabajador
	public void eliminarTrabajador(Trabajador t) {
		listilla.remove(t);
	}
	
}
