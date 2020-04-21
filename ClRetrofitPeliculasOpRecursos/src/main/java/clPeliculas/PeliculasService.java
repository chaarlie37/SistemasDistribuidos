package clPeliculas;

import java.util.List;

import retrofit.http.Body;
import retrofit.http.GET;
import retrofit.http.POST;
import retrofit.http.PUT;
import retrofit.http.Path;

public interface PeliculasService {

	@GET("/peliculas")
	List<Pelicula> getPeliculas();

	@GET("/pelicula/{tituloPelicula}")
	Pelicula getPelicula(@Path("tituloPelicula") String tituloPelicula);
	
	@POST("/peliculas")
	boolean addPelicula(@Body Pelicula pelicula);
	
	@PUT("/peliculas/{tituloPelicula}")
	boolean modifyPelicula(@Path("tituloPelicula") String tituloPelicula, @Body Pelicula pelicula);
}