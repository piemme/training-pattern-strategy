package org.acme.piemme;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ClientCheVuoleSapereLaTempMedia {
	
	public static void main(String[] args) {
		Integer media = vorreiSapereLaTemperaturaMedia(dammiUnPoDiTemperatureCasuali());
		System.out.println(media.toString());
	}
	
	public static Integer vorreiSapereLaTemperaturaMedia(List<Integer> temperature) {
		TemperaturaMediaComeFunzioneSinusoidale tMediaSinusoidale = new TemperaturaMediaComeFunzioneSinusoidale();
		CalcolatoreTemperature calcolatoreTMedia = new CalcolatoreTemperature(tMediaSinusoidale);
		return calcolatoreTMedia.calcolaTemperaturaMedia(temperature);
	}
	
	private  static List<Integer> dammiUnPoDiTemperatureCasuali() {
		return Collections.unmodifiableList(
				Arrays.asList(23, 11, 14, 19, 15, 29, 26, 26, 25, 13, 15, 29 ));
	}
}
