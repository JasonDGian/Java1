package unidad3.ejercicios.espanol.ejercicio9;

public class AppAtletas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Atleta julio = new Atleta("Julio", 2.11);
		System.out.println(julio.getNumAtletas());
		Atleta fernan = new Atleta("Fernan", 3.21);
		System.out.println(julio.getNumAtletas());
		Atleta carlos = new Atleta("Carlos", 1.31);
		System.out.println(julio.getNumAtletas());


		
		julio.tiempoEquipo();
	
		julio.correr400Metros();
		
		julio.tiempoEquipo();

		fernan.correr400Metros();
		
		fernan.tiempoEquipo();
		
		carlos.correr400Metros();
		
		carlos.tiempoEquipo();

		julio.seleccion();
				

		System.out.println(julio);
		System.out.println(fernan);
		System.out.println(carlos);

		
	}

}
