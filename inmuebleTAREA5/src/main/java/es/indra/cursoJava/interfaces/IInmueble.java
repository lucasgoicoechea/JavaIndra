/**
 * 
 */
package es.indra.cursoJava.interfaces;

import com.indra.mob.cursoJava.models.Inmueble;
import com.indra.mob.cursoJava.models.Inventario;

/**
 * @author ejguerrar
 *
 */
public interface IInmueble {
    static Inmueble inmu;
    static Inventario inventario;

    /**
     * 
     */
    inmu("qqqqq","wwwww","333333","5");
    inventario("qerw","w5464w","123333","2")  ;
    
    System.out.println(inventario.getInventario());
    System.out.println(inmu.getDirección());
}
