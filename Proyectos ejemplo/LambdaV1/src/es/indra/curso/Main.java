package es.indra.curso;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		List<BigDecimal> miWalletBalance = new ArrayList<>();
		// cargamos cuenta en bitcoints
		miWalletBalance.add(new BigDecimal(23.4));
		// cargamos saldo en euros
		miWalletBalance.add(new BigDecimal(120.89));
		//saldo en libras
		miWalletBalance.add(new BigDecimal(0.00));

		// lambdaTipoFunction(miWalletBalance);
		// lambdaTipoConsumers(miWalletBalance);
		//lambdaTipoPredicate(miWalletBalance);
		lambdaTipoSupplier(miWalletBalance);

	}

	private static void lambdaTipoSupplier(List<BigDecimal> miWalletBalance) {
		
		
	}

	private static void lambdaTipoPredicate(List<BigDecimal> miWalletBalance) {
		// LAMBDA, Predicate (T) <boolean -> stream.Predicate.T
		System.out.println("Main.lambdaTipoPredicate()" + "con lambda");
		Stream<BigDecimal> resulitadoDeFiltrar =  miWalletBalance.stream().filter(T -> T.compareTo(BigDecimal.ZERO) == 1 );
		resulitadoDeFiltrar.forEach(R -> System.out.println("valor del saldo " + R.doubleValue()));
		
		// NO LAMBDA
		System.out.println("Main.lambdaTipoPredicate()" + "SIN lambda");
		List<BigDecimal> walletFiltradoMayorAZERO = new ArrayList<>();
		for (BigDecimal T : miWalletBalance) {
			if (T.compareTo(BigDecimal.ZERO) == 1)
				walletFiltradoMayorAZERO.add(T);
		}
		for (BigDecimal T : walletFiltradoMayorAZERO) {
			System.out.println("valor del saldo " + T.doubleValue());
		}
		
	}

	private static void lambdaTipoConsumers(List<BigDecimal> miWalletBalance) {
		// LAMBDA, Consumer (T) stream.Consumer.T
		miWalletBalance.stream().forEach(T -> System.out.println("valor del saldo " + T.doubleValue()));

		// NO LAMBDA
		for (BigDecimal T : miWalletBalance) {
			System.out.println("valor del saldo " + T.doubleValue());
		}
	}

	private static void lambdaTipoFunction(List<BigDecimal> miWalletBalance) {
		double testTotalSaldo = 23.4 + 120.89;

		// LAMBDA, Function (T,R) R = stream.Function.T
		BigDecimal totalSaldo = miWalletBalance.stream().reduce(BigDecimal.ZERO, BigDecimal::add);

		// NO LAMBDA
		BigDecimal totalSaldoNoLambda = BigDecimal.ZERO;
		for (BigDecimal balance : miWalletBalance) {
			totalSaldoNoLambda = totalSaldoNoLambda.add(balance);
		}

		System.out.println("el saldo de sumar SIN lambda es:" + totalSaldoNoLambda.doubleValue());
		System.out.println("el saldo de sumar con lambda es:" + totalSaldo.doubleValue());
		System.out.println("Test de la suma:" + testTotalSaldo);
	}

}
