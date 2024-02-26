package iesjandula.unit4project.varargs;

import java.util.function.Function;
// funciones como primera clase = variables y parametros. 
public class EjemploVarArgs {
// metodo que toma un numero variable de parametros
	static void fun(int... a) {
		System.out.println("Numero de parametros " + a.length);
// for each
		for (int i : a)
			System.out.print(i + " ");
		System.out.println();
// recorrido con for y notacion de array
		for (int i = 0; i < a.length; i++) {
			a[i]++;
		}
	}

// Metodo que toma un array como parametro.
	static void fun3(int[] a) {
	}
	
	
	// Funcion media con varagrs para enteros.
	static double mediaEnterosVarios(int... number) {
		double acumulador = 0d;

		for (int num : number) {
			acumulador += num;
		}

		return acumulador / number.length;

	}
	
	// num está en la lista de parametros que va detras.
	static boolean estaEnLista(int num, int... varArgs) {
		boolean encontrado = false;

		for (int i = 0; i < varArgs.length && !encontrado; i++) {

			if (varArgs[i] == num) {
				encontrado = true;
			}

		}

		return encontrado;
	}
	
	
	// este parametro recibe una lambda como parametro, esa lambda recibe un entero y devuelve un doble.
	static double tratarNumerosConLambdas(Function<Integer,Double> miFunc, int...listaNum) { // también se pueden usar las clases wrapper en varArgs
		
		double suma = 0d;
		
		for (int num : listaNum) {
			
			System.out.println(num);
			System.out.println(miFunc.apply(num));  // .apply aplica la funcion miFunc pasada cómo parámetro.. 
			suma+=miFunc.apply(num);
		}
		
		return suma;
		
	}
	
	

// metodo main
	public static void main(String args[]) {
		int[] arrayNum = { 1, 3, 4, 6, 7 };
// llamamos con un numero diferente de parametros a fun
// 1 parametro
		fun(100);
// 4 parametros
		fun(1, 2, 3, 4);
// esta llamada fallaria en compilacion
// fun3(1, 2, 3, 4);
// sin parametros
		fun();
		fun3(arrayNum);
		fun(arrayNum);
		fun(arrayNum);
		
		
		// Con funcion pasada SQRT
		tratarNumerosConLambdas( (num)->Math.sqrt(num), 3, 6, 7, 8 );
		// con funcion pasada POW
		tratarNumerosConLambdas( (num)->Math.pow(num,2), 3, 6, 7, 8 );
	}
	

}