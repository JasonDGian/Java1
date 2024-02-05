package unidad3.ejercicios.ingles.problem28;
public class CylinderComposition {

   private double height = 0.0;
   private Circle circle= null;

   public CylinderComposition() {
       
       circle = new Circle();
       
       
   }

   public CylinderComposition(double radius) {
       
       circle = new Circle(radius);


   }

   public CylinderComposition(double radius, double height) {

       circle = new Circle(radius);
       this.height = height;
   }

   public CylinderComposition(double radius, double height, String color) {

       circle = new Circle(radius, color);
       this.height = height;
   }

   public double getHeight() {
       return height;
   }

   public void setHeight(double height) {
       this.height = height;
   }
   
   
   public double getArea() {

       return 2 * Math.PI * circle.getRadius() * this.height + 2 * Math.PI * Math.pow(circle.getRadius(), 2);
   }

   public double getVolume() {

       return circle.getArea()*this.height;

   }

}