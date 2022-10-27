/**
 * 
 */
package com.indra.mob.cursoJava.models;

/**
 * @author ejguerrar
 *
 */
public class Inventario {

    /**
     * 
     */
    String Inventario, id_inventario, campo3, campo4;

    /**
     * @param inventario
     * @param id_inventario
     * @param campo3
     * @param campo4
     */
    public Inventario(String inventario, String id_inventario, String campo3, String campo4) {

        Inventario = inventario;
        this.id_inventario = id_inventario;
        this.campo3 = campo3;
        this.campo4 = campo4;
    }

    /**
     * 
     * Devuelve el atributo inventario.
     *
     * 
     * 
     * @return inventario
     * 
     */
    public String getInventario() {
        return Inventario;
    }

    /**
     * 
     * Almacena el atributo inventario.
     *
     * 
     * 
     * @param inventario inventario a almacenar
     * 
     */
    public void setInventario(String inventario) {
        Inventario = inventario;
    }

    /**
     * 
     * Devuelve el atributo id_inventario.
     *
     * 
     * 
     * @return id_inventario
     * 
     */
    public String getId_inventario() {
        return id_inventario;
    }

    /**
     * 
     * Almacena el atributo id_inventario.
     *
     * 
     * 
     * @param id_inventario id_inventario a almacenar
     * 
     */
    public void setId_inventario(String id_inventario) {
        this.id_inventario = id_inventario;
    }

    /**
     * 
     * Devuelve el atributo campo3.
     *
     * 
     * 
     * @return campo3
     * 
     */
    public String getCampo3() {
        return campo3;
    }

    /**
     * 
     * Almacena el atributo campo3.
     *
     * 
     * 
     * @param campo3 campo3 a almacenar
     * 
     */
    public void setCampo3(String campo3) {
        this.campo3 = campo3;
    }

    /**
     * 
     * Devuelve el atributo campo4.
     *
     * 
     * 
     * @return campo4
     * 
     */
    public String getCampo4() {
        return campo4;
    }

    /**
     * 
     * Almacena el atributo campo4.
     *
     * 
     * 
     * @param campo4 campo4 a almacenar
     * 
     */
    public void setCampo4(String campo4) {
        this.campo4 = campo4;
    }

    public Inventario() {
        // TODO Auto-generated constructor stub
    }

}
