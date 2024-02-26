package ejemploCajaNegra1;

import java.util.Scanner;

public class EjemploCajaNegra1 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduce para la edad un número mayor que 18 y menor que 65:  ");
		int num = entrada.nextInt();
		System.out.print(CompruebaEdadCorrecta(num));
		
		System.out.print("Introduce para el DNI una cadena con 8 números y una letra al final:  ");
		String dni = entrada.nextString();
		System.out.print(CompruebaDNICorrecto(dni));
		
		System.out.print("Introduce para la nacionalidad una palabra:  ");
		String nacionalidad = entrada.nextString();
		System.out.print(CompruebaNacionalidadCorrecta(nacionalidad));
	}




	static int CompruebaEdadCorrecta(int num) {
		int edad = 0;
		String Cadena = "";
		if (num>=18 && num <=65) {
			Cadena = "La edad es correcta";
		}
		else {
			Cadena = "La edad no es correcta";
		}
		return Cadena;	
	}
	
	static String CompruebaDNICorrecto(String DNI) {
		String DNI = " ";
		String Cadena = " ";
		
		
		//HACERLO!! *******
		
		
		
		
		if (num>=18 && num <=65) {
			Cadena = "La edad es correcta";
		}
		else {
			Cadena = "La edad no es correcta";
		}
		return Cadena;	
	}
	
	static int CompruebaNacionalidadCorrecta(String nacionalidad) {
		String nacionalidad = " "
		String Cadena = " ";
		
		
		//HACERLO!! ******
		
		
		
		if (num>=18 && num <=65) {
			Cadena = "La edad es correcta";
		}
		else {
			Cadena = "La edad no es correcta";
		}
		return Cadena;	
	}
}
