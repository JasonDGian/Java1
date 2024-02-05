package unidad3.ejercicios.espanol.ejercicioYogures;

public class YogurDesnatado extends Yogur{
	
	protected final double CALORIAS_DESNATADO = (CALORIAS/2);
	
	public YogurDesnatado(){
		super();
	}
	
	@Override
	public double getCalorias() {
		return CALORIAS_DESNATADO;
	}
	
	
}


