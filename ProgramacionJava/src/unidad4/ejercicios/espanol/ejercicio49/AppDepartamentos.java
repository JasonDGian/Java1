package unidad4.ejercicios.espanol.ejercicio49;

public class AppDepartamentos {
	
	public static void main(String[] args) {
		
		Municipio ayamonte= new Municipio("Ayamonte",21725,18.5,63);
		Municipio huelva= new Municipio("Huelva",530824,18.6,54);
		Municipio martorell= new Municipio("Martorell",28760,28,56);
		
		
		
		Departamento catalan = new Departamento("Barcelona", martorell);
		
		System.out.println(catalan);
		
		
		
		
	}
	

}
