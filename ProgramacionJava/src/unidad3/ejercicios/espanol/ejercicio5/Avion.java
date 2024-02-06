package unidad3.ejercicios.espanol.ejercicio5;

public class Avion {
	
	// Atributos
	private String fabricante;
	private int numeroMotores;
	
	public Avion() {}
	
	public Avion(String fabricante, int numeroMotores) {
		this.fabricante = fabricante;
		this.numeroMotores = numeroMotores;
	}


	public int getNumeroMotores() {
		return numeroMotores;
	}


	public void setNumeroMotores(int numeroMotores) {
		this.numeroMotores = numeroMotores;
	}
	
	public String getFabricante() {
		return this.fabricante;
	}
	
	public void setFabricante(String fabricante) {
		this.fabricante=fabricante;
	}
	
	// Functionals
	public String imprimirFabricante() {
		return this.fabricante;
	}
	
	public void cambiarFabricante(Avion avion) {
		avion.setFabricante("Loockhead");
	}

	@Override
	public String toString() {
		return "Avion [fabricante=" + fabricante + ", numeroMotores=" + numeroMotores + "]";
	}
	



	
	
	
	
}
