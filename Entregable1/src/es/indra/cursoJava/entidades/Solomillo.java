package es.indra.cursoJava.entidades;

public class Solomillo extends CorteCerdo{


    String calidad;

    public Solomillo(int pesoCerdo, String numeracion, String calidad) {
        super(pesoCerdo, numeracion);
        this.calidad = calidad;
    }

    public Solomillo(String calidad) {
        this.calidad = calidad;
    }

    public Solomillo() {
    }

    public String getCalidad() {
        return calidad;
    }

    public void setCalidad(String calidad) {
        this.calidad = calidad;
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

    public boolean esDeCalidad(String calidad){

        if (calidad=="buena"){
            System.out.println("Madremia que rico el solomillo");
            return true;
        }
        else if(calidad=="mediocre"){
            System.out.println("La verdad es que es mejorable la calidad");
            return false;
        }
        System.out.println("Es malisima la calidad");
        return false;
    }

    @Override
    public String toString() {
        return "Solomillo{" +
                "calidad='" + calidad + '\'' +
                ", pesoCerdo=" + pesoCerdo +
                ", numeracion='" + numeracion + '\'' +
                '}';
    }


}
