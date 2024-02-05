package unidad3.ejercicios.espanol.ejercicio2;

public class CuentaBancaria {
	
	// Enum
	public static enum EnumTipoCuenta {CUENTA_AHORROS, CUENTA_CORRIENTE};
	
	// Atributos de clase
	private static int numeroCuenta=0;
	
	// Atributos de objeto
	private String nombre;
	private String apellido;
	private EnumTipoCuenta tipocuenta;
	private float saldo=0;
	private int numeroDeCuenta;
	private boolean estadoCuenta;
	
	// Constructores
	public CuentaBancaria(){
		numeroCuenta++;
		this.numeroDeCuenta=numeroCuenta;
		this.estadoCuenta=true;
	}

	public CuentaBancaria(String nombre, String apellido, EnumTipoCuenta tipocuenta) {
		this();
		this.nombre = nombre;
		this.apellido = apellido;
		this.tipocuenta = tipocuenta;		
	}
	
	// Metodos estaticos 
	
	// Getters y setters
	private boolean getEstadoCuenta() {
		return this.estadoCuenta;
	}
	
	private void setEstadoCuenta(boolean estado) {
		this.estadoCuenta=estado;
	}
	
	public int getNumeroDeCuenta() {
		return this.numeroDeCuenta;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public EnumTipoCuenta getTipocuenta() {
		return tipocuenta;
	}

	public void setTipocuenta(EnumTipoCuenta tipocuenta) {
		this.tipocuenta = tipocuenta;
	}
	
	// Metodos funcionales
	public void consignar(int cantidadDeposito) {
		
		if ( this.estadoCuenta ) {
			System.out.println("Cantidad inicial: " + this.saldo);
			setSaldo(this.saldo + cantidadDeposito);
			System.out.println("Deposito: " + cantidadDeposito);
			System.out.println("Cantidad actual: " + this.saldo);
		}
		
		else { System.out.println("La cuenta en la que intenta consignar está inactiva");}
		
	}
	
	
	public void retirar(int cantidadRetiro) {
		
		if ( this.estadoCuenta ) {
			
			if (this.saldo >= cantidadRetiro) {
				System.out.println("Saldo inicial: " + this.saldo);
				setSaldo(this.saldo-cantidadRetiro);
				System.out.println("Cantidad retirada: " + cantidadRetiro);
				System.out.println("Saldo actual: " + this.saldo);
				
				// control actividad cuenta
				if (this.saldo==0) {
					this.setEstadoCuenta(false);		
					System.out.println("Cuenta desactivada debido a saldo zero");
				}
			}
			else System.out.println("Error, la cantidad disponible no es suficiente.");

		}
		
		else { System.out.println("La cuenta en la que intenta consignar está inactiva");}
		
	}

	@Override
	public String toString() {
		return "CuentaBancaria [nombre=" + nombre + ", apellido=" + apellido + ", tipocuenta=" + tipocuenta + ", saldo="
				+ saldo + ", numeroDeCuenta=" + numeroDeCuenta + ", estadoCuenta=" + estadoCuenta + "]";
	}


	
	
	// Metodos override
	
	
}
