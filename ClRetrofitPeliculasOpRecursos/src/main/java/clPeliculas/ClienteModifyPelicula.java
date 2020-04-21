package clPeliculas;

import retrofit.RestAdapter;

public class ClienteModifyPelicula {

	public static void main(String[] args) {

		RestAdapter adapter = new RestAdapter.Builder().setEndpoint(
				"http://localhost:8080").build();

		PeliculasService service = adapter.create(PeliculasService.class);

		Pelicula pelicula = service.getPelicula("Mamá cumple cien años");
		

		Actor rafaela = new Actor("Rafaela Aparicio", "Mamá");
		
		pelicula.getReparto().add(rafaela);

		boolean modificado = service.modifyPelicula("Mamá cumple cien años", pelicula);

		System.out.println("Modificado: "+modificado);

		Pelicula nuevaPelicula = service.getPelicula("Mamá cumple cien años");

		System.out.println(nuevaPelicula);
	}
}
