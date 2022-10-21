package Entregable1;

import java.util.Scanner;

public class CorteCerdo {
    boolean calidad = true;
    String certificado = "A++";
    public double precio;
    public String nombre;

    public CorteCerdo() {
    }

    public CorteCerdo(boolean calidad, String certificado, double precio) {
        this.calidad = calidad;
        this.certificado = certificado;
        this.precio = precio;
    }

    // Getter y Setter

    public boolean isCalidad() {
        return calidad;
    }

    public void setCalidad(boolean calidad) {
        this.calidad = calidad;
    }

    public String getCertificado() {
        return certificado;
    }

    public void setCertificado(String certificado) {
        this.certificado = certificado;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean estoKe() {

        // ! javaScript > java this.nombre ? nombre true || false;

        if (this.nombre != nombre) {
            return false;
        }
        return true;
    }

    public double noPrecioNegativo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el precio a pagar");
        double precioIntroducido = sc.nextDouble();

        double precioFinal = precioIntroducido - precio;

        return precioFinal;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "La carne tiene una calidad " + calidad + " su certificado es " + certificado
                + " y su precio es " + precio;
    }
}
