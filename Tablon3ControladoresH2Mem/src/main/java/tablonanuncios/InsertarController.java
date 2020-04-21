package tablonanuncios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InsertarController {

	@Autowired
	private AnuncioRepository repositorioAnuncios;

	@RequestMapping("/insertar")
	public String insertar(Anuncio anuncio, Model model) {

		repositorioAnuncios.save(anuncio);

		return "insertar";
	}

}