package es.sd;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String usuario;
    private String nombre;
    private String apellidos;
    @OneToMany(mappedBy = "autor")
    private Collection<Anuncio> anuncios;

    public Persona(){

    }

    public Persona(String usuario, String nombre, String apellidos) {
        this.usuario = usuario;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Collection<Anuncio> getAnuncios() {
        return anuncios;
    }

    public void setAnuncios(Collection<Anuncio> anuncios) {
        this.anuncios = anuncios;
    }

    @Override
    public String toString() {
        return usuario;
    }
}
