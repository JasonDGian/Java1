package javadoc;


/**
 * Esta clase implementará o abtraerá un tipo particular de trabajador en nuestra aplicación 
 * llamado conserje
 * 
 * @author Carlos Cano
 * 
 */

public class Conserje extends Trabajador implements SueldoTrabajadores, ITipoTrabajadores {

	
	public Conserje() {
		
		
	}
	
	public Conserje(int id, String nombre, double sueldo) {
		super(id,nombre,sueldo);
	
	}

	

	@Override
	public String toString() {
		return "Conserje [id=" + id + ", nombre=" + nombre + ", sueldo=" + sueldo + ", tipo=" + this.getTipo() + "]";
	}

	@Override
	public String funcionTrabajador() {
		// TODO Auto-generated method stub
		return EnumEmpleadosEducacion.CONSERJE.getFuncion();
	}
	
	@Override
	public EnumEmpleadosEducacion getTipo() {
		// TODO Auto-generated method stub
		return EnumEmpleadosEducacion.CONSERJE;
	}

}
