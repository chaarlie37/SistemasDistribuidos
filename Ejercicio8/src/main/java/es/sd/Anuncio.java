package es.sd;

import javax.persistence.*;

@Entity
public class Anuncio {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private long id;

        private Persona autor;
        private String asunto;
        private String comentario;


        public Anuncio(){

        }

        public Anuncio(Persona autor, String asunto, String comentario) {
            this.autor = getAutor();
            this.asunto = asunto;
            this.comentario = comentario;
        }

        public void setAsunto(String asunto) {
            this.asunto = asunto;
        }

        public void setComentario(String comentario) {
            this.comentario = comentario;
        }

        public String getAsunto() {
            return asunto;
        }

        public String getComentario() {
            return comentario;
        }

    public Persona getAutor() {
        return autor;
    }

    public void setAutor(Persona autor) {
        this.autor = autor;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Anuncio{" +
                "id=" + id +
                ", autor='" + autor + '\'' +
                ", asunto='" + asunto + '\'' +
                ", comentario='" + comentario + '\'' +
                '}';
    }
}
