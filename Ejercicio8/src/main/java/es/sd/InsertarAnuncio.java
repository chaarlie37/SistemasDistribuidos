package es.sd;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InsertarAnuncio {

    @RequestMapping("/guardar_anuncio")
    String guardarAnuncio(Anuncio anuncio, Model model){
        TablonAnuncios.addAnuncio(anuncio);
        return "insertado_template";
    }

}
