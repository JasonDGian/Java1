package unidad3.enumerados;

public enum EnumCoches {
	
	ELECTRICO(1, "Motor eléctrico", "SEV"), 
	DIESEL (2, "Motor Diesel", "DV"), 
	GAS(3, "Motor de gas", "GV"), 
	HIDROGENO(4, "Motor de hidrógeno", "HEV");
	
	// Atributos
	private int ID;
	private String tipoMotor;
	private String tipoVehiculo;
	
	// Constructor -> Este constructor solo se ejecuta una vez se llamen los enumerados. No es invocable.
	EnumCoches (int numero, String tipoMotor, String siglas){
		this.ID=numero;
		this.tipoMotor=tipoMotor;
		this.tipoVehiculo=siglas;
	}
	
	// Getters
	public int getNumero() {
		return this.ID;
	}
	
	public String getTipoMotor() {
		return this.tipoMotor;
	}
	
	public String getSiglas() {
		return this.tipoVehiculo;
	}

}
