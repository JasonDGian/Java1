package unidad3.ejercicios.espanol.ejercicio29;

public class Fraccion extends Numerica{
	
	private int nominador;
	private int denominador;
	
	

	public Fraccion(int nominador, int denominador) {
		this.nominador = nominador;
		this.denominador = denominador;
	}

	@Override
	public Numerica sumar(Numerica numero) {
		// Metodo que suma la fracción al objeto numero dado.
		return nominador/denominador+;
	}

	@Override
	public Numerica restar(Numerica numero) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Numerica multiplicar(Numerica numero) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Numerica dividir(Numerica numero) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

	
	// GETTERS Y SETTERS
	
	public int getNominador() {
		return nominador;
	}

	public void setNominador(int nominador) {
		this.nominador = nominador;
	}

	public int getDenominador() {
		return denominador;
	}

	public void setDenominador(int denominador) {
		this.denominador = denominador;
	}
	
	
	
	

	
	
}
