import java.util.ArrayList;
import java.util.List;

public class MainArray {

	public static void main(String[] args) {
		
		List <Elemento> litaDeElementos = new ArrayList<>();

		Elemento elemento1 = new Elemento("Paquita", 20);

		litaDeElementos.add(elemento1);

		for (Elemento elemento : litaDeElementos) {
			System.out.print(elemento);
		}
	}

}
