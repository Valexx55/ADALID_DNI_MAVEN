package dni;

public class DniNegativoException extends RuntimeException{
	
	private static final String MENSAJE_ERROR = "NO SE ADMITEN NÚMEROS NEGATIVOS";

	public DniNegativoException ()
	{
		super (MENSAJE_ERROR);
	}
	
	
}
