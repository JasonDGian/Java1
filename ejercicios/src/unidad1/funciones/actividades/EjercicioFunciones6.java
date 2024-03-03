package unidad1.funciones.actividades;

import java.util.Scanner;

public class EjercicioFunciones6 {

	static void Login(String usuario, String password) {

		System.out.println(usuario.equals("usuario1") && password.equals("asdasd") ? true : false);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		for (int i = 3; i>=1 ; i--) {
			
			System.out.println("Intentos restantes; " + i);
			
			Scanner sc = new Scanner(System.in);

			System.out.println("Introduce el usuario.");
			String usuario = sc.next();

			System.out.println("Introduce la password.");
			String password = sc.next();

			Login(usuario, password);
			
		}
		
		System.out.println("SALIENDO DE LOGIN");
		//sc.close();
	}

}
