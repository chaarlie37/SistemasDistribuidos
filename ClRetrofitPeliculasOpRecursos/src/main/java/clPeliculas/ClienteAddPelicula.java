package clPeliculas;

import java.util.ArrayList;
import java.util.List;

import retrofit.RestAdapter;

public class ClienteAddPelicula {

	public static void main(String[] args) {

		RestAdapter adapter = new RestAdapter.Builder().setEndpoint(
				"http://localhost:8080").build();

		PeliculasService service = adapter.create(PeliculasService.class);

		List<Actor> players = new ArrayList<Actor>();
		players.add(new Actor("Javier Gutiérrez","Marco"));
		players.add(new Actor("Juan Margallo","Julio"));
		Pelicula pelicula = new Pelicula("Campeones", players);

		boolean created = service.addPelicula(pelicula);

		System.out.println("Creada: "+created);

		Pelicula nuevaPelicula = service.getPelicula("Campeones");

		System.out.println(nuevaPelicula.getTitulo());
	}
}
