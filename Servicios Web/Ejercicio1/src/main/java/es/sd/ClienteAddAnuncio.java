package es.sd;

import retrofit.RestAdapter;

public class ClienteAddAnuncio {


    public void addAnuncio(){
        RestAdapter adapter = new RestAdapter.Builder().setEndpoint("http://localhost:8080").build();

        AnunciosService service = adapter.create(AnunciosService.class);

        Anuncio anuncio = service.getAnuncio("Asunto1");

        System.out.println(anuncio.toString());
    }

}

