package iesjandula.projectunit5.excepciones.ejemploExcepciones;

import java.util.InputMismatchException;

public class ErrorEntradaException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2L;

	
	
	public ErrorEntradaException( String mensaje, InputMismatchException em) {
		
		
		super(mensaje ,em, false,false);
	
				
	}
	
	
	
	
}
