import java.util.Arrays;
import java.util.List;

public abstract class Polygon {
    protected final List<Integer> sides;

    public Polygon(Integer... sides) {
        this.sides = Arrays.asList(sides);
    }

    public Integer perimeter() {
        Integer sum = 0;
        for (Integer sideLength : sides) {
            sum += sideLength;
        }
        return sum;
    }

    public abstract double area();
}
