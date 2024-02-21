package ejercicios.espanol.ejercicio49;

import java.util.Arrays;

public class Departamento {

	private static final int MAX_MUNICIPIOS = 10;
	private String nombre;
	private Municipio[] municipios;

	public Departamento() {
	}

	public Departamento(String nombre) {
		this.nombre = nombre;
		this.municipios = new Municipio[MAX_MUNICIPIOS];
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	// Funcionales.
	public void agregaMunicipio(Municipio municipio) {

		// cuerpo que añade al listado de municpios un municpio.
		boolean ranuraObtenida = false;
		int indice = 0;

		// Loop que busca la ranura para insertar el objetop municipio.
		while (indice < municipios.length && !ranuraObtenida) {

			if (this.municipios[indice] == null) {
				ranuraObtenida = true;
			} else {
				indice++;
			}
		}
		// if que rellena la ranura.
		if (ranuraObtenida) {
			this.municipios[indice] = municipio;
		}

	}

	public void eliminarMunicipio(String nombre) {

		boolean encontrado = false;

		// cuerpo de codigo que borra del listado de municipios del departamento el
		// municipio alimentado.
		for (int i = 0; i < MAX_MUNICIPIOS && !encontrado; i++) {

			if (this.municipios[i].getNombre().equals(nombre)) {
				encontrado = true;
				this.municipios[i] = null;
			}

		}
	}

	// recibe una string de nombre para la busqueda.
	public void buscarMunicipio(String nombre) {

		// por default encontrado está en false.
		boolean encontrado = false;
		// creamos un control de indice.
		int indice = 0;

		// mientras que el indice esté por debajo el numero maximo de municipios
		// Y ademas no se haya encontrado aun el municipio.
		while (indice < MAX_MUNICIPIOS && !encontrado) {

			// se testea si el municipio de indice actual, su nombre, equivale al parametro.
			// si no ponemos "not null" da problema de "java null pointer".
			if (this.municipios[indice] != null && this.municipios[indice].getNombre().equals(nombre)) {
				encontrado = true;
			}

			else {
				indice++;
			}

		}

		if (encontrado) {
			System.out.println(this.municipios[indice].toString());
		}

		else {
			System.out.println("Municipio no encontrado en este departamento");
		}

	}

	public int calcularCensoPoblacionDepartamento() {

		int censoDepartamento = 0;

		for (Municipio municipio : this.municipios) {
			if (municipio != null) {
				censoDepartamento = censoDepartamento + municipio.getPoblacion();
			}

		}

		return censoDepartamento;
	}
	
	public void buscarMunicipioConPoblacionMayor(int poblacion) {
		// introduce una cantidad de poblacion y devuelve /
		// los municpios que tengan una poblacion equivalente o superio.
		
		String municipiosResultado="";
		boolean hayMunicipios = false;
		
		for ( int i = 0 ; i < this.municipios.length ; i++) {
			
			if ( this.municipios[i] != null && this.municipios[i].getPoblacion() >= poblacion ) {
				
				municipiosResultado = municipiosResultado + " "+ this.municipios[i].getNombre() + " ";
				hayMunicipios=true;
			}
				
		}
		
		if (hayMunicipios) {
			System.out.println(municipiosResultado);
		}
		
		else {
			System.out.println("No se han encontrado municipios con población superior a " + poblacion + " en este departamento.");
		}
		
	}

	@Override
	public String toString() {
		return "Departamento [nombre=" + nombre + ", municipios=" + Arrays.toString(municipios) + "]";
	}

}
