package unidad3.ejercicios.espanol.ejercicio12;

public class Fraccion {

	// atributos
	private int numerador;
	private int denominador;
	
	// Construcores
	public Fraccion() {}
	
	public Fraccion(int numerador, int denominador) {
		
		this.numerador=numerador;
		this.denominador=denominador;
		
	}
		
	// Getters and setters
	public int getNumerador() {
		return numerador;
	}
	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}
	public int getDenominador() {
		return denominador;
	}
	public void setDenominador(int denominador) {
		this.denominador = denominador;
	}

	@Override
	public String toString() {
		return "Fraccion [numerador=" + numerador + ", denominador=" + denominador + "]";
	}
	
	
	
	
	
}
