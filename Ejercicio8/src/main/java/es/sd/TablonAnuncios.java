package es.sd;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
public class TablonAnuncios {

    private static ArrayList<Anuncio> anuncios = new ArrayList<>();

    @RequestMapping("/")
    public String mostrarTablon(Model model){
        model.addAttribute("anuncios", anuncios);
        return "tablon_template";
    }

    public static void addAnuncio(Anuncio anuncio){
        anuncios.add(anuncio);
    }

    public static Anuncio getAnuncio(int index){
        return anuncios.get(index);
    }
}
