package es.sd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PersonaController {

    @Autowired
    PersonasRepository personasRepository;

    @RequestMapping("/guardar_persona")
    public String nuevaPersona(Persona persona, Model model){
        personasRepository.save(persona);
        return "persona_insertada";
    }

}
