package unidad3.ejercicios.espanol.ejercicio8;

public class Caja {

	private int longitudBase;
	private int anchuraBase;
	private int altura;
	private String tipoCaja;
	
	//El primer constructor asigna valores a los atributos de acuerdo con los valores pasados
	//como parámetros.
	

	
	public Caja() {
		this.longitudBase=0;
		this.anchuraBase=0;
		this.altura=0;
	}
	
	public Caja(int longitud, int anchura, int altura) {
		this.longitudBase=longitud;
		this.anchuraBase=anchura;
		this.altura=altura;
	}
	
	// El segundo constructor inicializa todos los atributos de una caja con valores de cero

	
	public Caja(int longitud) {
		this(longitud,longitud,longitud);
	}
	
	/* Definir un nuevo atributo que represente el tipo de caja y un nuevo constructor que
	*  reciba como parámetros los valores de los cuatro atributos. Este constructor debe
	*  invocar al primero
	*/
	public Caja(String tipoCaja, int longitud, int anchura, int altura) {
		this(longitud, anchura, altura);
		this.tipoCaja=tipoCaja;
		
	}

	public int getLongitudBase() {
		return longitudBase;
	}

	public void setLongitudBase(int longitudBase) {
		this.longitudBase = longitudBase;
	}

	public int getAnchuraBase() {
		return anchuraBase;
	}

	public void setAnchuraBase(int anchuraBase) {
		this.anchuraBase = anchuraBase;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public String getTipoCaja() {
		return tipoCaja;
	}

	public void setTipoCaja(String tipoCaja) {
		this.tipoCaja = tipoCaja;
	}

	@Override
	public String toString() {
		return "Caja [longitudBase=" + longitudBase + ", anchuraBase=" + anchuraBase + ", altura=" + altura
				+ ", tipoCaja=" + tipoCaja + "]";
	}
	
	


}
