package es.indra.cursoJava.entidades;

public class Paleta extends CorteCerdo{

    double precio;

    public Paleta(int pesoCerdo, String numeracion, double precio) {
        super(pesoCerdo, numeracion);
        this.precio = precio;
    }

    public Paleta(double precio) {
        this.precio = precio;
    }

    public Paleta() {
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String getNumeracion() {
        return super.getNumeracion();
    }

    @Override
    public void setNumeracion(String numeracion) {
        super.setNumeracion(numeracion);
    }

    @Override
    public int getPesoCerdo() {
        return super.getPesoCerdo();
    }

    @Override
    public void setPesoCerdo(int pesoCerdo) {
        super.setPesoCerdo(pesoCerdo);
    }

    @Override
    public boolean esDeBellota(int pesoCerdo) {
        return super.esDeBellota(pesoCerdo);
    }

    public double calcularPrecio(int peso){

        if (peso<=5){
            precio=20;
            System.out.println("Es una paleta mediocre");
        }
        precio=40;
        System.out.println("Ojala tener esta paleta xD");

        return precio;
    }


    @Override
    public String toString() {
        return "Paleta{" +
                "precio=" + precio +
                ", pesoCerdo=" + pesoCerdo +
                ", numeracion='" + numeracion + '\'' +
                '}';
    }
}
