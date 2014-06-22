package org.acme.piemme;

import java.util.List;
/** The classes that implement a concrete strategy should implement this.
 *  The Context class uses this to call the concrete strategy. 
 */
public interface TemperaturaMedia {

	public Integer calcolaTemperaturaMedia(List<Integer> temperature);
	
}
