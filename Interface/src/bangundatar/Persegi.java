package bangundatar;

public class Persegi implements Shape {
    private double side;
    private String name;

    public Persegi(String name, double side) {
        this.side = side;
        this.name = name;
    }
    
    @Override
    public String getName() {
        return name;
    }
    
    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public double calculatePerimeter() {
        return side * 4;
    }

}
