package Entregable1;

public class Paleta extends CorteCerdo {

    String nombre = "Paleta";

    public Paleta(String nombre, double precio) {
        nombre = "Paleta";
        precio = 2.4;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean estoKe() {
        // TODO Auto-generated method stub
        return super.estoKe();
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub

        return "El producto es " + nombre + " y su precio es " + precio;
    }

}
