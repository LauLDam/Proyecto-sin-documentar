
package debugger_2;

import java.util.Scanner;

/*
 *Crea un proyecto nuevo Java, e incluye el archivo Debugger_2.java

El siguiente programa pregunta al usuario cuántos números aleatorios desea 
y debería imprimir por pantalla la cantidad de números aleatorios indicados, 
sin embargo, el programa solo imprime 0.

Depura el programa usando las herramientas explicadas, 
como puede ser Breakpoints y Visor de variables y corrige el fallo en el programa
 */



public class Debugger_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner MyScanner = new Scanner(System.in);
		
		System.out.println("Introduce la cantidad de n�meros aleatorios: ");
		int elementos = MyScanner.nextInt();
		
		int num_aleat[] = new int[elementos];
		
		for(int i=0;i<num_aleat.length;i++) {
			num_aleat[i] = (int)(Math.random()*100);
		}
		
		for(int j = 0; j < num_aleat.length; j++) {
			System.out.println(num_aleat[j]);
		}
	}
}
