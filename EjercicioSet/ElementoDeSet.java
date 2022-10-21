package EjercicioSet;

public class ElementoDeSet {

    static int orden;
    static double precio;
    static String serial;

    public ElementoDeSet(double precio, String serial, int orden) {
        this.orden = orden;
        this.precio = precio;
        this.serial = serial;
    }

    @Override
    public String toString() {
        return "El orden es " + orden + " su precio es " + precio + " y su serial es " + serial;
    }

    public static void add(ElementoDeSet elemento1, ElementoDeSet elemento2, ElementoDeSet elemento3) {
        System.out.println(elemento1);
        System.out.println(elemento2);
        System.out.println(elemento3);
    }

}
