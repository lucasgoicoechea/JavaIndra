package EjercicioSet;

import java.util.HashSet;

public class Main extends ElementoDeSet {
    public Main(double precio, String serial, int orden) {
        super(precio, serial, orden);
        // TODO Auto-generated constructor stub
    }

    public static void main(String[] args) {
        ElementoDeSet elemento1 = new ElementoDeSet(34.5, "A1", 1);
        ElementoDeSet elemento2 = new ElementoDeSet(2.5, "A2", 2);
        ElementoDeSet elemento3 = new ElementoDeSet(3.5, "A3", 3);

        ElementoDeSet.add(elemento1, elemento2, elemento3);
    }
}
