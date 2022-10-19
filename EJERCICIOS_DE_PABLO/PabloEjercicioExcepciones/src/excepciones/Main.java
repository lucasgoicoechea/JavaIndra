package excepciones;
import excepciones.LanzadorExcepciones;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int resultado = 0;
		
		resultado = LanzadorExcepciones.generarCalculo();
		
		System.out.println("El resultado es "+resultado);
	}

}
