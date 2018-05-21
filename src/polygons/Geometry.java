package polygons;

public class Geometry {
	public static void main(String... args) {
		Polygon square = new Square(5);
		System.out.println("Pole 5x5: " + square.area());
		System.out.println("Obwod 5x5: " + square.perimeter());
	
		Polygon triangle = new Triangle(5, 6, 7);
		System.out.println("Trojkat pole: " + triangle.area());
		
		// impossible triangle!
		new Triangle (2, 2, 22);
	}
}
