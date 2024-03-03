package unidad3.enumerados;

public class AppEnumerados {

   public static void main(String args[]) {

       EnumeradoComplejoEstudiante studentType1 = EnumeradoComplejoEstudiante.EXCHANGE_STUDENT;
       EnumeradoComplejoEstudiante studentType2 = EnumeradoComplejoEstudiante.STATE_STUDENT;

       EnumeradoComplejoEstudiante studentType3 = EnumeradoComplejoEstudiante.valueOf("NATIONAL_STUDENT");

       System.out.println("Propiedades para el estudiante " + studentType1 + " are: ");
       System.out.println("Descripción: " + studentType1.getDescription() +

               " Id: " + studentType1.getId() + " Name: " + studentType1.getNameStudent());

       System.out.println("Ordinal para el estudiante " + studentType3 + " " + studentType3.ordinal());

   }

}