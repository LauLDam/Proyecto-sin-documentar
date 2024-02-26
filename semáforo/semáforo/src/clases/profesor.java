package clases;

/**
 * Clase profesor, hace la pregunta al estudiante sobre el color
 * 
 * @author Laura
 * @version 1.0
 * @see persona
 * 
 */
public class profesor extends persona {

	/**
	 * Constructor
	 */
	public profesor() {
	}

	/**
	 * Pregunta al estudiante sobre el color
	 * 
	 * @return String colorRec
	 * @see estudiante
	 */
	public String preguntacolor() {

		estudiante alumno = new estudiante();
		String colorRec = alumno.preguntacolor();
		return colorRec;
	}
}
