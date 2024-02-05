package unidad3.fundamentosOrientacionAObjetos;
public abstract class Coche {
   

   private static int numCoches=0;
   
   //atributos
   private String color;
   private String marca;
   private String modelo;
   private double precio;
   private double coste;  

   //MAL HECHO ATRIBUTOS PUBLICOS NO
   //public String publica;
   
   //constructores
   
   public Coche() {
       

       numCoches++;
       
       System.out.println("Numero de coches creados: " + Coche.numCoches);
               
   }
   
   public Coche(String color, String marca,String modelo, double precio, double coste) {
       
       this();
       this.color=color;
       this.marca=marca;
       this.modelo=modelo;
       this.precio=precio;
       this.coste=coste;
   }
   
   // Despues de los constructores antes que nada los abstractos. 
   public abstract String getTipoCoche();
   
   public String getColor() {
       return color;
   }

   public String getMarca() {
       return marca;
   }

   public String getModelo() {
       return modelo;
   }

   public double getPrecio() {
       return precio;
   }

   public double getCoste() {
       return coste;
   }

   public void setColor(String color) {
       this.color = color;
   }

   public void setMarca(String marca) {
       this.marca = marca;
   }

   public void setModelo(String modelo) {
       this.modelo = modelo;
   }

   public void setPrecio(double precio) {
       this.precio = precio;
   }

   public void setCoste(double coste) {
       this.coste = coste;
   }

   public void repintar(String color) {
       
       this.color=color;
       
       
   }
   
   public static int numCoches() {
       
       
       return numCoches;
   }
   
   
   
   // metodos funcionales
   
   
   
   public double beneficios(double iva) {
	   return (precio-coste) -impuestos(iva);
	   }
   
   private double impuestos( double iva) {
	   return (precio-coste)* iva;
	   }
   
   

   @Override
   public String toString() {
       return "Coche [color=" + color + ", marca=" + marca + ", modelo=" + modelo + ", precio=" + precio + ", coste="
               + coste + "]";
   }
   
}