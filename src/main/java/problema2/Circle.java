package problema2;

/**
 * Created by Feliu on 30/09/2015.
 */
public class Circle extends AbstractShape {
    private double radius;

    public Circle(double radius) {
        super("circle");
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}