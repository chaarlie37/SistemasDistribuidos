package es.sd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AnunciosRestController {

    @Autowired
    private AnunciosService anunciosService;


    @RequestMapping(value = "/anuncios", method = RequestMethod.GET)
    public List<Anuncio> getAnuncios(){
        return anunciosService.getAnuncios();
    }

    @RequestMapping(value = "/anuncio/{asuntoAnuncio}", method = RequestMethod.GET)
    public Anuncio getAnuncio(@PathVariable("asuntoAnuncio") String asunto){
        return anunciosService.getAnuncio(asunto);
    }

    @RequestMapping(value = "/anuncios", method = RequestMethod.POST)
    public ResponseEntity<Boolean> addAnuncio(@RequestBody Anuncio anuncio){
        anunciosService.addAnuncio(anuncio);
        return new ResponseEntity<>(true, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/anuncios/{asuntoAnuncio}", method = RequestMethod.POST)
    public ResponseEntity<Boolean> modifyAnuncio(@PathVariable("asuntoAnuncio") String asunto, @RequestBody Anuncio anuncio){
        anunciosService.modifyAnuncio(asunto, anuncio);
        return new ResponseEntity<>(true, HttpStatus.OK);
    }

}
