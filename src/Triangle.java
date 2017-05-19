public class Triangle extends Polygon {

    public Triangle(Integer a, Integer b, Integer c) {
        super(a, b, c);
    }

    // http://www.mathopenref.com/heronsformula.html
    public double area() {
        double p = this.perimeter() / 2;
        return Math.sqrt(p * (p - sides.get(0)) * (p - sides.get(1)) * (p - sides.get(2)));
    }
}
