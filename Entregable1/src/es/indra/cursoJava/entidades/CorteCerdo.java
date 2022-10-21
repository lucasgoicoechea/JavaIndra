package es.indra.cursoJava.entidades;

public class CorteCerdo {

    //Declaro las variables
    int pesoCerdo;
    String numeracion;

    //Constructores

    public CorteCerdo(int pesoCerdo, String numeracion) {
        this.pesoCerdo = pesoCerdo;
        this.numeracion = numeracion;
    }

    public CorteCerdo() {
    }


    //Getters and Setters
    public int getPesoCerdo() {
        return pesoCerdo;
    }

    public void setPesoCerdo(int pesoCerdo) {
        this.pesoCerdo = pesoCerdo;
    }

    public String getNumeracion() {
        return numeracion;
    }

    public void setNumeracion(String numeracion) {
        this.numeracion = numeracion;
    }

    /**
     *
     * @param pesoCerdo es el peso que tendra el animal al pisar la báscula
     * @return Debe devolver true si el animal ha sido alimentado con bellota
     */
    public boolean esDeBellota(int pesoCerdo){

        if (pesoCerdo<=200){
            System.out.println("El cerdo no es de bellota");
            return false;
        }

       System.out.println("El cerdo si es de bellota y se nota");
       return true;

    }

    //ToString
    @Override
    public String toString() {
        return "CorteCerdo{" +
                "pesoCerdo=" + pesoCerdo +
                ", numeracion='" + numeracion + '\'' +
                '}';
    }
}
