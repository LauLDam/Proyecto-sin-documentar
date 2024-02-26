package clases;

/**
 * la Clase estudiante gestiona los datos sobre los estudiantes. Extiende a la clase persona (incluye??)
 * 
 * @author Laura Villar Caballero
 * 
 * @version 1.0
 */
public class estudiante extends persona{
	// Incluye un metodo de clase que se une a los heredados
	//presenta la variable i pero no la inicializa
	int i_Curso;
	
	
	/**
	 * Método ¿¿ de la clase estudiante con sus variables inicializadas 
	 * 
	 */
	public estudiante() {
		i_Edad=25;
		s_Nombre = "Luis";
		i_Curso = 1;
	}
    	
    	
	/**
	 * Método por el que se sacamoa la información por pantalla de los datos del estudiante a modo de presentación
	 */	
	public void presentarse(){
		System.out.println("Soy " + s_Nombre + " Alumno de " + Integer.toString(i_Curso) + " y 	tengo una edad de: " + Integer.toString(i_Edad));	
	}
	
	
	
	/**
	 * Método por el que se le pregunta al estudiante por un color. Llama a la función presentarse y cera un objeto nuevo ordenador al que llama mipc ¿¿¿¿¿***** es correcto??
	 * @return representa el color que le asigna al nuevo ordenador  ¿¿¿** está bienn???
	 */
										//qué es mipc??? no está en ninguna otra clase predeterminada********, es el nombre del nuevo objeto ordenador que crea??
	public String preguntacolor(){
		presentarse();
		ordenador mipc = new ordenador();
        	return mipc.color();
    	}
}
