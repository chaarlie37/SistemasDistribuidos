package tablonanuncios;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TablonController {
   @Autowired
   private AnuncioRepository repAnuncios;
	
   @PostConstruct
   public void init() {
      repAnuncios.save(new Anuncio("Pepe", "Hola..", "XXXX"));
      repAnuncios.save(new Anuncio("Juan", "Adios...", "XXXX"));
   }

   @RequestMapping("/")
   public String tablon(Model model) {
			
      model.addAttribute("anuncios", repAnuncios.findAll());

      return "tablon";
   }
}