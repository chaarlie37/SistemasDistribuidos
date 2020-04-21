package es.sd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.PostConstruct;
import java.util.Optional;

@Controller
public class AnuncioController {

    @Autowired
    private AnuncioRepository anuncioRepository;
    @Autowired
    private PersonasRepository personasRepository;

    @PostConstruct
    public void init(){
        Persona p1 = new Persona("Pepe_", "Pepe", "ApellidosPepe");
        Persona p2 = new Persona("Juan_", "Juan", "ApellidosJuan");
        personasRepository.save(p1);
        personasRepository.save(p2);
        anuncioRepository.save(new Anuncio(p1, "Hola", "XXX"));
        anuncioRepository.save(new Anuncio(p2, "Adios", "YYY"));
    }

    @RequestMapping("/")
    public String mostrarTablon(Model model){
        model.addAttribute("anuncios", anuncioRepository.findAll());
        return "tablon_template";
    }

    @RequestMapping("/insertar")
    public String insertarAnuncio(Model model){
        //model.addAttribute("anuncio", anuncioRepository.findAll());
        model.addAttribute("personas", personasRepository.findAll());
        return "insertaranuncio_template";
    }

    @RequestMapping("/guardar_anuncio")
    String guardarAnuncio(String usuario, Anuncio anuncio, Model model){
        Persona p = personasRepository.findByUsuario(usuario);
        anuncio.setAutor(p);
        anuncioRepository.save(anuncio);
        System.out.println(anuncio);
        return "insertado_anuncio";
    }

    @RequestMapping("anuncio{num}")
    public String mostrarAnuncio(@PathVariable("num") String num, Model model){
        long index = Long.parseLong(num);
        Optional<Anuncio> anuncio = anuncioRepository.findById(index);
        if(anuncio.isPresent())
            model.addAttribute("anuncio", anuncio.get());
        System.out.println("anuncio:  " + anuncio.get().toString());
        return "anuncio_template";
    }

}
