package dni;

public class DniForaneoException extends RuntimeException{
	
	private static final String MENSAJE_ERROR = "FORMATO DNI EXTRANJERO X seguido de números";

	public DniForaneoException ()
	{
		super (MENSAJE_ERROR);
	}
	
	
}
