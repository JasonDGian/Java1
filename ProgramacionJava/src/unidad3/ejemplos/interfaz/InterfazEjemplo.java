package unidad3.ejemplos.interfaz;

public interface InterfazEjemplo {

	
	/*
	Las interfaces son similares a las clases, pero en oposición a las clases, no
	ofrecen código para ser heredado por las clases. Las interfaces declaran
	métodos abstractos que deben ser codificados por las clases que
	implementan estas interfaces. Una interfaz es una colección de nombres de
	método, sin definiciones reales, que indican que una clase tiene un conjunto
	de comportamientos además de los comportamientos que la clase obtiene de
	sus superclases. 
	*/
	
	/* Todos los métodos declarados pero no definidos en Interfaces son abstractos, 
	 * y no necesitan usar el modificador abstract.*/
	
	// Tanto este
	public abstract double metodoAbstracto ();
	
	// Como este son abstractos.
	public double metodoAbstractoAunqueNoDeclarado ();
	
	
	// Para importar una interfaz usamos "implements nombreInterfaz"
	
	
	
}
