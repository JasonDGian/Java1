package unidad3.ejercicios.pruebasmias;

public class ObjetosPrueba {
	
	// Para hacer posible la creación de objetos en una misma clase donde se define el objeto, es necesaria
	// la precarga en memoria de la clase del objeto. Esto se consigue con el STATIC.
	
	public static class ObjetoZ {
		
		private int propiedadInt;
		private String propiedadString;
		
		
		public ObjetoZ() {}
		
		public ObjetoZ(int propiedad1, String propiedad2) {
			this.propiedadInt=propiedad1;
			this.propiedadString=propiedad2;
		}
		
		public void setPropiedadInt(int propiedad) {
			this.propiedadInt=propiedad;
		}
		
		public void setPropiedadString(String propiedad) {
			this.propiedadString=propiedad;
		}
		

		public int getPropiedadInt() {
			return this.propiedadInt;
		}
		
		public String getPropiedadString() {
			return this.propiedadString;
		}

		
		
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			ObjetoZ obje = new ObjetoZ(1, "Primero");
			ObjetoZ obje2 = new ObjetoZ(1, "Primero");
			
		// Este metodo solo compara el nombre del obejto.
		// Por eso aunque comparemos dos objetos de igual contenido nos dará false.
		System.out.println(obje.equals(obje2));
		
		System.out.println("hashcode de obje " + obje.hashCode());
		System.out.println("hashcode de obje2 " + obje2.hashCode());

		
		
		
		
		
		
	}

}
