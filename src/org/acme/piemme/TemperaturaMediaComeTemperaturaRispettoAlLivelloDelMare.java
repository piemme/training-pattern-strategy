package org.acme.piemme;

import java.util.List;

/**
 * ConcreteStrategy class
 * Implements the algorithm using the strategy interface
 */

public class TemperaturaMediaComeTemperaturaRispettoAlLivelloDelMare  implements TemperaturaMedia {

	@Override
	public Integer calcolaTemperaturaMedia(List<Integer> temperature) {
		// TODO implementare algoritmo
		return temperature.get(2);
	}

}
