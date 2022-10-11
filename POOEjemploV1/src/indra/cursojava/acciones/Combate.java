package indra.cursojava.acciones;

import indra.cursoja.entidad.Pokemon;

public class Combate {
	
	public Pokemon playerOne;
	public Pokemon playerTwo;
	public int numberOfBattle = 0;
	
	public Pokemon battle() {
		//FIXME: generar funcionalidad real
		if (playerOne.attackPower > playerTwo.attackPower) {
			return playerOne;
		}
		return playerTwo;
	}
	

}
