package tryCatch;

import java.io.IOException;
import java.util.Scanner;
import java.lang.ArithmeticException;

public class LanzadorExcepciones {

	int num, num2;

	public void leerNumero() throws IOException{
		
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Pon un numero en la consola");
		num=entrada.nextInt();
		
		System.out.println("Pon un ultimo numero en la consola");
		num2=entrada.nextInt();
		
	
		try {			
			System.out.println("Los numeros son "+num+" y "+num2);			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.fillInStackTrace());
		}
		
		generarCalculo();
	}
	
	int generarCalculo(){
		
		try {
			return num+num2;
		} catch (NumberFormatException e) {
			// TODO: handle exception
			 e.printStackTrace();
		}
		
		return 0;
	}
	
}
