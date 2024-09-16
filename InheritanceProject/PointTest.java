package InheritanceProject;

public class PointTest {
	
	public static void main(String[] args) {
		
		Point2D p1 = new Point2D(20,30);
         p1.showPoints();		
		Point3D p2 = new Point3D(20,30,40);
		 p2.showPoints();		

		
		
	}

}

class Point2D{ 
	
	 int x;
	 int y;
	public Point2D(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	 
	 void showPoints() {
		 System.out.println(" X  :"+ x + " Y: "+ y);
	 }
	
}

class Point3D extends Point2D{
	 int z;

	public Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
	 
	 void showPoints(){
		 super.showPoints();
			System.out.println(" z: "+z);

	 }
	
}
