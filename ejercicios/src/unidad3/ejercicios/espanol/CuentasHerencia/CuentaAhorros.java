package unidad3.ejercicios.espanol.CuentasHerencia;

public class CuentaAhorros extends Cuenta{
	
	// Atributos de subclase
	private boolean cuentaActiva;
	
	
	// Si el saldo es menor a $10 000, la cuenta esta  inactiva, en caso 
	// contrario se considera activa. Los siguientes me todos se redefinen: 
	public CuentaAhorros(float saldo, float tasa) {
		
		super(saldo, tasa); // invocamos el constructor de objeto superior y pasamos los parametros dados.
		
		if (this.saldo<10000) { 
			this.cuentaActiva=false; 
			}
		
		else {
			this.cuentaActiva=true;
			}
	}
	
	
	//Consignar: se	puede consignar dinero si la cuenta esta  activa. Debe invocar al me todo heredado.
	@Override
	public void consignar(float cantidad) {

		if (this.cuentaActiva) {
			super.consignar(cantidad); //La palabra clave "super" permite invocar metodos del padre.
		}
		
		else {
			System.out.println("ERROR; Cuenta inactiva");
			}
	}
	
	
	//Retirar: es posible retirar dinero si la cuenta esta  activa. Debe invocar al me todo	heredado.
	@Override
	public void retirar(float cantidad) {
		
		if (this.cuentaActiva) {
			super.retirar(cantidad); //La palabra clave "super" permite invocar metodos del padre.
		}
		
		else {
			System.out.println("ERROR; Cuenta inactiva");
			}
	}
	
	
	// Extracto mensual: si el nu  mero de retiros es mayor que 4, por cada retiro adicional,
	// se cobra $1000 como comisio  n mensual. Al generar el extracto, se determina si la
	// cuenta esta  activa o no con el saldo.
	@Override
	public void extractoMensual(){
		
	}

	public void imprimir() {
		System.out.println( "El saldo de la cuenta es: " + this.saldo );
		System.out.println( "La comisión mensual de la cuenta es: " + this.comisionMensual );
		System.out.println("El numero de transacciones realizadas es" + Math.addExact(numeroRetiro, numeroDeposito));
	}

}



