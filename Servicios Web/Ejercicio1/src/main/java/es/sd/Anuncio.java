package es.sd;

public class Anuncio {

    private Persona autor;
    private String asunto;
    private String comentario;


    public Anuncio(){

    }

    public Anuncio(Persona autor, String asunto, String comentario) {
        this.autor = autor;
        this.asunto = asunto;
        this.comentario = comentario;
    }

    public Persona getAutor() {
        return autor;
    }

    public void setAutor(Persona autor) {
        this.autor = autor;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getUsuario(){
        return autor.getUsuario();
    }

    @Override
    public String toString() {
        return "Anuncio{" +
                ", autor=" + autor +
                ", asunto='" + asunto + '\'' +
                ", comentario='" + comentario + '\'' +
                '}';
    }
}
