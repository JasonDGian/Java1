package iesjandula.projectunit5.excepciones.ejemploExcepciones;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;


public class Impuestos {
	   
	   private Logger logger;
	   private Marker marker;
	   
	   public Impuestos() {
	       // esto es lo que genera el mensaje.
	       logger = LogManager.getLogger();
	       // esto es lo que pinta en el mensaje la identidad tipo "impuestos"
	       marker = MarkerManager.getMarker(Impuestos.class.getName());
	       
	       
	   }

	   public double calculoImpuestos(Empleado e) throws ErrorIRPFException {

	       String mensaje = "Error de IRPF en el empleado.";

	       if (e.getIrpf() > 0.50)
	           mensaje += " Demasiado alto. Solucionar";
	       else if (e.getIrpf() < 0)
	           mensaje += " Negativo. Solucionar";

	       if (e.getIrpf() > 0.50 || e.getIrpf() < 0.0) {
	           
	           logger.error(marker, "Se va a lanzar la excepcion ErrorIRPFException");

	           throw new ErrorIRPFException(mensaje);

	       }

	       return e.getSueldo() * e.getIrpf();
	   }

	}