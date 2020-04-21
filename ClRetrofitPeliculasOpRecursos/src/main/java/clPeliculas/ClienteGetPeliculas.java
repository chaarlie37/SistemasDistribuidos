package clPeliculas;

import java.util.List;

import retrofit.RestAdapter;

public class ClienteGetPeliculas {

	public static void main(String[] args) {

		RestAdapter adapter = new RestAdapter.Builder().setEndpoint(
				"http://localhost:8080").build();

		PeliculasService service = adapter.create(PeliculasService.class);

		List<Pelicula> peliculas = service.getPeliculas();

		for (Pelicula pelicula : peliculas) {
			System.out.println(pelicula.getTitulo());
		}
	}
}
