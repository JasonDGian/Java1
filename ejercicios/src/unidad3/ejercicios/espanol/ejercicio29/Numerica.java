package unidad3.ejercicios.espanol.ejercicio29;

public abstract class Numerica {
	
	
	// este no hacerlo
	//public abstract boolean equals (Object ob): compara el objeto con el parámetro.
	
	//public abstract Numérica sumar(Numérica número): retorna la suma de los dos números.
	public abstract Numerica sumar (Numerica numero);
	
	//public abstract Numérica restar(Numérica número): retorna la resta de los dos números.
	public abstract Numerica restar(Numerica numero);
	
	//public abstract Numérica multiplicar(Numérica número): retorna la multiplicación de los dos números.
	public abstract Numerica multiplicar(Numerica numero);
	
	//public abstract Numérica dividir(Numérica número): retorna la división de los dos números.
	public abstract Numerica dividir(Numerica numero);
	
	//public abstract String toString(): convierte el número a String.
	@Override
	public abstract String toString();
	
	
	
}
