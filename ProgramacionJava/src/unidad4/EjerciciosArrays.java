package unidad4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class EjerciciosArrays {

	// EJERCICIO 1
	public static String creaArrayConNumerosAleatorios(int tam) {
		// Crear un metodo que cree un array con numeros aleatorios.
		// La funcion recibe un entero que define le tamaño de la array.

		// puedo usar variables de tipo entero para asignar el tamaño a la rray
		int[] array = new int[tam];

		for (int i = 0; i < array.length; i++) {

			Random rd = new Random();
			array[i] = rd.nextInt(10);

		}

		return Arrays.toString(array); // La clase Array puede convertir una array dada en string.
	}

	// EJERCICIO 5
	public static int[] CreaArray(int tamaño) {
		Scanner sc = new Scanner(System.in);
		int[] almacen = new int[tamaño];

		for (int i = 0; i < tamaño; i++) {

			almacen[i] = sc.nextInt();
		}

		return almacen;
	}

	public static void ImprimeArray(int[] array) {

		for (int i = 0; i < (Array.getLength(array)); i++) {

			if (i != (Array.getLength(array) - 1)) {
				System.out.print("| " + array[i] + " ");
			}

			else {
				System.out.print("| " + array[i] + " |");
			}
		}

		System.out.println();

	}

	// EJERCICIO 6
	public static int[] leer10yGuardarEnArray() {
		int[] array = new int[10];
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < array.length; i++) {

			System.out.println("Introduce un array entry:");
			array[i] = scan.nextInt();

		}

		ArrayConLiterales.pintarArrayEnteros(array);

		return array;
	}

	// EJERCICIO 6 - Polimorfismo.
	public static int[] leerNyGuardarEnArray(int n) {
		int[] array = new int[n];
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < array.length; i++) {

			System.out.println("Introduce un array entry:");
			array[i] = scan.nextInt();

		}

		ArrayConLiterales.pintarArrayEnteros(array);

		return array;
	}

	// EJERCICIO 6 - Diferente.
	
	public static int[] leerNyGuardarParesEnArray(int num) {
		int[] array = new int[num];
		int posicion = 0;
		int entrada;
		Scanner scan = new Scanner(System.in);		
		
				for (int i = array.length; i>0; i--) {
					
					entrada = scan.nextInt();
					
					// Si el numero de entrada es par lo almacenamos y aumentamos el contador de posicion.
					if ( (entrada%2) == 0) {
						array[posicion] = entrada;
						posicion++;
					}
				}
		ArrayConLiterales.pintarArrayEnteros(array , 0);		
		
		return array;
	}
	
	// EJERCICIO 7
	// Crear un array de cadenas. Se lee el tamaño de las cadenas por la consola. 
	// Al final se muestran los nombres separados por comas.
	public static String[] leeCadenas (int num){
		
		// Longitud del array definido parametrizado.
		String[] cadena = new String[num];
		
		Scanner scan = new Scanner (System.in);
		
		for (int i = 0; i<cadena.length; i++) {
			
			cadena[i]=scan.nextLine();
			
		}
		
		ArrayConLiterales.pintarArrayCadenas(cadena, "");
		
		return cadena;		
		
	}
	

	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("----------- EJERCICIO 1 -----------");
		System.out.println(creaArrayConNumerosAleatorios(4));

		// EJERCICIO 2
		System.out.println("----------- EJERCICIO 2 -----------");
		int[] num = new int[12];
		num[0] = 39;
		num[1] = -2;
		num[4] = 0;
		num[6] = 14;
		num[8] = 5;
		num[9] = 120;

		System.out.println(Arrays.toString(num));

		// EJERCICIO 3
		System.out.println("----------- EJERCICIO 3 -----------");
		char[] simbolo = new char[10];
		simbolo[0] = 'a';
		simbolo[1] = 'x';
		simbolo[4] = '@';
		simbolo[6] = ' ';
		simbolo[7] = '+';
		simbolo[8] = 'Q';

		// Con conversion a string.
		System.out.println(Arrays.toString(simbolo));
		// impresion directa.
		System.out.println(simbolo);

		// EJERCICIO 4
		System.out.println("----------- EJERCICIO 4 -----------");
		int[] numero = new int[20];
		int[] cuadrado = new int[20];
		int[] cubo = new int[20];

		for (int i = 0; i < (Array.getLength(numero)); i++) {

			Random rand = new Random();
			numero[i] = rand.nextInt(100);

		}

		System.out.println("Los números inciales son: \n" + Arrays.toString(numero));

		for (int i = 0; i < (Array.getLength(numero)); i++) {
			cuadrado[i] = (int) Math.pow(numero[i], 2);
		}

		System.out.println("Los números al cuadrado son: \n" + Arrays.toString(cuadrado));

		for (int i = 0; i < (Array.getLength(numero)); i++) {
			cubo[i] = (int) Math.pow(numero[i], 3);
		}

		System.out.println("Los números al cubo son: \n" + Arrays.toString(cubo));

		System.out.println("----------- EJERCICIO 5 -----------");

		Scanner sc = new Scanner(System.in);

		System.out.println("Cuantos valores deseas almacenar?");
		int tamaño = sc.nextInt();
		// CreaArray(tamaño);
		ImprimeArray(CreaArray(tamaño));

		// EJERCICIO 6
		// Escribir un programa que lea 10 numeros los guarde en un array y los muestre.
		// leer10yGuardarEnArray();
		//leerNyGuardarEnArray(5);
		
		System.out.println("leeN");
		leerNyGuardarParesEnArray(5);
		
		// EJERCICIO 7
		// Leer cadena por pantalla y otra para escribir. HAcerlo en strings
		System.out.println("leecadenasN");
		leeCadenas(2);
		

	}
}
