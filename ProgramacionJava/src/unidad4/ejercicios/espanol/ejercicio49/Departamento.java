package unidad4.ejercicios.espanol.ejercicio49;

import java.util.Arrays;

public class Departamento {

	private static final int MAX_MUNICIPIOS=20;
	private String nombre;
	private Municipio[] municipios;
	
	public Departamento() {}
	
	public Departamento ( String nombre, Municipio municipios ) {
		this.nombre=nombre;
		this.agregaMunicipio(municipios);
	}
	
	public Departamento ( String nombre, Municipio[] municipios ) {
		this.nombre=nombre;
		this.municipios=municipios;
	}
	
	private static int getMaxMunicipios() {
		return MAX_MUNICIPIOS;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}

	// Funcionales.
	public void agregaMunicipio(Municipio nombre) {

		// cuerpo que añade al listado de municpios un municpio.
		boolean ranuraObtenida = false;

		for (int i = 0; i < Departamento.getMaxMunicipios() && !ranuraObtenida; i++) {

			if (this.municipios[i] == null) {
				ranuraObtenida = true;
				this.municipios[i] = nombre;
			}

		}

	}
	
	public void eliminarMunicipio(String nombre) {
		
		// cuerpo de codigo que borra del listado de municipios del departamento el municipio alimentado.
		
		
		
		
	}
	
	public  buscarMunicipio(String municipio) {
		
	}
	
	public int calcularCensoPoblacionDepartamento() {
		int censo;
		return censo;
	}
	
	
	@Override
	public String toString() {
		return "Departamento [nombre=" + nombre + ", municipios=" + Arrays.toString(municipios) + "]";
	}
	
	
	
}
