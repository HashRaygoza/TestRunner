package mx.calculoTest;

import mx.calculo.Calculo;
import org.junit.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CalculoTest {
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {

    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {

    }
    
    /**
     Con esta prueba verificaremos que jUnit este funcionando  
    */
    @Test
    public void pruebaJUnit(){
	
	assertTrue(true);
    }

    @Test
    public void pruebaCalculo(){
	Calculo calculo = new Calculo();

	assertEquals(1.0, calculo.calcular(1.0));
	assertEquals(4.0, calculo.calcular(2.0));
	assertEquals(9.0, calculo.calcular(3.0));
	assertEquals(16.0, calculo.calcular(4.0));
	assertEquals(25.0, calculo.calcular(5.0));	
    }

    @Test
    public void pruebaIVA(){
	Calculo calculo = new Calculo();

	assertEquals(1.6, calculo.calcularIVA(10));
    }

    
}
