package dni;

public class DniNegativoException extends RuntimeException{
	
	private static final String MENSAJE_ERROR = "NO SE ADMITEN N�MEROS NEGATIVOS";

	public DniNegativoException ()
	{
		super (MENSAJE_ERROR);
	}
	
	
}
