package calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculadoraTest {
/*instancio un objeto tipo calculadora(clase)*/
	Calculadora calculadora = new Calculadora ();
	
	@Test
	/*los metodos tienen que llamarse distinto!!! no puedo todos "test" nada mas que sean descriptivos*/
	void testSuma() { 
	
		//fail("Not yet implemented");
		
		System.out.println("Ejecuto Test suma");
		
		int resultadoEsperado=8;
		
		//int resultadoObtenido=8;//y aqui llamo a un metodo
		
		int resultadoObtenido=calculadora.suma(5, 3);
		
		
		assertEquals(resultadoEsperado, resultadoObtenido);
		//pero esto es trampa, tengo que llamar a Calculadora arriba
		
	
	}//AQUI ACABA mi test para la SUMA
	
	
	
	@Test
	void testResta() {
		//fail("Not yet implemented");
		
		System.out.println("Ejecuto Test resta");
		
		int resultadoEsperado=8;
		
		//int resultadoObtenido=8;//y aqui llamo a un metodo
		
		int resultadoObtenido=calculadora.resta(10, 2);
		
		
		assertEquals(resultadoEsperado, resultadoObtenido);
		//pero esto es trampa, tengo que llamar a Calculadora arriba
	
	
	}

	
	@Test
	void testMultiplicar() {
		//fail("Not yet implemented");
		
		System.out.println("Ejecuto Test multiplicar");
		
		int resultadoEsperado=8;
		
		//int resultadoObtenido=8;//y aqui llamo a un metodo
		
		int resultadoObtenido=calculadora.multiplicacion(4, 2);
		
		
		assertEquals(resultadoEsperado, resultadoObtenido);
		/*pero esto es trampa, tengo que llamar a Calculadora arriba*/
	
	}
	
	
	@BeforeAll
	public static void testBeforeAll() {
		System.out.println("Ejecuto Test BeforeAll()");
	}
	
	@BeforeEach
	public void testBeforeEach() {
		System.out.println("Ejecuto BeforeEach()");
	}
	
	@AfterEach
	public void afterEach() {
	System.out.println("Ejecuto AfterEach()");
	}
	
	@AfterAll
	public static void testAfterall() {
	System.out.println("Ejecuto AfterAll()"); 
	}

}
