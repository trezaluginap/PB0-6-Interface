package bangundatar;

public class SegitigaSikuSiku extends Segitiga {
    public SegitigaSikuSiku(String name, double base, double height) {
        super(name, base, height, Math.sqrt(base * base + height * height));
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double calculateArea() {
        return 0.5 * side1 * side2;
    }

    @Override
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }
}
