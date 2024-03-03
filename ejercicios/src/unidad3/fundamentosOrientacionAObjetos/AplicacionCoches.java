package unidad3.fundamentosOrientacionAObjetos;

public class AplicacionCoches {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coche miTesla = new SUV("rojo", "Tesla", "Model S High	Performace", 50000, 30000);

		System.out.println(miTesla);

		Coche miBMWi = new CrossOver("azul", " BMW", "i5", 50000, 40000);

		System.out.println(miBMWi);

		miBMWi.repintar("blanco");

		System.out.println("MYBMW despues de repintar " + miBMWi);

		System.out.println("color Property access via Method " + miBMWi.getColor());

		System.out.println("beneficio de BMW despues de venta:" + miBMWi.beneficios(0.10));

		System.out.println("beneficio de Tesla después de venta:" + miTesla.beneficios(0.10));
		
		
		SUV miTeslaSUV = new SUV ("Azul", "Tesla", "Model E", 35000, 30000);
		
		System.out.println("Mi SUV " + miTeslaSUV);
		
		
		
		
		
		
	}
}
