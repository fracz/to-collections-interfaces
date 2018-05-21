package polygons;

import java.util.Collections;
import java.util.Comparator;

public class Triangle extends Polygon {
	public Triangle(int a, int b, int c) {
		super(a, b, c);
		this.validateTriangleSides();
	}

	private void validateTriangleSides() {
		Collections.sort(this.sides, Comparator.naturalOrder());
		if (this.sides.get(2) >= this.sides.get(0) + this.sides.get(1)) {
			throw new IllegalArgumentException("Invalid sides of a triangle: " + this.sides);
		}
	}

	public double area() {
		int perimeter = this.perimeter();
		double p = perimeter / 2;
		int a = sides.get(0);
		int b = sides.get(1);
		int c = sides.get(2);
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}

}
