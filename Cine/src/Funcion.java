import java.sql.Date;
import java.sql.Time;

public class Funcion extends Programacion{

    String diaSemana;
    int duracion;
    Time horaInicio;
    int numero;

    Pelicula pelicula;
    Sala sala;
    Entrada entrada;



    public boolean calcularDisponibilidad(){return Boolean.parseBoolean(null);}

    public int capacidadSala(){return Integer.parseInt(null);}

    public boolean estaEnCurso(){return Boolean.parseBoolean(null);}

    public boolean hayLugar(){return Boolean.parseBoolean(null);}

    public Date mostrarDiaYHora(){return null;}


    public Funcion() {
    }

    public String getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(String diaSemana) {
        this.diaSemana = diaSemana;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public Time getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Time horaInicio) {
        this.horaInicio = horaInicio;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Funcion{" +
                "diaSemana='" + diaSemana + '\'' +
                ", duracion=" + duracion +
                ", horaInicio=" + horaInicio +
                ", numero=" + numero +
                '}';
    }
}
