package javadoc;


/**
 * {@summary 
 * 
 * Esta etiqueta sólo puede ir en cabeceras de clases, interfaces, modulos y paquetes}
 * <p>
 * 
 * Este clase es la clase abstracta trabajador que define la base de la jerarquia de nuestro
 * modelo. Heredarán de ella Profesor y Conserje
 * Obliga a implementar funcion Trabajador: {@link javadoc.Trabajador#funcionTrabajador()}
 * 
 * </p>
 * 

 * 
 * Usamos en esta clase la API String para algunos de nuestros métodos
 * <a href="https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/lang/String.html"> API String</a>
 * 
 *  Las subclases del modelo que heredan de trabajador son
 * <ul>
 * 			<li>
 * 				Profesor
 * 			</li>
 * 	     	<li>
 * 				Conserje
 * 			</li>
 *  </ul>

 * 
 * @author Carlos Cano
 * @author Serena Lopez 
 * @version 1.2
 * @since 1.0
 * @see javadoc.SueldoTrabajadores {@link javadoc.SueldoTrabajadores}
 */

public abstract class  Trabajador implements SueldoTrabajadores {
	
	/**
	 *  Identificador del trabajador
	 *  
	 */
	protected int id;
	
	/**
	 *  Nombre del trabajador
	 *  
	 */
	protected String nombre;
	
	/**
	 *  sueldo del trabajador
	 *  
	 */
	protected double sueldo;
	
	
	/**
	 * Este método calcula el sueldo para el trabajador específico. No recibe parámetros
	 * Este método será implementado por todas las subclases	 * 
	 * como profesor que podeis ver en el enlace {@link Profesor#funcionTrabajador}
	 
	 * 
	 * 
	 *@return double
	 *@see Profesor#funcionTrabajador() javadoc.Conserje#funcionTrabajador()
	 *
	 */
	
	public abstract String funcionTrabajador();
	
	public Trabajador() {
		
		
	}
	
	
	/**
	 * Este método será reutilizado por las subclases para crear objetos con la llamada
	 * a super
	  
	 * 
	 *@param id, introducimos el identificador, un entero de Trabajador
	 *@param nombre, el nombre del trabajador
	 *@param sueldo, su sueldo en decimal
	 *@see Profesor#funcionTrabajador() javadoc.Conserje#funcionTrabajador()
	 *@version 1.2
	 *@since 1.0
	 *
	 *
	 */
	
	
	public Trabajador(int id, String nombre, double sueldo) {
	
		this.id=id;
		this.nombre = nombre;
		this.sueldo = sueldo;
	}

	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	

	@Override
	public String toString() {
		return "Trabajador [id=" + id + ", nombre=" + nombre + ", sueldo=" + sueldo + "]";
	}

	@Override
	public int hashCode() {
		
		return id;
	}

	@Override
	public boolean equals(Object obj) {
	
		
		return this.id==((Trabajador) obj).getId(); 
		
	}
	
	
	

	@Override
	public double calculaSueldo() {
		// TODO Auto-generated method stub
		
		
		return sueldo - calculaImpuestos();
	}

	
	//Comentar usando author @return @since
	@Override
	public double calculaImpuestos() {
		// TODO Auto-generated method stub
		return sueldo*0.10;
	}
	
	//Comentar usando author @return @since
	public double calculaSueldoBase() {
		
	
		
		return sueldo-  calculaImpuestos();
		}
	
	
	/**
	 * Este método será reutilizado por las subclases para crear objetos con la llamada
	 * a super
	 * 
	 *@return double, sueldo del trabajador
	 *@see Profesor#funcionTrabajador() 
	 *@see javadoc.Conserje#funcionTrabajador()
	 *@version 1.1
	 *@since 1.0
	 *@deprecated desde version 1.1 porque hay 
	 *un método nuevo {@link Trabajador#calculaSueldoBase()}
	 */
	@Deprecated(since = "1.1", forRemoval = true)
	public double viejoCalculoSueldo() {
		
		return sueldo*0.12;
	}
	

}
