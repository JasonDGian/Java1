package unidad3.ejercicios.espanol.ejercicio1;

public class Planeta {
	
	// Enums
	
	enum TipoPlaneta {
		GASEOSO,
		TERRESTRE,
		ENANO;
	}
	
	// Static attributes
	
	// Static Block
	
	// Atributes
	
	private String nombre=null;
	private int cantidadSatelites=0;
	private double masaKg=0;
	private long volumenKm3=0;
	private long diametro=0;
	private double distanciaSolMedia=0;
	private TipoPlaneta tipo;
	private boolean observable=false;
	private float periodoOrbital;
	private float periodoRotacion;
	

	
	// Constructors
	public Planeta() {
		
	}
	
	public Planeta(String nombre, int cantidadSatelites, double masaKg, long volumenKm3, long diametro,
			double distanciaSolMedia, TipoPlaneta tipo, boolean observable, float periodoOrbital, float periodoRotacion) {
		super();
		this.nombre = nombre;
		this.cantidadSatelites = cantidadSatelites;
		this.masaKg = masaKg;
		this.volumenKm3 = volumenKm3;
		this.diametro = diametro;
		this.distanciaSolMedia = distanciaSolMedia;
		this.tipo = tipo;
		this.observable = observable;
		this.periodoOrbital=periodoOrbital;
		this.periodoRotacion=periodoRotacion;
	}

	// Static & Final Methods
	
	// Getters
	public String getNombre() {
		return nombre;
	}

	public int getCantidadSatelites() {
		return cantidadSatelites;
	}

	public double getMasaKg() {
		return masaKg;
	}

	public double getVolumenKm3() {
		return volumenKm3;
	}

	public long getDiametro() {
		return diametro;
	}

	public double getDistanciaSolMedia() {
		return distanciaSolMedia;
	}

	public TipoPlaneta getTipo() {
		return tipo;
	}

	public boolean isObservable() {
		return observable;
	}
	
	// Setters
	
	// Functionals
	public double calcularDensidad() {
		return (this.getMasaKg()/this.getVolumenKm3());
	}
	
	public String planetaPosicion() {
		
		if (this.getDistanciaSolMedia()>508632758) {
			return "Planeta exterior";
		}
		
		else {return "Planeta interior"; }
		
	}

	
	@Override
	public String toString() {
		return "Planeta [nombre=" + nombre + ", cantidadSatelites=" + cantidadSatelites + ", masaKg=" + masaKg
				+ ", volumenKm3=" + volumenKm3 + ", diametro=" + diametro + ", distanciaSolMedia=" + distanciaSolMedia
				+ ", tipo=" + tipo + ", observable=" + observable + ", periodoOrbital=" + periodoOrbital
				+ ", periodoRotacion=" + periodoRotacion + "]";
	}
	
	
	
	
	
	
	


}
