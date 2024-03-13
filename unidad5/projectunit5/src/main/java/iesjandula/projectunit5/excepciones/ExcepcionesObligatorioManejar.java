package iesjandula.projectunit5.excepciones;

public class ExcepcionesObligatorioManejar {
	public static void main(String[] args) {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {

			System.out.println("Se ha producido un error al dormir el hilo principal");
			e.printStackTrace();
		}
	}
}