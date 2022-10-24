package es.indra.cursoJava.entidades;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class Test {

	public static void main(String[] args) {
		
		laVidaSolomillo();
		Paletas();
		Jamones();

		
		
	}
	
	public static void laVidaSolomillo() {
		
		System.out.println("*** Sección Solomillo***\n");
		Solomillo s1 = new Solomillo ("Solomillo 1","Palencia","Granja 1",12.45, "Madrid", 150);
//		s1.toString();

		Solomillo s2 = new Solomillo("Solomillo 2","Murcia","Granja 2",10, "M�laga", 100);
//		s2.toString();	
				
//		List<Solomillo> listaSolomillos = new ArrayList<>(Arrays.asList(s1,s2));
		List<Solomillo> listaSolomillos = Arrays.asList(s1,s2);
	
		for (Solomillo s : listaSolomillos){
			System.out.println("\t"+s+"\n");
		}
		
		System.out.println("\t---Cambio de destino en "+ s2.getNombre() +"---\n");
		s2.setLugarDestino("Barcelona");
		System.out.println("\t"+s2);
		
//		for (Solomillo s : listaSolomillos){
//			System.out.println("\t"+s+"\n");
//		}
		
	}
	
	public static void Paletas() {
		
		System.out.println("\n*** Sección Paletas***\n");
		Paleta p1 = new Paleta ("Paleta 1","Palencia","Granja 3",12, "Madrid", 200);
//		s1.toString();

		Paleta p2 = new Paleta("Paleta 2","Oviedo","Granja 4",10, "M�laga", 100);
				
		List<Paleta> listaPaletas = Arrays.asList(p1,p2);
	
		for (Paleta s : listaPaletas){
			System.out.println("\t"+s+"\n");
		}
		
		System.out.println("\t---Cambio de nombre en "+ p2.getNombre() +"---\n");
		p2.setNombre("Paleta de calidad");
		System.out.println("\t"+p2);
		
	}
	
	public static void Jamones() {
		
		System.out.println("\n*** Sección Jamones***\n");
		Jamon p1 = new Jamon ("Jamón 1","Madrid","Granja 5",12, "Marca AAA", "2 Bellotas");
//		s1.toString();

		Jamon p2 = new Jamon("Jamón 2","Ciudad Real","Granja 6",10, "Marca BBB", "0 Bellotas");
				
		List<Jamon> listaJamones = Arrays.asList(p1,p2);
	
		for (Jamon s : listaJamones){
			System.out.println("\t"+s+"\n");
		}
		
		System.out.println("\t---Cambio de peso en "+ p2.getNombre() +"---\n");
		p2.setPeso(50);
		System.out.println("\t"+p2);
		
//		for (Solomillo s : listaSolomillos){
//			System.out.println("\t"+s+"\n");
//		}
		
	}


}
