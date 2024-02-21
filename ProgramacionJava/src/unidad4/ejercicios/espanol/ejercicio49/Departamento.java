package unidad4.ejercicios.espanol.ejercicio49;

public class Departamento {

	/*
	 * Ejercicio 49. Clase Departamento y Municipio La gobernación de un
	 * departamento desea gestionar la información sobre sus municipios. Las
	 * gobernaciones tienen un nombre que representa el departamento al que
	 * pertenecen. Así, se requiere desarrollar un programa que implemente las
	 * siguientes funcionalidades: 
	 * • Constructor de la clase Departamento. 
	 * • Métodos get y set para el atributo nombre del departamento. 
	 * • Agregar un municipio a lista de municipios de un departamento. 
	 * Los datos de un municipio son: nombre del municipio, población total 
	 * del municipio, temperatura media del municipio y altitud sobre el nivel del mar. 
	 * • Eliminar un municipio de la lista de municipios de la gobernación del departamento. 
	 * • Buscar un municipio en la lista de municipios del departamento. 
	 * 	Si lo encuentra muestra en pantalla los
	 * datos del municipio. De lo contrario, se muestra el mensaje correspondiente.
	 * • Consultar si dada una población específica, existen municipios con una
	 * población mayor o igual a un valor dado: si existen municipios que cumplen
	 * dicha condición, se muestra en pantalla el nombre de municipio. Si no
	 * encuentra municipios que cumplan el criterio de búsqueda se mostrará el
	 * mensaje correspondiente. 
	 * • Cálculo del censo del departamento: calcular y
	 * mostrar en pantalla el total de población del departamento sumando las
	 * poblaciones de cada municipio
	 */
	
	
	//CONSTRUCTOR
	// GETTERS Y SETTERS  NOMBRE DEPART
	
	// METODOS FUNCIONALES.
	// Agregar minicipio a la lista
	// Borrar municipio de la lista
	// Buscar un municipio en la lista -> De encontrarlo mostrarlo por pantalla. De lo contraro mostrar un mensaje de "No existe en lista" 
	// Consultar si existen municipios con poblacion mayor o igual al valor de la poblacion especifica.
	// Calculo del censo del departamento.
	
	private String nombre;
	private Municipio[] municipios;
	
	public Departamento ( String nombre, Municipio[] municipios ) {
		this.nombre=nombre;
		this.municipios=municipios;
	}
	
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	// Funcionales.
	public void agregaMunicipio(Municipio nombre){
		
		//cuerpo que añade al listado de municpios un municpio.
		
	}
	
	public void eliminarMunicipio(Municipio nombre) {
		
		
		// cuerpo de codigo que borra del listado de municipios del departamento el municipio alimentado.
	}
	
	
}
