package dni;

import org.junit.Assert;
import org.junit.Test;

public class DniTest {
	
	/**
	 * Caso de prueba de DNI correcto
	 */
	@Test
	public void testDniCorrecto ()
	{
		
			char letra = Dni.calculaLetra(53130984);
			Assert.assertEquals('H', letra);
		
	}
	

	/**
	 * Caso de prueba de DNI Incorrecto
	 */
	
	@Test (expected = DniNegativoException.class)
	public void testDniNegativo ()
	{
		
			char letra = Dni.calculaLetra(-53130984);
			
	}
	
	/**
	 * Caso de prueba de DNI Extranjero correcto
	 */
	@Test
	public void testDniExtranjeroCorrecto ()
	{
		char letra = Dni.calculaLetra("X53130984");
		Assert.assertEquals('H', letra);
	}
	
	/**
	 * Caso de prueba de DNI Extranjero incorrecto
	 */
	@Test (expected = DniForaneoException.class)
	public void testDniExtranjeroIncorrecto ()
	{
		char letra = Dni.calculaLetra("Y53130984");
		//Assert.assertEquals('H', letra);
	}
	
	
	

}
