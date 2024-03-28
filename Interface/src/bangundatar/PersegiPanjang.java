package bangundatar;

public class PersegiPanjang implements Shape {
    private double length;
    private double width;
    private String name;

    public PersegiPanjang(String name, double length, double width) {
        this.length = length;
        this.width = width;
        this.name = name;
    }
    
    @Override
    public String getName() {
        return name;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}
