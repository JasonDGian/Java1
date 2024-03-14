package iesjandula.projectunit5.excepciones.ejemploExcepciones;

public class Impuestos {
	
	
	public double calculoImpuestos(Empleado e) throws ErrorIRPFException {
		
		String mensaje ="Error de IRPF en el empleado. ";
		
		if (e.getIrpf() > 0.50) {
			mensaje = mensaje + " Demasiado alto.";
		}
		
		else if (e.getIrpf() < 0 ) {
			mensaje = mensaje + " Negativo." ;
		}
		
		
		if (e.getIrpf()> 0.50 || e.getIrpf() < 0.0) {		
	
			throw new ErrorIRPFException(mensaje);
		}
		
		return e.getSueldo()*e.getIrpf();
	}

}
