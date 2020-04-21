package clPeliculas;

import retrofit.RestAdapter;

public class ClienteGetPelicula {

	public static void main(String[] args) {

		RestAdapter adapter = new RestAdapter.Builder().setEndpoint(
				"http://localhost:8080").build();

		PeliculasService service = adapter.create(PeliculasService.class);

		Pelicula pelicula = service.getPelicula("Mamá cumple cien años");

		System.out.println(pelicula.getTitulo());
	}
}
