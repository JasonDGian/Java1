package unidad1.bucles;

import java.util.Scanner;

public class TablaDeMultiplicarSimple {

   public static void main(String[] args) {
       // TODO Auto-generated method stub
       int num=0;
       //Coger número por pantalla
       Scanner sc = new Scanner(System.in);
       
       // que el programa se quede en un bucle while hasta que
       // el usuario incluya un número entre 1 y 10
       
       System.out.println("Escribe un numero entre 1 y 10:");     
       
       // calcular su tabla de multiplicar del 1 hasta el 10.
       

       //Por ejemplo para el 1
       // 1x1=1
       // 1x2=2
       //....
       // 1x10=10

       //Por ejemplo para el 2
       // 2x1=2
       // 2x2=4
       //....
       // 2x10=20
       
       //Por ejemplo para el 3
       // 3x1=3
       // 3x2=6
       //....
       // 3x10=30
       
       for (int i=1; i<=10; i++) {
    	   
    	   System.out.println("---------------------------");
    	   System.out.println("| Tabla de multiplicar " + i+" |");
    	   System.out.println("---------------------------");
    	   
	       for (int j=1; j<=10 ; j++) {
	           
	           System.out.println(i+"x"+j+"="+ (i*j));
	       }
	       
	       System.out.println("**************************");
       
       }

   }

}