package unidad3.ejercicios.espanol.ejercicio12;

import java.util.Scanner;


public class Fraccion {
	
	static int mcd (int num1, int num2) {
		
		// Posiciona el mayor numero en A y el menor en B
		int a = Math.max(num1, num2);
		int b = Math.min(num1, num2);
		
		int resto = 0;
		int restoAnterior = 0;
		
		do {
			
			restoAnterior=resto; // almacena el resto anterior para devolver como resultado.
			resto = a % b; // calcula el resto de la iteracion actual.
		
		a = b; // actualiza el valor de A
		b = resto; // actualiza el valor de B
		
		} 
		while (resto!=0);
		
		return restoAnterior;
	}
	
	

	// atributos
	private int numerador;
	private int denominador;
	
	// Construcores
	public Fraccion() {}
	
	public Fraccion(int numerador, int denominador) {
		
		this.numerador=numerador;
		this.denominador=denominador;
		
	}
	

	public static void leerFraccion() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce nominador.");
		int nominador = scan.nextInt();
		System.out.println("Introduce denominador.");
		int denominador = scan.nextInt();
		
		Fraccion frac = new Fraccion( nominador, denominador );
		System.out.println("La fracción simplificada es: " + frac.simplificarFraccion());	
		
	}
	
	public static void escribirFraccion(Fraccion frac) {
		if (frac.simplificarFraccion().denominador==1) {
			System.out.println("El valor es: " + frac.simplificarFraccion().getNumerador());
		}
		
		else {
			System.out.println("El valor es: " + frac.simplificarFraccion().getNumerador() + "/" + frac.simplificarFraccion().getDenominador());
		}
	}
	
	
	/*	• Simplificar_fracción: Esta función simplifica la fracción, para ello hay que dividir
			numerador y dominador por el MCD del numerador y denominador*/
	
	public Fraccion simplificarFraccion() {
			
		Fraccion simplificada = new Fraccion (this.getNumerador(),this.getDenominador());
		
		int divisor= mcd(simplificada.getNumerador(),simplificada.getDenominador());
		
		simplificada.setDenominador(simplificada.getDenominador()/divisor);
		simplificada.setNumerador(simplificada.getNumerador()/divisor);
		
		return simplificada;
	}

	
	/*
	• Sumar_fracciones: Función que recibe dos funciones n1/d1 y n2/d2, y calcula la suma
	de las dos fracciones. La suma de dos fracciones es otra fracción
	cuyo numerador=n1d2+d1n2 y denominador=d1d2. Se debe simplificar la fracción
	resultado.
	*/
	public static Fraccion sumarFracciones(Fraccion f1, Fraccion f2) {
		
		Fraccion fres = new Fraccion ();
		
		fres.setNumerador(f1.getNumerador()*f2.getDenominador() + f1.getDenominador()*f2.getNumerador());
		fres.setDenominador(f1.getDenominador() * f2.getDenominador());
		
		return fres.simplificarFraccion();
	}
	
	
	/*
	• Restar_fracciones: Función que resta dos fracciones: numerador=n1d2-
	d1n2 y denominador=d1d2. Se debe simplificar la fracción resultado.
	*/
	public static Fraccion restarFracciones(Fraccion f1, Fraccion f2) {
		
		Fraccion fres = new Fraccion ();
		
		fres.setNumerador( (f1.getNumerador()*f2.getDenominador()) - (f1.getDenominador()*f2.getNumerador()));
		fres.setDenominador(f1.getDenominador() * f2.getDenominador());
		
		return fres.simplificarFraccion();
	}
	
	
	
	/*
	• Multiplicar_fracciones: Función que recibe dos fracciones y calcula el producto,
	para ello numerador=n1n2 y denominador=d1d2. Se debe simplificar la fracción
	resultado.
	
	• Dividir_fracciones: Función que recibe dos fracciones y calcula el cociente, para
	ello numerador=n1d2 y denominador=d1n2. Se debe simplificar la fracción resultado.
	*/
	
	
	
	// GETTERS Y SETTERS
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
		return this.getNumerador() + "/" + this.getDenominador();
	}
	
	
	/*
	if ( (simplificada.numerador%2==0) && (simplificada.denominador%2==0) ) {
		
		simplificada.setNumerador(simplificada.getNumerador()/2);
		simplificada.setDenominador(simplificada.getDenominador()/2);
		
	}
	
	else if ( (simplificada.numerador%3==0) && (simplificada.denominador%3==0) ) {
		
		simplificada.setNumerador(simplificada.getNumerador()/3);
		simplificada.setDenominador(simplificada.getDenominador()/3);
	}
	
	else if ( (simplificada.numerador%5==0) && (simplificada.denominador%5==0) ) {
		
		simplificada.setNumerador(simplificada.getNumerador()/5);
		simplificada.setDenominador(simplificada.getDenominador()/5);
	}
	
	else if ( (simplificada.numerador%7==0) && (simplificada.denominador%7==0) ) {
		
		simplificada.setNumerador(simplificada.getNumerador()/7);
		simplificada.setDenominador(simplificada.getDenominador()/7);
	}
	
	else if ( (simplificada.numerador%11==0) && (simplificada.denominador%11==0) ) {
		
		simplificada.setNumerador(simplificada.getNumerador()/11);
		simplificada.setDenominador(simplificada.getDenominador()/11);
	}*/
				
	
	
}
