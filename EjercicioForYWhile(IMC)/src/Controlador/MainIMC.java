package Controlador;

import java.util.Scanner;

public class MainIMC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);

		double[] altura = new double[10];
		double[] peso = new double[10];
		double[] total = new double[10];

		int contador = 1;

		for (int i = 0; i < 10; i++) {
			System.out.println("Ingrese la altura" + contador);
			altura[contador-1]=sc.nextDouble();
			
			
			System.out.println("Ingrese el peso " + contador);
			peso[contador-1]=sc.nextDouble();
			
			
			
			
			total[contador-1]=peso[contador-1]/(altura[contador-1]*altura[contador-1]);
			System.out.println(total[contador-1]);
			contador++;
		}
		
		double imcPromedio=0;
		for (int i = 0; i < total.length; i++) {
			imcPromedio+=total[i];
			
		}
		System.out.println(imcPromedio/10);
	
			
	}	

}
