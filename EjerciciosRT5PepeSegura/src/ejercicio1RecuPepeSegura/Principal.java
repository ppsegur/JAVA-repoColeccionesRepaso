package ejercicio1RecuPepeSegura;

import java.util.ArrayList;
import java.util.List;

import utilidades.Leer;

/*Crear una lista (usando ArrayList) de películas que se proyectan en un cine.
Se debe tener un método para verlas todas,
otro para mostrar una película concreta buscada por el título y 
otra buscando la película por la sala donde se está
proyectando (consideramos que solo se proyecta una sala película en casa sala).*/
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		//
		String titulo;
		int sala;
		int op;
		List<Pelicula> lista = new ArrayList<>();
		
		Pelicula p= new Pelicula("Kill bill", 1);
		Pelicula p1= new Pelicula("Avengers", 2);

		
		
		
		Cine c = new Cine(lista);
		c.agregarPelícula(p);
		c.agregarPelícula(p1);
		
		do {
			System.out.println("""
					Elija una opcion 	
					
					1 Ver el catalogo de peliculas 
					2 Agregar una pelicula
					3 Buscar una pelicula por nombre 
					4 Buscar pelicula por sala
					""");
			op=Leer.datoInt();
			switch (op) {
			case 1:
				c.catalogo();
				break;
			case 2: 
				System.out.println("Diga nuevo titulo");
				titulo=Leer.dato();
				System.out.println("Asignele una sala");
				sala=Leer.datoInt();
				Pelicula p3 = new Pelicula(titulo, sala);
				c.agregarPelícula(p3);
				break;
			case 3:
				System.out.println("Diga el nombre de la pelicula");
				titulo = Leer.dato();
			Pelicula buscada=	c.findByTitulo(titulo);
			if(buscada!=null){
				System.out.println(buscada.getTitulo()+"  estará proyectada en la sala "+buscada.getSala());
			}else {
				System.out.println("No existe");
			}
				break;
			case 4:
				System.out.println("Diga el numero de sala");
				sala = Leer.datoInt();
			Pelicula buscadaSala=	c.buscarPeliculaPorSala(sala);
			
			if(buscadaSala!=null){
				System.out.println(buscadaSala.getTitulo()+"  será proyectada en la sala "+buscadaSala.getSala());
			}else {
				System.out.println("No existe");
			}
				break;
			default:
				break;
			}
		} while (op!=10);
	}

}
