package excepciones;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class LanzadorExcepciones {

	static Scanner sc = new Scanner(System.in);
	
	public static int[] leerNumero() throws FileNotFoundException, NoSuchElementException {
		sc = new Scanner(new File("c:/numeros.txt"));
		int numero1 = sc.nextInt();
		int numero2 = sc.nextInt();
		int[] numeros = new int[2];
		numeros[0] = numero1;
		numeros[1] = numero2;	
		return numeros;
	}
	
	public static int generarCalculo() throws ArithmeticException{
		
		int[] numeros = new int[2];
		try {
			numeros = leerNumero();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return numeros[0] + numeros[1];
	}
}
