package ejercio6RepasoPepeSegura;

import java.util.ArrayList;
import java.util.List;

import ejercicio2RecuPepeSegura.Paciente;
import utilidades.Leer;

/*Crear una clase Trabajador con los siguientes atributos: nombre, DNI,
 *  Horas trabajadas y sueldo final
(este se puede calcular de cualquier manera sencilla de las que hemos
 visto anteriormente en otros
ejercicios).
Guardar varios trabajadores en una colección y mostrar los trabajadores ordenados
 según el número
de horas trabajadas(de menor a mayor y viceversa) y según el sueldo (del que más al que menos cobra).
Se deben usar las interfaces comparable y/o comparator*/
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre, dni;
		double horasTrabajadas, gananciaHora;
		List<Trabajador> lista = new ArrayList<>();
		Trabajador t = new Trabajador("Pepe","11111111A", 15, 600);
		
		lista.add(t);
		CrudTrabajador ct = new CrudTrabajador(lista);
		int op = 0;
		do {
			
			
			System.out.println("""
						Elija una opcion 
						
						1. Agregar un Trabajador
						
						2.Listar trabajadores
						
					""");
				op = Leer.datoInt();
			switch (op) {
			case 1:
				System.out.println("Elija el nombre del nuevo trabajador");
				nombre =Leer.dato();
				System.out.println("Elija el dni del nuevo trabajador");
				dni = Leer.dato();
				System.out.println("¿Cuántas horas trabajó?");
				horasTrabajadas = Leer.datoDouble();
				System.out.println("Diga las ganancias por horas");
				gananciaHora = Leer.datoDouble();
				
				t =new Trabajador(nombre,dni,horasTrabajadas ,t.calcularSueldoFinal(gananciaHora));
				ct.agregarTrabajador(t);
				System.out.println("Su trabajador se añadio con exito");
				break;
			case 2:
				ct.getListilla();
				break;
			default:
				break;
			}
		
	} while (op!=0); {
			
		

}}}
