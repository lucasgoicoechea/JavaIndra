import java.util.Date;

public class Cine {

    String direccion,nombre;
    Date fechaInaguracion;
    float precioEntrada;

    HorarioFuncion horarioFuncion;
    Programacion programacion;

    public void mostrarCine(){ }

    public void mostrarInfoHorariosFuncion(){}

    public Cine() {
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaInaguracion() {
        return fechaInaguracion;
    }

    public void setFechaInaguracion(Date fechaInaguracion) {
        this.fechaInaguracion = fechaInaguracion;
    }

    public float getPrecioEntrada() {
        return precioEntrada;
    }

    public void setPrecioEntrada(float precioEntrada) {
        this.precioEntrada = precioEntrada;
    }

    @Override
    public String toString() {
        return "Cine{" +
                "direccion='" + direccion + '\'' +
                ", nombre='" + nombre + '\'' +
                ", fechaInaguracion=" + fechaInaguracion +
                ", precioEntrada=" + precioEntrada +
                '}';
    }
}
