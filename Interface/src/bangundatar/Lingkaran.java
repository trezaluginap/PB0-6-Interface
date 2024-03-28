package bangundatar;

public class Lingkaran implements Shape {
    private double phi = Shape.phi;
    private double radius;
    private String name;

    public Lingkaran(String name, double radius) {
        this.radius = radius;
        this.name = name;
    }
    
    @Override
    public String getName() {
        return name;
    }
    
    @Override
    public double calculateArea() {
        return phi * (radius * radius);
    }

    @Override
    public double calculatePerimeter() {
        return 2 * phi * radius;
    }
    
}
