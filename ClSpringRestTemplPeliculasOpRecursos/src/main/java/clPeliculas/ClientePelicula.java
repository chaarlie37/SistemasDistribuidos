package clPeliculas;

import org.springframework.web.client.RestTemplate;

public class ClientePelicula {

	public static void main(String[] args) {

		RestTemplate restTemplate = new RestTemplate();
		        
		String url = "http://localhost:8080/pelicula/Mamá cumple cien años";
		
		Pelicula peli = restTemplate.getForObject(url, Pelicula.class);
		
		System.out.println(peli.getTitulo());
	}
}
