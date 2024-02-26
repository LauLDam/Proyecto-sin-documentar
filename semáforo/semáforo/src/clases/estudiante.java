package clases;

/**
 * Clase estudiante, crea un estudiante llamado Luis, se presenta y responde a
 * la pregunta del color
 * 
 * @author Laura
 * @version 1.0
 * @see persona
 * 
 */
public class estudiante extends persona {
	/**
	 * El número de curso al que asiste el estudiante
	 */
	int i_Curso;

	/**
	 * Constructor
	 */
	public estudiante() {
		i_Edad = 25;
		s_Nombre = "Luis";
		i_Curso = 1;
	}

	/**
	 * Pinta en pantalla la presentación del alumno
	 * 
	 */
	public void presentarse() {
		System.out.println("Soy " + s_Nombre + " Alumno de " + Integer.toString(i_Curso) + " y 	tengo una edad de: "
				+ Integer.toString(i_Edad));
	}

	/**
	 * El alumno se presenta y consulta al ordenador el color y lo devuelve
	 * 
	 * @see ordenador
	 * @return String el color del ordenador
	 */
	public String preguntacolor() {
		presentarse();
		ordenador mipc = new ordenador();
		return mipc.color();
	}
}
