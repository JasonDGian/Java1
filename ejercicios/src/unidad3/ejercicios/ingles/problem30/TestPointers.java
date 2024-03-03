package unidad3.ejercicios.ingles.problem30;

public class TestPointers {
	
	public static void main(String[] args) {
		
		Point2D pointer2d = new Point2D(1.0f,2.1f);
		
		
		System.out.println(" X is ; " + pointer2d.getX() );
		System.out.println(" Y is ; " + pointer2d.getY() );
		
		System.out.println(" X and Y are ; " + pointer2d.getXY()[0] + ", "+ pointer2d.getXY()[1]);
		
		
		
		Point3D pointer3d = new Point3D(3.0f, 2.0f, 1.0f);
		
		
		pointer3d.setXYZ(1, 2, 3);
		pointer3d.setXY(2, 1);
		System.out.println(" X, Y and Z are ; " + pointer3d.getXYZ()[0]+ ", " + pointer3d.getXYZ()[1]+ ", " + pointer3d.getXYZ()[2]);
		
		pointer3d.setXY(4, 5);
		System.out.println(" X, Y and Z are ; " + pointer3d.getXYZ()[0]+ ", " + pointer3d.getXYZ()[1]+ ", " + pointer3d.getXYZ()[2]);

		System.out.println(pointer2d);
		System.out.println(pointer3d);

	}

}
