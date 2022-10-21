package es.indra.cursoJava.entidades;

import static es.indra.cursoJava.entidades.TiposJamon.*;

public class Jamon extends CorteCerdo{

    int pesoJamon;
    TiposJamon tipoJamon;


    //Constructores extendidos de la clase Padre
    public Jamon(int pesoCerdo, String numeracion, int pesoJamon, TiposJamon tipoJamon) {
        super(pesoCerdo, numeracion);
        this.pesoJamon = pesoJamon;
        this.tipoJamon = tipoJamon;
    }

    public Jamon(int pesoJamon, TiposJamon tipoJamon) {
        this.pesoJamon = pesoJamon;
        this.tipoJamon = tipoJamon;
    }

    public Jamon() {
    }

    //Getters and Setters

    public int getPesoJamon() {
        return pesoJamon;
    }

    public void setPesoJamon(int pesoJamon) {
        this.pesoJamon = pesoJamon;
    }

    public TiposJamon getTipoJamon() {
        return tipoJamon;
    }

    public void setTipoJamon(TiposJamon tipoJamon) {
        this.tipoJamon = tipoJamon;
    }

    //Obtengo el atributo de la clase padre
    @Override
    public String getNumeracion() {
        return super.getNumeracion();
    }

    @Override
    public void setNumeracion(String numeracion) {
        super.setNumeracion(numeracion);
    }



    /**
     *
     * @param tipoJamon proviene de la enum creada en el package
     * @return true si el tipo de jamon proviene de mataderoIndustrial
     */
    public boolean vieneDeMataderoIndustrial(TiposJamon tipoJamon){

        if (tipoJamon==ibericoPuro ||tipoJamon==iberico){
            System.out.println("El jamon no procede de un matadero industrial");
            return false;
        }
        else if (tipoJamon == deBellota || tipoJamon==deCebo) {
            System.out.println("El jamon procede de un matadero industrial");
            return true;
        }

        System.out.println("El tipo de jamon introducido no es correcto en los valores disponiobles");
        return false;
    }


    //Metodo rescatado de la clase padre
    @Override
    public boolean esDeBellota(int pesoCerdo) {
        return super.esDeBellota(pesoCerdo);
    }

    @Override
    public String toString() {
        return "Jamon{" +
                "pesoJamon=" + pesoJamon +
                ", tipoJamon=" + tipoJamon +
                ", pesoCerdo=" + pesoCerdo +
                ", numeracion='" + numeracion + '\'' +
                '}';
    }
}
