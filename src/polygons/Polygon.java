package polygons;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Polygon {
	protected List<Integer> sides = new ArrayList<>();

	public Polygon(Integer... sides) {
		this.validateSides(sides);
		this.sides = Arrays.asList(sides);
	}

	private void validateSides(Integer[] sides) {
		for (Integer side : sides) {
			if (side <= 0) {
				throw new IllegalArgumentException("Side cannot be less than 1, given: " + side);
			}
		}
	}

	public Integer perimeter() {
		int sum = 0;
		for (Integer side : sides) {
			sum += side;
		}
		return sum;
	}

	public abstract double area();
}
