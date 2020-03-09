package es.sd;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MostrarAnuncio {

    @RequestMapping("anuncio{num}")
    public String mostrarAnuncio(@PathVariable("num") String num, Model model){
        System.out.println("num" + num);
        int index = Integer.parseInt(num);
        model.addAttribute("anuncio", TablonAnuncios.getAnuncio(index));
        return "anuncio_template";
    }

}
