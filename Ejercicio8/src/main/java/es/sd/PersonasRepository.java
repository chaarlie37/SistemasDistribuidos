package es.sd;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonasRepository extends JpaRepository<Persona, Long> {

    public Persona findByUsuario(String usuario);

}
