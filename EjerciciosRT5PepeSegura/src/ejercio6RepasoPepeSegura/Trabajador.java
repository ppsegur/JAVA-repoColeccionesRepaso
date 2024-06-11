package ejercio6RepasoPepeSegura;
/*Crear una clase Trabajador con los siguientes atributos: nombre, DNI,
 *  Horas trabajadas y sueldo final
(este se puede calcular de cualquier manera sencilla de las que hemos
 visto anteriormente en otros
ejercicios).*/
public class Trabajador {
	
	//Atributos de la clase 
	public String nombre;
	public String DNI;
	public double  horasTrabajadas;
	public double sueldoFinal;
	
	//Constructor
	public Trabajador(String nombre, String dNI, double horasTrabajadas, double sueldoFinal) {
		super();
		this.nombre = nombre;
		DNI = dNI;
		this.horasTrabajadas = horasTrabajadas;
		this.sueldoFinal = sueldoFinal;
	}
	
	//Getters and setters 
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public double getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public void setHorasTrabajadas(double horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}

	public double getSueldoFinal() {
		return sueldoFinal;
	}

	public void setSueldoFinal(double sueldoFinal) {
		this.sueldoFinal = sueldoFinal;
	}
	
	//Método para calcular salario
	public double calcularSueldoFinal(double gananciaHora) {
		return gananciaHora * horasTrabajadas;
	}
	}


