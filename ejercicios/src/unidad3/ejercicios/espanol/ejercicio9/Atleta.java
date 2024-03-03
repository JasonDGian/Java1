package unidad3.ejercicios.espanol.ejercicio9;

public class Atleta {

	// Atributos estaicos
	private static int numAtletas=0;
	private static String seleccion="Colombia";
	private static double tiempoEquipo;
	
	// Atributos dinamicos
	private int identificador;
	private String nombre;
	private double tiempoResultado;
	
	// Constructor
	public Atleta (String nombre, double tiempo) {
		numAtletas++;
		this.identificador=numAtletas;
		this.nombre=nombre;
		this.tiempoResultado=tiempo;
	}
	
	// Metodos estaticos.
	public void seleccion() {
		System.out.println("La selección de atletismo es " + Atleta.seleccion);
	}
	

	public void tiempoEquipo() {
		System.out.println("Los tiempos totales suman: " + Atleta.tiempoEquipo);
	}
	
	// getter
	
	public int getNumAtletas() {
		return numAtletas;
	}
	
	// Funcionales

	public void correr400Metros() {
		Atleta.tiempoEquipo=Atleta.tiempoEquipo + this.tiempoResultado;
	}


	@Override
	public String toString() {
		return "Atleta [identificador=" + identificador + ", nombre=" + nombre + ", tiempoResultado=" + tiempoResultado
				+ "]";
	}

	
	
	
	
}
