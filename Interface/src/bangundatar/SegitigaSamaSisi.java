package bangundatar;

public class SegitigaSamaSisi extends Segitiga {
    public SegitigaSamaSisi(String name, double side) {
        super(name, side, side, side);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double calculateArea() {
        return (Math.sqrt(3) / 4) * side1 * side1;
    }

    @Override
    public double calculatePerimeter() {
        return 3 * side1;
    }
}
