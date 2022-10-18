import java.util.Date;

public class Programacion extends Cine {

    Date fechaFin;
    Date fechaInicio;
    Date fechaCreada;

    Funcion funcion;

    public boolean estaCompleta(){return Boolean.parseBoolean(null);}

    public boolean estaIniciadaFuncion(){return Boolean.parseBoolean(null);}

    public boolean estaVigente(){return Boolean.parseBoolean(null);}

    public void mostrarProgramacion(){}

    public Programacion() {
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaCreada() {
        return fechaCreada;
    }

    public void setFechaCreada(Date fechaCreada) {
        this.fechaCreada = fechaCreada;
    }

    @Override
    public String toString() {
        return "Programacion{" +
                "fechaFin=" + fechaFin +
                ", fechaInicio=" + fechaInicio +
                ", fechaCreada=" + fechaCreada +
                '}';
    }
}
