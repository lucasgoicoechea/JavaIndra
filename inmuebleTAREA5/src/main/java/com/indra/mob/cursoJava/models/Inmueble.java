/**
 * 
 */
package com.indra.mob.cursoJava.models;

/**
 * @author ejguerrar
 *
 */

public class Inmueble {
    String precio, dirección, estado, inquilinos;

    /**
     * @param precio
     * @param dirección
     * @param estado
     * @param inquilinos
     */
    public Inmueble(String precio, String dirección, String estado, String inquilinos) {

        this.precio = precio;
        this.dirección = dirección;
        this.estado = estado;
        this.inquilinos = inquilinos;
    }

    /**
     * 
     * Devuelve el atributo precio.
     *
     * 
     * 
     * @return precio
     * 
     */
    public String getPrecio() {
        return precio;
    }

    /**
     * 
     * Almacena el atributo precio.
     *
     * 
     * 
     * @param precio precio a almacenar
     * 
     */
    public void setPrecio(String precio) {
        this.precio = precio;
    }

    /**
     * 
     * Devuelve el atributo dirección.
     *
     * 
     * 
     * @return dirección
     * 
     */
    public String getDirección() {
        return dirección;
    }

    /**
     * 
     * Almacena el atributo dirección.
     *
     * 
     * 
     * @param dirección dirección a almacenar
     * 
     */
    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    /**
     * 
     * Devuelve el atributo estado.
     *
     * 
     * 
     * @return estado
     * 
     */
    public String getEstado() {
        return estado;
    }

    /**
     * 
     * Almacena el atributo estado.
     *
     * 
     * 
     * @param estado estado a almacenar
     * 
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * 
     * Devuelve el atributo inquilinos.
     *
     * 
     * 
     * @return inquilinos
     * 
     */
    public String getInquilinos() {
        return inquilinos;
    }

    /**
     * 
     * Almacena el atributo inquilinos.
     *
     * 
     * 
     * @param inquilinos inquilinos a almacenar
     * 
     */
    public void setInquilinos(String inquilinos) {
        this.inquilinos = inquilinos;
    }
}
