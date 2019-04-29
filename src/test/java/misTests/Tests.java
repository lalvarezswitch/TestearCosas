package misTests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Tests {
	private int numeroUno = 5;
	private int numeroDos = 3;
	
	@Test
	public void testNumeroVerdadero() {
		Assert.assertTrue(numeroUno == numeroDos + 2, "El nro. no es verdadero "+String.valueOf(numeroUno));
	}
	
	@Test
	public void testNumeroFalso() {
		Assert.assertFalse(numeroUno == numeroDos, "Ambos nros. no son iguales");
	}
	
	@Test
	public void testNumerosIguales() {
		Assert.assertEquals(numeroUno + 10, numeroDos + 12);
	}
	
	@Test
	public void testNumerosNoIguales() {
		Assert.assertNotEquals(numeroUno - 1, numeroDos * 514);
	}
	
	@Test
	public void testDeNoNulo() {
		Personas persona  = new Personas("Pepe", "Gonzalez");
		Assert.assertNotNull(persona);
	}
	
	@Test
	public void testDeNulo() {
		Personas persona = null;
		Assert.assertNull(persona);
	}
	
	@Test
	public void saludarPersona() {
		Personas persona  = new Personas("Pepe", "Gonzalez");
		persona.saludar();
	}

}
