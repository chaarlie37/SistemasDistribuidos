package tablonanuncios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MostrarController {

	@Autowired
	private AnuncioRepository repositorioAnuncios;

	@RequestMapping("/mostrar")
	public String mostrar(@RequestParam String nombre, @RequestParam String asunto, Model model) {

		List<Anuncio> variosanuncios = repositorioAnuncios.findByNombreAndAsunto(nombre, asunto);

		model.addAttribute("anuncios", variosanuncios);

		return "mostrar";
	}
}