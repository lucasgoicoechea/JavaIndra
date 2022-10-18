import java.util.Date;

public class HorarioFuncion {

    Date diaDeSemana,horaPrimeraFuncion,horaUltimaFuncion;
    int duracionIntervalo, duracionPublicidad;
    boolean esTrasnoche;

    public void mostrarHorarioFuncion(){}

    public HorarioFuncion() {
    }

    public Date getDiaDeSemana() {
        return diaDeSemana;
    }

    public void setDiaDeSemana(Date diaDeSemana) {
        this.diaDeSemana = diaDeSemana;
    }

    public Date getHoraPrimeraFuncion() {
        return horaPrimeraFuncion;
    }

    public void setHoraPrimeraFuncion(Date horaPrimeraFuncion) {
        this.horaPrimeraFuncion = horaPrimeraFuncion;
    }

    public Date getHoraUltimaFuncion() {
        return horaUltimaFuncion;
    }

    public void setHoraUltimaFuncion(Date horaUltimaFuncion) {
        this.horaUltimaFuncion = horaUltimaFuncion;
    }

    public int getDuracionIntervalo() {
        return duracionIntervalo;
    }

    public void setDuracionIntervalo(int duracionIntervalo) {
        this.duracionIntervalo = duracionIntervalo;
    }

    public int getDuracionPublicidad() {
        return duracionPublicidad;
    }

    public void setDuracionPublicidad(int duracionPublicidad) {
        this.duracionPublicidad = duracionPublicidad;
    }

    public boolean isEsTrasnoche() {
        return esTrasnoche;
    }

    public void setEsTrasnoche(boolean esTrasnoche) {
        this.esTrasnoche = esTrasnoche;
    }

    @Override
    public String toString() {
        return "HorarioFuncion{" +
                "diaDeSemana=" + diaDeSemana +
                ", horaPrimeraFuncion=" + horaPrimeraFuncion +
                ", horaUltimaFuncion=" + horaUltimaFuncion +
                ", duracionIntervalo=" + duracionIntervalo +
                ", duracionPublicidad=" + duracionPublicidad +
                ", esTrasnoche=" + esTrasnoche +
                '}';
    }
}
