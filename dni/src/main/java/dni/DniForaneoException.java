package dni;

public class DniForaneoException extends RuntimeException{
	
	private static final String MENSAJE_ERROR = "FORMATO DNI EXTRANJERO X seguido de n�meros";

	public DniForaneoException ()
	{
		super (MENSAJE_ERROR);
	}
	
	
}
