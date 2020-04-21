import retrofit.RestAdapter;

public class Cliente {
    public static void main(String[] args) {
        RestAdapter adapter = new RestAdapter.Builder().setEndpoint("http://localhost:8080").build();

        AnunciosService service = adapter.create(AnunciosService.class);

        Anuncio anuncio = service.getAnuncio("Asunto1");

        System.out.println(anuncio.toString());
    }
}
