package iesjandula.unit4project.arraysdeobjetos.agregacion;

import java.util.Arrays;

public class AppClientes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cliente c1 = new Cliente("Jesus", "Soto", "123456");
		Cliente c2 = new Cliente("Pablo", "Martinez", "653421");
		
		Tienda t1 = new Tienda("Software J&P", "Calle falsa 123, Pais de la piruleta, provincia de la fantasia.");
		
		System.out.println( t1.hayCliente() );
		
		t1.addCliente(c1);
		t1.addCliente(c2);
		
		System.out.println(t1);
		
		t1.borrarCliente(c2);
		t1.addCliente(c2);
		
		System.out.println( t1.hayCliente() );
		
		
	}

}
