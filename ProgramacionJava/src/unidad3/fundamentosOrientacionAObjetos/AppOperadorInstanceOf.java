package unidad3.fundamentosOrientacionAObjetos;

public class AppOperadorInstanceOf {
	public static void main(String[] args) {
// TODO Auto-generated method stub
		Coche miTesla = new SUV("rojo", "Tesla", "Model S High Performace", 50000, 30000);
		Coche miBMWi = new Sedan("azul", " BMW", "i5", 50000, 40000, 4);
		if (miTesla instanceof SUV) {
			System.out.println("Mi coche miTesla es un SUV");
		}

		if (miTesla instanceof Sedan) {
			System.out.println("Mi coche miTesla es un Sedan");
		} else {
			System.out.println("Mi coche miTesla no es un Sedan");
			if (miTesla instanceof Coche) {
				System.out.println("Mi tesla es un coche");
			}
		}
	}
}
