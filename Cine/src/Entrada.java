import java.util.Date;

public class Entrada extends Funcion {

    Date fechaHoraFuncion;
    Date fechaHoraVenta;
    float precioCobrado;
    int ticketNro;

    Funcion funcion;

    public boolean estaAnulada(){return Boolean.parseBoolean(null);}

    public Entrada() {
    }

    public Date getFechaHoraFuncion() {
        return fechaHoraFuncion;
    }

    public void setFechaHoraFuncion(Date fechaHoraFuncion) {
        this.fechaHoraFuncion = fechaHoraFuncion;
    }

    public Date getFechaHoraVenta() {
        return fechaHoraVenta;
    }

    public void setFechaHoraVenta(Date fechaHoraVenta) {
        this.fechaHoraVenta = fechaHoraVenta;
    }

    public float getPrecioCobrado() {
        return precioCobrado;
    }

    public void setPrecioCobrado(float precioCobrado) {
        this.precioCobrado = precioCobrado;
    }

    public int getTicketNro() {
        return ticketNro;
    }

    public void setTicketNro(int ticketNro) {
        this.ticketNro = ticketNro;
    }

    @Override
    public String toString() {
        return "Entrada{" +
                "fechaHoraFuncion=" + fechaHoraFuncion +
                ", fechaHoraVenta=" + fechaHoraVenta +
                ", precioCobrado=" + precioCobrado +
                ", ticketNro=" + ticketNro +
                '}';
    }


}
