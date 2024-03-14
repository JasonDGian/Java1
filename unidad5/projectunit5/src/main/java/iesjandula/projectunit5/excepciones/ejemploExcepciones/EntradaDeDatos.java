package iesjandula.projectunit5.excepciones.ejemploExcepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EntradaDeDatos {

	private Scanner sc = null;
	public EntradaDeDatos() {
		
		
		sc = new Scanner(System.in);
		
	}
	
	public String leerString() throws ErrorEntradaException {
		
		try {
		return sc.next();
		} catch (InputMismatchException ime) {
			
			 throw new ErrorEntradaException("Error al leer en cadena ", ime);
			
		}
	}
	
	public double leerDouble() throws ErrorEntradaException {
		
		
		try {
			return sc.nextDouble();
			} catch (InputMismatchException ime) {
				
				 throw new ErrorEntradaException("Error al leer el numero decimal ", ime);
				
			}
		
	}
	
public int leerEntero() throws ErrorEntradaException {
		
		
		try {
			return sc.nextInt();
			} catch (InputMismatchException ime) {
				
				 throw new ErrorEntradaException("Error al leer numero entero ", ime);
				
			}
		
	}


public void pulsaEnterParaContinuar() {
	System.out.println("Pula enter para continuar. . . . .");
	// este scanner recibirá un el enter bufereado del input de numero anterior.
	sc.nextLine();
}
	
	
}
