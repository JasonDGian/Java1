package javadoc;

/**
 * {@summary 
 * 
 * Clase Profesor que describe comportamientos y atributos dle mismo}
 * <p>
 *  Esta clase es la clase hereda de trabajador y define el objeto de profesor.
 *  Debe implementar todos los metodos de su clase madre 
 * </p>
 * 

 * 
 * Usamos en esta clase la API String para algunos de nuestros métodos
 * <a href="https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/lang/String.html"> API String</a>
 * 
 *  Las subclases del modelo que heredan de trabajador son
 * 
 * @author Carlos Cano
 * @author Serena Lopez 
 * @version 1.2
 * @since 1.0
 */
public class Profesor extends Trabajador implements SueldoTrabajadores, ITipoTrabajadores {

	
	public Profesor() {
		
		
	}
	
	public Profesor(int id, String nombre, double sueldo) {
		super(id,nombre,sueldo);
	
	}

	




	@Override
	public String toString() {
		return "Profesor [id=" + id + ", nombre=" + nombre + ", sueldo=" + sueldo + ", tipo=" + this.getTipo() + "]";
	}

	@Override
	public double calculaSueldo() {
		// TODO Auto-generated method stub
		
		
		return sueldo + 200 - calculaImpuestos();
	}

	@Override
	public double calculaImpuestos() {
		// TODO Auto-generated method stub
		return sueldo*0.20;
	}

	@Override
	public String funcionTrabajador() {
		// TODO Auto-generated method stub
		return EnumEmpleadosEducacion.PROFESOR.getFuncion();
	}

	@Override
	public EnumEmpleadosEducacion getTipo() {
		// TODO Auto-generated method stub
		return EnumEmpleadosEducacion.PROFESOR;
	}
	
	
	
	
	
	
	

}
