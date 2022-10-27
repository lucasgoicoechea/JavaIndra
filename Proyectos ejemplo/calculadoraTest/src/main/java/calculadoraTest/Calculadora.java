package calculadoraTest;

public class Calculadora {
	
	public int suma(int primeroperando, int segundooperando) {
		if (segundooperando > 10000) {
			segundooperando = 0;
		}
		return primeroperando + segundooperando;
	}

}
