package polygons;

public class Rectangle extends Polygon {
	public Rectangle(int a, int b) {
		super(a, b, a, b);
	}
	
	public double area() {
		int a = this.sides.get(0);
		int b = this.sides.get(1);
		return a * b;
	}
}
