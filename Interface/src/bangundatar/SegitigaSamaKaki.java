package bangundatar;

public class SegitigaSamaKaki extends Segitiga{
    public SegitigaSamaKaki(String name, double base, double side) {
        super(name, base, side, side);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double calculateArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public double calculatePerimeter() {
        return side1 + 2 * side2;
    }
}
