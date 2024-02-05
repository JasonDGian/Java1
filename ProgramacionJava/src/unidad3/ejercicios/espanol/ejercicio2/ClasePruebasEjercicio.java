package unidad3.ejercicios.espanol.ejercicio2;

import ejercicios.espanol.ejercicio2.CuentaBancaria.EnumTipoCuenta;

public class ClasePruebasEjercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		CuentaBancaria MiCuenta1 = new CuentaBancaria("jose", "giralda", EnumTipoCuenta.CUENTA_AHORROS);
			
		CuentaBancaria MiCuenta2 = new CuentaBancaria("juan", "gomez", EnumTipoCuenta.CUENTA_CORRIENTE);

		CuentaBancaria MiCuenta3 = new CuentaBancaria("jota", "gutierrez", EnumTipoCuenta.CUENTA_AHORROS);
	
		CuentaBancaria MiCuenta4 = new CuentaBancaria("jelipe", "giros", EnumTipoCuenta.CUENTA_AHORROS);
	
		
		System.out.println("El numero de cuentas registradas es " +  MiCuenta1.getNumeroCuenta());
		
		System.out.println("El numero de cuenta de " + MiCuenta1.getNombre() + " es " +  MiCuenta1.getNumeroDeCuenta());
		System.out.println("El numero de cuenta de " + MiCuenta2.getNombre() + " es " +  MiCuenta2.getNumeroDeCuenta());
		System.out.println("El numero de cuenta de " + MiCuenta3.getNombre() + " es " +  MiCuenta3.getNumeroDeCuenta());
		System.out.println("El numero de cuenta de " + MiCuenta4.getNombre() + " es " +  MiCuenta4.getNumeroDeCuenta());

		System.out.println();
		
		MiCuenta1.consignar(100);
		
		System.out.println();

		MiCuenta1.retirar(80);
		
		System.out.println();
		
		MiCuenta1.retirar(80);
		
		MiCuenta1.retirar(20);
		
		System.out.println(MiCuenta1);
		System.out.println(MiCuenta2);
		System.out.println(MiCuenta3);
		System.out.println(MiCuenta4);
	}

}
