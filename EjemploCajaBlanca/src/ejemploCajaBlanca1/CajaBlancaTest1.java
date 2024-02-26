package ejemploCajaBlanca1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class CajaBlancaTest1 {

	/*instancio un objeto tipo cajaBlancaTest(clase)*/
	EjemploCajaBlanca1 cajaBlancaTest = new EjemploCajaBlanca1 ();
	/*referencia a mi original y creo 1 objeto!! al que llamo abajo!! con compruebanumperfecto*/
	
	
	/*tengo que pasar los 4 caminos de la tabla de la hoja 38 del pdf*/
	
	@Test
	/*los metodos tienen que llamarse distinto!!! no puedo todos "test" nada mas, que sean descriptivos*/
	void CP1() { 
		
		//fail("Not yet implemented");
		
		// él no lo pone --- System.out.println("Ejecuto el Test Comprueba Número Perfecto");
		
		String resultadoEsperado="El número -2 no es un número perfecto"; //"El número " + num + " no es un número perfecto"; NO!!
																		//tengo que poner excatamente el valor con que comparo!!!
		
		//String resultadoObtenido=28;//y aqui llamo a un metodo
		
		String resultadoObtenido=cajaBlancaTest.CompruebaNumeroPerfecto(-2); //aquí -2 porque es exactamente el que quieo comprobar!!
		
		
		assertEquals(resultadoEsperado, resultadoObtenido);
		//pero esto es trampa, tengo que llamar a Calculadora arriba
		
	}
	
	//el CP2 no lo ponemos porque nunca va a poder ser posible, entonces no lo testeamos
	
	
	@Test
	/*los metodos tienen que llamarse distinto!!! no puedo todos "test" nada mas, que sean descriptivos*/
	void CP3() { 
		
		//fail("Not yet implemented");
		
		//él no lo pone --- System.out.println("Ejecuto el Test Comprueba Número Perfecto");
		
		String resultadoEsperado="El número 28 es un número perfecto";
		
		//String resultadoObtenido=28;//y aqui llamo a un metodo
		
		String resultadoObtenido=cajaBlancaTest.CompruebaNumeroPerfecto(28); //no copiar y pegar, 
											//mejor esperar a que salgan las opciones despues del . y que autocomplete, asi menos errores	
											//SIEMPRE LLAMO A COMRPUEBA NUM PERFECTO DEL ORIGINAL!!********
		
		assertEquals(resultadoEsperado, resultadoObtenido);
		//pero esto es trampa, tengo que llamar a Calculadora arriba
	
	}//AQUI ACABA mi test para comprobar EL CP3
	
	
	@Test
	/*los metodos tienen que llamarse distinto!!! no puedo todos "test" nada mas que sean descriptivos*/
	void CP4() { 
		
		//fail("Not yet implemented");
		
		//él no lo pone --- System.out.println("Ejecuto el Test Comprueba Número Perfecto");
		
		String resultadoEsperado="El número 8 no es un número perfecto";
		
		//String resultadoObtenido=28;//y aqui llamo a un metodo
		
		String resultadoObtenido=cajaBlancaTest.CompruebaNumeroPerfecto(8);
		
		
		assertEquals(resultadoEsperado, resultadoObtenido);
		//pero esto es trampa, tengo que llamar a Calculadora arriba
		
	}//AQUI ACABA mi test para comprobar CP4()
	

}
