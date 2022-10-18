public class ElementoSet {

    int orden;
    double precio;
    String Serial;

    public ElementoSet(double precio, String serial) {
        this.precio = precio;
        Serial = serial;
    }

    @Override
    public String toString() {
        return "ElementoSet{" +
                "orden=" + orden +
                ", precio=" + precio +
                ", Serial='" + Serial + '\'' +
                '}';
    }
}
