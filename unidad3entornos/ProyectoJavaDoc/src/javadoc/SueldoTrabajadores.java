package javadoc;

import utilidades.Formatos;

/**
 * {@summary Este interfaz  define el comportamiento de la jerarquia de clases de nuestro
 * modelo }. Será implementado por la clase abstracta trabajador, que 
 * cederá la implementación a  Profesor y Conserje las clases que heredan de el
 * Obliga a implementar calculaSueldo() y calculaImpuesto a las subclases 
 * Profesor y Conserje
 * @author Carlos Cano
 * @author Serena Lopez 
 * @version 1.2
 * @since 1.0
 * 
 */


public interface SueldoTrabajadores {
	
	/**
	 * Este método calcula el sueldo para el trabajador específico. No recibe parámetros
	 * 	
	 * @author  Programador mantenimiento 8 
	 * @version 1.4
	 * @version 1.3
	 *@return double devuelve el sueldo calculado del trabajador contando impuestos
	 *@see Profesor#calculaSueldo()  
	 *@see Conserje#funcionTrabajador()
	 *@see Formatos#inicialConMayusculas(String)
	 */
	double calculaSueldo();
	
	
	/**
	 * Este método calcula los impuesto para el trabajador específico. No recibe parámetros
	 * 
	 *@return double devuelve los impuestos que tiene que pagar el trabajador
	 * @see javadoc.Profesor#calculaImpuestos()
	 *
	 */
	double calculaImpuestos();
	
	
	

}
