package es.indra;

import org.springframework.stereotype.Service;

@Service
public class ServicioB {
//	Se puede aumentar el tiempo o disminuir el de dormir incluso pedri por teclado para responder a la pregunta
//	¿Como podemos interceptar el método que se ejecuta más lento y que tiene un Thread.sleep()?.En este caso lo duplicamos
	public String metodo2() { try { Thread.sleep(5000*2); } catch (InterruptedException e) { 
		// TODO Auto-generated catch	block 
		e.printStackTrace(); }
		return "hola es el metodo2"; 
		} }
	