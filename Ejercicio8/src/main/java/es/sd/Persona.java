package es.sd;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import java.util.ArrayList;

public class Persona {

    String usuario;
    String nombre;
    String apellidos;
    ArrayList<Anuncio> anuncios;
}
