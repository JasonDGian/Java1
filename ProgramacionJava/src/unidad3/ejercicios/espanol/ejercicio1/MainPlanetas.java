package unidad3.ejercicios.espanol.ejercicio1;

import ejercicios.espanol.ejercicio1.Planeta.TipoPlaneta;

public class MainPlanetas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Planeta Venus = new Planeta("Venus", 0, (4.8673*(Math.pow(10, 24))), 92841534, 39541578, 108000000, TipoPlaneta.ENANO, true, (float)(224.65/365), 243);


		System.out.println(	Venus.calcularDensidad());
		System.out.println(	Venus.getDistanciaSolMedia());
		System.out.println(	Venus.getVolumenKm3());
		
		System.out.println(Venus);

	}

}


