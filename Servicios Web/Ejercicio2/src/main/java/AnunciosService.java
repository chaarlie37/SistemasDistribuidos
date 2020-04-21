import retrofit.http.*;

import java.util.List;

public interface AnunciosService {


    @GET("/anuncios")
    List<Anuncio> getAnuncios();

    @GET("/anuncio/{asuntoAnuncio}")
    Anuncio getAnuncio(@Path("asuntoAnuncio") String asunto);

    @POST("/anuncios")
    boolean addAnuncio(@Body Anuncio anuncio);

    @PUT("/anuncios/{asuntoAnuncio}")
    boolean modifyAnuncio(@Path("asuntoAnuncio") String asuntoAnuncio, @Body Anuncio anuncio);

}
