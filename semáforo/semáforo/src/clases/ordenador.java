package clases;

import java.util.Random;

/**
 * Clase ordenador, devuelve un color aleatorio entre rojo, amarillo y verde
 * 
 * @author Laura
 * @version 1.0
 * 
 */
public class ordenador {
	/**
	 * Constructor
	 */
	public ordenador() {
	}

	/**
	 * Genera un color aleatorio y lo devuelve
	 * 
	 * @return String color
	 */
	public String color() {
		// creamos una instancia del generador aleatorio
		Random randomGenerator = new Random();
		// guardamos un int con 3 posibles valores
		int randomInt = randomGenerator.nextInt(3);
		// If, depende del valor del int devolvemos un color diferente.
		if (randomInt == 0) {
			return "rojo";
		} else if (randomInt == 1) {
			return "amarillo";
		} else {
			return "verde";
		}
	}
}
