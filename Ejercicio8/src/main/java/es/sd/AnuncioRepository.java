package es.sd;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AnuncioRepository extends JpaRepository<Anuncio, Long> {
    //Anuncio findByUsuario(String usuario);
    //Anuncio findByAsunto(String asunto);
    //List<Anuncio> findByUsuarioAndAsunto(String usuario, String asunto);
}
