package Entregable1;

public class Jamon extends CorteCerdo {

    String nombre = "jamon";

    public Jamon(String nombre, double precio) {
        nombre = "Jamon";
        precio = 8.9;
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
