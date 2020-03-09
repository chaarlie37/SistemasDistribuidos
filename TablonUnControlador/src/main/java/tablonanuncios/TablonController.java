package tablonanuncios;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TablonController {

	private List<Anuncio> anuncios = new ArrayList<>();

	@RequestMapping("/")
	public String tablon(
			@RequestParam(value = "enviar", required = false) String enviar,
			Anuncio anuncio, Model model) {

		if(enviar != null){
			anuncios.add(anuncio);
		}

		model.addAttribute("anuncios", anuncios);

		return "tablon";
	}
}