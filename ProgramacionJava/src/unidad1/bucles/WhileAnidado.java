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
       
       num = sc.nextInt();
       // nos quedamos en el bucle hasta que el numero
       // sea un numero entre 1 y 10
       // porque las tablas de multiplicar las queremos entre 1 y 10
       while(num<1 || num >10) {
           System.out.println("Error. Debes escribir un numero entre 1 y 10:");
           
           num = sc.nextInt();
           
       }
       
       
       // calcular su tabla de multiplicar con el for
       
       //Por ejemplo para el 3
       // 3x1=3
       // 3x2=6
       //....
       // 3x10=30
       
       
       for (int i=1; i<=10 ; i++) {
           
           System.out.println(num+"x"+i+"="+ (num*i));
       }
       
       

   }

}