package ejercicio1RecuPepeSegura;

import java.util.List;

/*Crear una lista (usando ArrayList) de películas que se proyectan en un cine.
Se debe tener un método para verlas todas,
otro para mostrar una película concreta buscada por el título y 
otra buscando la película por la sala donde se está
proyectando (consideramos que solo se proyecta una sala película en casa sala).*/
public class Cine {
	
	//Atributos
	private List<Pelicula> lista;

	//Constructor
	public Cine(List<Pelicula> lista) {
		super();
		this.lista = lista;
	}
	
	//Getters and setters
	public List<Pelicula> getLista() {
		return lista;
	}

	public void setLista(List<Pelicula> lista) {
		this.lista = lista;
	}
	//Agregar película
	public void agregarPelícula(Pelicula p) {
		lista.add(p);
	}
	
	//Eliminar película
	public void eliminarPelícula(Pelicula p) {
		lista.remove(p);
	}
	
	//Buscar Pelicula
	public Pelicula findByTitulo(String  titulo) {
		 for (Pelicula pelicula : lista) {
	            if (pelicula.getTitulo().equalsIgnoreCase(titulo)) {
	                return pelicula;
	            }
	        
	
		 }
		 return null;
	}
	
	//Listar Películas
	public void catalogo() {
	
			for (Pelicula pelicula : lista) {
				System.out.println("Pelicula : " +pelicula.titulo);
			}
		}
		
	
	
	//Buscar por sala suponiendo que cada sala solo puede proyectar una pelicula
	   public Pelicula buscarPeliculaPorSala(int sala) {
	        for (Pelicula pelicula : lista) {
	            if (pelicula.getSala() == sala) {
	                return pelicula;
	            }
	        }
	        return null; // No se encontró la película en esa sala
	    }

}
