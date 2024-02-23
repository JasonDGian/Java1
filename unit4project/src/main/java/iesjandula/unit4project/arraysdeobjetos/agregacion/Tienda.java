package iesjandula.unit4project.arraysdeobjetos.agregacion;

public class Tienda {

	private static final int CLIENTE_MAX = 200;
	private static final Cliente clienteNull = new Cliente("Cliente", "Mock", "zzzzzzzzzz");
	

	private String nombre;
	private String direccion;
	private Cliente[] clientes;
	private int contClientes = 0;

	public Tienda(String nombre, String direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.clientes = new Cliente[CLIENTE_MAX]; // primero incializamos el array de clientes.
		rellenaClientesNull(); // luego lo rellenamos con clientes vacios.
		this.contClientes++;
	}
	
	// hacer buscar cliente por dni y testearlo.
	
	// crear este constructor con un parser para el arrayclientes. teestear
	public Tienda(String nombre, String direccion, Cliente[] arrayClientes) {
		
		this(nombre, direccion);
		this.parsearClientes(arrayClientes);
		
	}
	
	
	// Metodo privado para parsear clientes del constructor.
	private void parsearClientes( Cliente[] arrayClientes) {
		for (Cliente clienteX : arrayClientes) {
			this.addCliente(clienteX);			
		}
	}

	// GETTERS Y SETTERS.

	public String getNombre() {
		return nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	// rellena un array resultado con clientes reales.
	public Cliente[] getClientes() {

		Cliente[] arrayClientesReales = new Cliente[contClientes];
		int cont = 0;

		for (Cliente cliente : clientes) {

			if (cliente.compareTo(clienteNull) != 0) {
				arrayClientesReales[cont] = cliente;
				cont++;
			}
		}

		return arrayClientesReales;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public boolean addCliente(Cliente cl) {
		int cont = 0;
		boolean hayHueco = false;
		while (cont < this.clientes.length && !hayHueco) {
			if (clientes[cont].compareTo(clienteNull) == 0) {
				hayHueco = true;
			} else {
				cont++;
			}
		}
		if (hayHueco) {
			clientes[cont] = cl;
			this.contClientes++;
		}
		return hayHueco;
	}

	public boolean borrarCliente(Cliente cl) {
		boolean encontrado = false;
		for (int i = 0; i < CLIENTE_MAX && !encontrado; i++) {
			if (clientes[i].equals(cl)) {
				encontrado = true;
				clientes[i] = clienteNull;
				this.contClientes--;
			}
		}
		return encontrado;
	}

	// rellena array con cliente.
	private void rellenaClientesNull() {

		for (int i = 0; i < CLIENTE_MAX; i++) {
			this.clientes[i] = clienteNull;

		}

	}

	public boolean hayCliente() {
		
		//return this.contClientes>0;
	
		if (this.contClientes > 0) { return true;}
		else { return false;}
	}
	


	
	
	
	
}