package org.acme.piemme;

import java.util.List;

/**
 * Configured with a ConcreteStrategy object and maintains
 * a reference to a Strategy object
 *
 */
public class CalcolatoreTemperature {
	
	private TemperaturaMedia temperaturaMedia;

	public CalcolatoreTemperature(TemperaturaMedia temperaturaMedia) {
		this.temperaturaMedia = temperaturaMedia;
	}
	
	public Integer calcolaTemperaturaMedia(List<Integer> temperature) {
        return this.temperaturaMedia.calcolaTemperaturaMedia(temperature);
    }
	

}
