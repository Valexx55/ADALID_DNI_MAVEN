package dni;

public class Dni {
	
	private static final String JUEGO_CARACTERES_DNI = "TRWAGMYFPDXBNJZSQVHLCKE"; 
	private static final int NUM_LETRAS = 23;
	
	
	/**
	 * Este método recibe un número y devuelde el DNI
	 * asociado
	 * 
	 * @param dni el número de DNI que recibimos
	 * @return la letra asociada a ese DNI
	 * @throws DniNegativoException 
	 * @throws NumException 
	 */
	public static char calculaLetra(int dni) throws DniNegativoException {
		char letra_devuelta = ' ';
		int modulo = -1;
		
			if (dni < 0)
			{
				throw new DniNegativoException();
			}
			modulo = (dni % NUM_LETRAS);
			letra_devuelta = JUEGO_CARACTERES_DNI.charAt(modulo);
			
		return letra_devuelta;
	}
	
	public static char calculaLetra (String dni_extranjero) throws DniForaneoException
	{
		char letra_devuelta = ' ';
		char primera_letra = ' ';
		String dni_sinequis = null;
		int num_dni = -5;
		
			primera_letra = dni_extranjero.charAt(0);
			if (primera_letra != 'X')
			{
				//lanzar la excepción
				throw new DniForaneoException();
			}
			
			dni_sinequis = dni_extranjero.substring(1);//quito la X
			num_dni = Integer.parseInt(dni_sinequis);//paso la cadena a número
			letra_devuelta = calculaLetra(num_dni);
		
		return letra_devuelta;
	}

}
