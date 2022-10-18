import java.util.Date;

public class Pelicula extends Funcion  {

    //Declaro las variables de la clase

    Genero genero;
    int añoEstreno,duracion;
    boolean disponible;
    Date fechaIngreso;
    String nombre,tituloOriginal;
    PaisOrigen paisOrigen;
    Calificacion calificacion;
    Personaje personaje;
    Funcion funcion;

    public int calcularDuracionEnFuncion(){return Integer.parseInt(null);}

    public boolean estaDisponible(){return Boolean.parseBoolean(null);}

    public boolean estaEnCartelera(){return Boolean.parseBoolean(null);}

    public void mostrarFuncionesHabilitadas(){}


}
