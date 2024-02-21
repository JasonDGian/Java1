package ejercicios.espanol.ejercicio49;

public class AppDepartamentos {

	public static void main(String[] args) {

		Municipio ayamonte = new Municipio("Ayamonte", 21725, 18.5, 63);
		Municipio huelva = new Municipio("Huelva", 530824, 18.6, 54);
		Municipio martorell = new Municipio("Martorell", 28760, 28, 56);

		Departamento catalan = new Departamento("Barcelona");

		catalan.agregaMunicipio(martorell);
		catalan.agregaMunicipio(huelva);
		catalan.agregaMunicipio(ayamonte);

		System.out.println(catalan);
		
		catalan.buscarMunicipioConPoblacionMayor(530820);
		
		catalan.buscarMunicipioConPoblacionMayor(21726);

		// este lo encuentra
		catalan.buscarMunicipio("Ayamonte");

		// este lo borra
		catalan.eliminarMunicipio("Ayamonte");

		// este devuelve mensaje no encontrado
		catalan.buscarMunicipio("Ayamonte");

		System.out.println("En el departamento " + catalan.getNombre() + " hay habitantes: "
				+ catalan.calcularCensoPoblacionDepartamento());


		
		
	}

}
