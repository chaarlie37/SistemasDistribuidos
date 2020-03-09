package es.sd;

public class Anuncio {


        private String usuario;
        private String asunto;
        private String comentario;


        public Anuncio(){

        }

        public Anuncio(String usuario, String asunto, String comentario) {
            this.usuario = usuario;
            this.asunto = asunto;
            this.comentario = comentario;
        }

        public void setAsunto(String asunto) {
            this.asunto = asunto;
        }

        public void setComentario(String comentario) {
            this.comentario = comentario;
        }

        public void setUsuario(String usuario) {
            this.usuario = usuario;
        }

        public String getAsunto() {
            return asunto;
        }

        public String getComentario() {
            return comentario;
        }

        public String getUsuario() {
            return usuario;
        }


}
