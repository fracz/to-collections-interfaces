import java.util.ArrayList;
import java.util.List;

public class Geometry {
    public static void main(String... args) {
        List<Polygon> polygons = new ArrayList<Polygon>();
        polygons.add(new Triangle(5, 7, 8));
        polygons.add(new Rectangle(4, 6));
        polygons.add(new Square(5));

        for (Polygon polygon : polygons) {
            System.out.println("Perimeter: " + polygon.perimeter() +
                    ", Area: " + polygon.area());
        }
    }
}
