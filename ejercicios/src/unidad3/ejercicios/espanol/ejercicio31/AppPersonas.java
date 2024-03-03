package unidad3.ejercicios.espanol.ejercicio31;

public class AppPersonas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona p1 = new Persona("Jose","Antonio", 656376, 1956);
		Estudiante e1 = new Estudiante("Jesus", "Soto Sanchez", 61665, 2004, 12);
		Profesor pr1 = new Profesor("Carlos", "Ladera Cano", 767879, 1985, "2");
		
		System.out.println(e1.identificate());
		System.out.println(p1.identificate());
		System.out.println(pr1.identificate());
		
		p1.setDireccion("Empreador","Adriano" , "2370", "España");
		System.out.println(p1.getDireccion());
	
		System.out.println(p1.getDireccion().getCalle());

	}

}
