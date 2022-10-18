public class PaisOrigen extends Pelicula {

    String nombre,idioma;

    public PaisOrigen() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    @Override
    public String toString() {
        return "PaisOrigen{" +
                "nombre='" + nombre + '\'' +
                ", idioma='" + idioma + '\'' +
                '}';
    }
}
