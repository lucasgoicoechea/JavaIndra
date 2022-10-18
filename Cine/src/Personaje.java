public class Personaje extends Pelicula{

    String nombreEnPelicula;
    Rol rol;
    Actor actor;

    public Personaje() {
    }

    public String getNombreEnPelicula() {
        return nombreEnPelicula;
    }

    public void setNombreEnPelicula(String nombreEnPelicula) {
        this.nombreEnPelicula = nombreEnPelicula;
    }

    @Override
    public String toString() {
        return "Personaje{" +
                "nombreEnPelicula='" + nombreEnPelicula + '\'' +
                '}';
    }
}
