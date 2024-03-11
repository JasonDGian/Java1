package unidad4.ejercicios.espanol.ejercicio44a;

import java.util.Comparator;

public class AppNotas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Nota n1= new NotaMarcada(0,"Conjunción",40,"Amarillo");
		
		Nota n2= new NotaAlarma(1,"Adelantar reloj",60,"10:20");
		
		BlocNotas bloq = new BlocNotas();
		
		bloq.addNota(n1);
		bloq.addNota(n2);
		
		Nota n3= bloq.buscarNotaPorId(0);
		
		System.out.println(n3);
		
	    Nota[] notas = {n2,n3};
	    
	    bloq.eliminarNota(n1);
	    bloq.eliminarNota(n2);
	    
	    bloq.listarNotas();
	    
	    
	    bloq.addNotas(notas);
	    
	    bloq.listarNotas();
	    
	    
	    bloq.ordenarNotas();

		bloq.ordenarNotas(new Comparator<Nota>() {

			@Override
			public int compare(Nota o1, Nota o2) {
				int res = 0;
				if (o1 == null) {
					res = -1;
				} else if (o2 == null) {
					res = 1;
				}

				else {
					res = (o1.getId()) - (o2.getId());
				}

				return res;
			}

		});

		bloq.ordenarNotas((o1, o2) -> {

			int res = 0;
			if (o1 == null) {
				res = -1;
			} else if (o2 == null) {
				res = 1;
			}

			else {
				res = (o1.getId()) - (o2.getId());
			}

			return res;
		}

		);
	    
	    
	    
	    // con clase anonima.
	    System.out.println("------------------");
	    bloq.devuelveNotasOrdenado( new Comparator<Nota>() {

				@Override
				public int compare(Nota o1, Nota o2) {
					return o1.getId()- o2.getId();
				}
	
	    	}
	    );
	    // con lambda
	    bloq.devuelveNotasOrdenado( (o1, o2) -> o1.getLineaTexto().compareTo(o2.getLineaTexto()) );
	    
	}
}
