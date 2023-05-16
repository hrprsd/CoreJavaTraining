
public class ConstructorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Point pointoObj1 = new Point(10,20);
		Point pointoObj2 = new Point(100,200);
		Point pointoObj3 = new Point(300,400);
		
		System.out.println("pointoObj1 : "+pointoObj1);
		System.out.println("pointoObj2 : "+pointoObj2);
		System.out.println("pointoObj3 : "+pointoObj3);
		
		Point3D p3d1 = new Point3D(10, 20, 30);
		Point3D p3d2 = new Point3D(50, 30, 90);
		Point3D p3d3 = new Point3D(90, 60, 80);
		
		System.out.println("p3d1 : "+p3d1);
		System.out.println("p3d2 : "+p3d2);
		System.out.println("p3d3 : "+p3d3);
		
		ColouredPoint3D cp3d1 = new ColouredPoint3D(10, 20, 30,"Yellow");
		System.out.println("cp3d1 : "+cp3d1);
	}

}
class Point
{
	private int x;
	private int y;
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	
}

class Point3D extends Point
{
	private int z;

	public Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}

	@Override
	public String toString() {
		return "Point3D [toString()=" + super.toString() + ", z=" + z + "]";
	}
	
	
}

class ColouredPoint3D extends Point3D
{
	private String color;

	public ColouredPoint3D(int x, int y, int z, String color) {
		super(x, y, z);
		this.color = color;
	}

	@Override
	public String toString() {
		return "ColouredPoint3D [toString()=" + super.toString() + ", color=" + color + "]";
	}
	
	
}