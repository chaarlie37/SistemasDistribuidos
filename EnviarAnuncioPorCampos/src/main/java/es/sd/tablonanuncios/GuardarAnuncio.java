package es.sd.tablonanuncios;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GuardarAnuncio {

	@RequestMapping("/guardar")
	public String guardar(
			@RequestParam(value="nombre") String nombre,
			@RequestParam(value="asunto") String asunto,
			@RequestParam(value="comentario") String comentario,
			Model model) {
		
		model.addAttribute("nombre", nombre);	
		model.addAttribute("asunto", asunto);
		model.addAttribute("comentario", comentario);

		return "enviar_template";
	}
}
