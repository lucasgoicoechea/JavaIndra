package Entregable1;

public class Solomillo extends CorteCerdo {

    String nombre = "Solomillo";

    public Solomillo(String nombre, double precio) {
        nombre = "Solomillo";
        precio = 5.23;
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
