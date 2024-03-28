package bangundatar;

public class SegitigaSembarang extends Segitiga {
    public SegitigaSembarang(String name, double side1, double side2, double side3) {
        super(name, side1, side2, side3);
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
        return side1 + side2 + side3;
    }
}
