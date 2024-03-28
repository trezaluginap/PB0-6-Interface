package bangunruang;
import bangundatar.Persegi;

public class Kubus implements Geometri {
    private String name;
    private double side;

    public Kubus(String name, double side) {
        this.name = name;
        this.side = side;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double calculateVolume() {
        double area = calculatePersegiArea();
        return area * area;
    }

    @Override
    public double calculateSurfaceArea() {
        double area = calculatePersegiArea();
        return 6 * area;
    }

    private double calculatePersegiArea() {
        Persegi persegi = new Persegi(null, side);
        return persegi.calculateArea();
    }
}
