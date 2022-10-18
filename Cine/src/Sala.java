public class Sala extends Cine{

    int capacidad,numero;
    Cine cine;

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Sala() {
    }

    @Override
    public String toString() {
        return "Sala{" +
                "capacidad=" + capacidad +
                ", numero=" + numero +
                '}';
    }
}
