package ejemploCajaBlanca1;

import java.util.Scanner;

public class EjemploCajaBlanca1 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Introduce un número mayor que 0:  ");
		int num = entrada.nextInt();
		System.out.print(CompruebaNumeroPerfecto(num));
	}
	
	static String CompruebaNumeroPerfecto(int num) {
		int divisor = 1, sumadivisores = 0;
		String Cadena = "";
		while (divisor <= num / 2) {
			if (num % divisor == 0) {
				sumadivisores += divisor;
			}
			divisor++;
		}
		if (num == sumadivisores) {
			Cadena = "El numero " + num + " es un numero perfecto"; //MEJOR SIN TILDES!!!!! EN EL TEST IGUAL!!! 

		} else {
			Cadena = "El numero " + num + " no es un numero perfecto"; //SI NO ESTA EXACTAMENTE IGUAL DARA ERROR
		}
		return Cadena;
	}

	

}
