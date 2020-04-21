package es.sd;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class AnunciosService {

    private Map<String, Anuncio> anuncioMap = new HashMap<>();

    public AnunciosService(){
        Persona p1 = new Persona("charlie", "Carlos", "Sanchez");
        Persona p2 = new Persona("moraales", "Elena", "Morales");
        Anuncio a1 = new Anuncio(p1, "Asunto1", "aaaaaaaaaaaaaaa");
        Anuncio a2 = new Anuncio(p2, "Asunto2", "bbbbbbbbbbbbbbbbbbbbbbbb");
        anuncioMap.put(a1.getAsunto(), a1);
        anuncioMap.put(a2.getAsunto(), a2);
    }

    public Anuncio getAnuncio(String asunto){
        return anuncioMap.get(asunto);
    }

    public List<Anuncio> getAnuncios(){
        return new ArrayList<Anuncio>(anuncioMap.values());
    }

    public void addAnuncio(Anuncio anuncio){
        this.anuncioMap.put(anuncio.getAsunto(), anuncio);
    }

    public void modifyAnuncio(String antiguo, Anuncio nuevo){
        this.anuncioMap.remove(antiguo);
        this.anuncioMap.put(nuevo.getAsunto(), nuevo);
    }

}
