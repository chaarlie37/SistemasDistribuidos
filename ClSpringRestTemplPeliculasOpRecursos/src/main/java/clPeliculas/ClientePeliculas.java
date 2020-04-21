package clPeliculas;

import org.springframework.web.client.RestTemplate;

public class ClientePeliculas {

	public static void main(String[] args) {

		RestTemplate restTemplate = new RestTemplate();
		        
		String url = "http://localhost:8080/peliculas";
		
		Pelicula[] peliculas = restTemplate.getForObject(url, Pelicula[].class);
		
		for (Pelicula pelicula : peliculas) {
			System.out.println(pelicula.getTitulo());
		}
	}
}
