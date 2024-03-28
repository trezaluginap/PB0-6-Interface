package bangundatar;

abstract public class Segitiga implements Shape {
    protected String name;
    protected double side1;
    protected double side2;
    protected double side3;

    public Segitiga(String name, double side1, double side2, double side3) {
        this.name = name;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public abstract String getName();
    public abstract double calculateArea();
    public abstract double calculatePerimeter(); 
}
