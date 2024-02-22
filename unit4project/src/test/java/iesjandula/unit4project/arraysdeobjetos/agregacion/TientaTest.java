package iesjandula.unit4project.arraysdeobjetos.agregacion;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TientaTest {

	private Cliente mockCliente;
	private Tienda mockTienda;
	
	@BeforeEach
	// tambien podemos llamarlo 'bootstrapping'
	void setup(){
		mockCliente = new Cliente("Jesus", "Soto", "123456");
		mockTienda= new Tienda("Software J&P", "Calle falsa 123, Pais de la piruleta, provincia de la fantasia.");
	}
	

	
	/*
	@Test
	void addClienteTest() {
		
		mockTienda.addCliente(mockCliente);
		
		Cliente[] array = mockTienda.getClientes();
		// parallel hace uso de los demas nucleos del procesador.
		
		// el parallel sort da error en este caso porque los array con nulos no se pueden comparar.
		Arrays.parallelSort(array);
		// Para el binary Search es necesario antes ordenar el array.
		assertTrue(Arrays.binarySearch(array, mockCliente)>=0);
		
		//una manera de resolver el problema de los objetos nulos en el array, es crear un cliente que funja de placeholder.
		
		//hacemos un assertTrue(); porque el binary search devuelve el indice donde encuentra el objeto
		// y en caso de no encontrar nada devolverá -1.
		
		assertTrue(buscarElmArray(array, mockCliente));
		
	}*/
	
	
	@Test
	void borrarClienteTest() {

		// Añadimos un cliente a la tienda.
		mockTienda.addCliente(mockCliente);

		mockTienda.borrarCliente(mockCliente);

		// Para cada elemento cliente en el array de clientes.
		for (Cliente cliente : mockTienda.getClientes()) {
			// afirma que ninguno de esos elementos cliente equivalen al cliente borrado.
			assertNotEquals(cliente, mockCliente);

		}

	}
	
	@Test 
	void hayClienteTest(){
		
		assertFalse(mockTienda.hayCliente());
		
		
		mockTienda.addCliente(mockCliente);
				
		assertTrue(mockTienda.hayCliente());
		
		mockTienda.borrarCliente(mockCliente);
		
		assertFalse(mockTienda.hayCliente());
		
	}
	

	

	/*
	private boolean buscarElmArray(Cliente[] clientes, Cliente cliente) {

		boolean encontrado = false;

		for (int i = 0; i < clientes.length && !encontrado; i++) {

			if (cliente.equals(clientes[i])) {

				encontrado = true;
			}

		}

		return encontrado;
	}*/

}
