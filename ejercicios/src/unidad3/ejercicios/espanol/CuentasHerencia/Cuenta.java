package unidad3.ejercicios.espanol.CuentasHerencia;

public class Cuenta {
	
	// Atributos privados protegidos.
	protected float saldo;
	protected int numeroDeposito;
	protected int numeroRetiro;
	protected float tasaAnual;
	protected float comisionMensual;
	
	// Construcotres
	public Cuenta() {
		this.numeroDeposito=0;
		this.numeroRetiro=0;
		this.comisionMensual=0;
	}

	public Cuenta(float saldo, float tasa_anual) {
		this(); // Podemos invocar el constructor "vacio" ahorrando codigo.
		this.saldo = saldo;
		this.tasaAnual = tasa_anual;
	}	
	
	
	//Depositar una cantidad de dinero en la cuenta actualizando su saldo.
	public float consignar(float cantidad) {
		
		this.saldo=this.saldo+cantidad;
		this.numeroDeposito++; // incremento en numero deposito.
		return this.saldo;
	}
	
	//Retirar una cantidad de dinero en la cuenta actualizando su saldo. 
	//El valor a retirar no debe superar el saldo.
	public float retirar(float cantidad) {
		
		if ( cantidad<=this.saldo ) {
			this.saldo=(this.saldo-cantidad);
			this.numeroRetiro++; // incremento en numero retiro.
		}
		
		else {
			System.out.println("La cantidad introducida para el retiro supera el saldo disponible.");
		}
		
		return this.saldo;
	}
	
	
	/*----------------------- REVISAR ----------------------------*/
	//Calcular el interés mensual de la cuenta y actualiza el saldo correspondiente.
	public void calcularInteres() {
		// suponiendo que le interes mensual sea una cifra de porcentaje.
		float interes=(this.saldo*comisionMensual)/100;
		this.saldo+=interes;
	}

	
	/*----------------------- REVISAR ----------------------------*/

	public void extractoMensual() {
		// Resta la comision mensual al saldo actual de la cuenta.
		this.retirar(this.comisionMensual);
		
	}

	@Override
	public String toString() {
		return "Cuenta [saldo=" + saldo + ", numeroDeposito=" + numeroDeposito + ", numeroRetiro=" + numeroRetiro
				+ ", tasaAnual=" + tasaAnual + ", comisionMensual=" + comisionMensual + "]";
	}
	
	
	
	
	
	
	
}
