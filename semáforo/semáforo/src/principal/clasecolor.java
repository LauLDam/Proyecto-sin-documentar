package principal;

import clases.profesor;

/**
 * Clase color, el profesor pregunta a un alumno por un color entre (rojo,
 * amarillo y verde)
 * 
 * @author Laura
 * @version 1.0
 * 
 */
public class clasecolor {

	/**
	 * @hidden
	 * 
	 * @param args los argumentos de la clase main del inicio de la aplicación
	 */
	public static void main(String[] args) {
		profesor teacher = new profesor();
		String color = teacher.preguntacolor();
		System.out.println("La respuesta recibida es:" + color);
	}
}
