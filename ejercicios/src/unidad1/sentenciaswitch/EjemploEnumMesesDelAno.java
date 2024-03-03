package unidad1.sentenciaswitch;

	
	
	// A Java program to demonstrate working on enum
	// in switch case (Filename Test. Java)
	import java.util.Scanner;
	  
	// An Enum class
	enum Mes
	{
	    ENERO, FEBRERO, MARZO, ABRIL, MAYO, JUNIO,
	    JULIO, AGOSTO, SEPTIEMBRE, OCTUBRE, NOVIEMBRE, DICIEMBRE;
	}
	  
	// Driver class that contains an object of "day" and
	// main().

public class EjemploEnumMesesDelAno {
	
	    private Mes mes;
	  
	    // Constructor
	    public EjemploEnumMesesDelAno(Mes mes)
	    {
	        this.mes = mes;
	    }
	    
	    public Mes getMes() {
	    	
	    	return this.mes;
	    	
	    }
	  
	    // Prints a line about Day using switch
	    public void elDiaEs()
	    {
	        switch (mes)
	        {
	        case DICIEMBRE,ENERO,FEBRERO:
	            System.out.println("Frio, a veces lluvioso a veces nevado.");
	            break;
	        case MARZO, ABRIL, MAYO:
	            System.out.println("La primavera ha llegado, mejor tiempo.");
	            break;
	        case JUNIO, JULIO, AGOSTO:
	        	
	        	System.out.println("Tiempo de verano, vacaciones para disfrutar de un tiempo humedo y caluroso.");
            break;
	        case SEPTIEMBRE, OCTUBRE, NOVIEMBRE:
	            System.out.println("Buen tiempo para actividades f�sicas hasta noviembre.");
	            break;
	        default:
	            System.out.println("Te has olvidado algún mes?");
	            break;
	        }
	    }
	  
	    // Driver method
	    public static void main(String[] args)
	    {
	        String str = "JUNIO";
	        EjemploEnumMesesDelAno t1 = new EjemploEnumMesesDelAno(Mes.valueOf(str));
	        System.out.println("Como es el tiempo en  " +t1.getMes() + "?");
	        t1.elDiaEs();
	    }
	}
