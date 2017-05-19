## `Rectangle.java`

```java
public class Rectangle extends Polygon {

    public Rectangle(Integer a, Integer b) {
        super(a, b, a, b);
    }

    public double area() {
        return this.sides.get(0) * this.sides.get(1);
    }
}
```
