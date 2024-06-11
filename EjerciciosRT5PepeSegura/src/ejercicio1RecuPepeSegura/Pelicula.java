package ejercicio1RecuPepeSegura;
/*Crear una lista (usando ArrayList) de películas que se proyectan en un cine.
Se debe tener un método para verlas todas,
otro para mostrar una película concreta buscada por el título y 
otra buscando la película por la sala donde se está
proyectando (consideramos que solo se proyecta una sala película en casa sala).*/
public class Pelicula {
	
	//Atributos
	public String titulo;
	public int Sala;
	//Constructor
	public Pelicula(String titulo, int sala) {
		super();
		this.titulo = titulo;
		Sala = sala;
	}
	//Getters and setters
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getSala() {
		return Sala;
	}
	public void setSala(int sala) {
		Sala = sala;
	}

}
