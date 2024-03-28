package bangunruang;
import bangundatar.Lingkaran;

public class Tabung implements Geometri {
    private String name;
    private double radius;
    private double height;
    private double phi = Geometri.phi;

    public Tabung(String name, double radius, double height) {
    this.name = name;
        this.radius = radius;
        this.height = height;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double calculateVolume() {
        double area = calculateLingkaranArea();
        return area * height;
    }

    @Override
    public double calculateSurfaceArea() {
        double area = calculateLingkaranArea();
        return (2 * phi * radius * height) + (2 * area);
    }

    private double calculateLingkaranArea() {
        Lingkaran lingkaran = new Lingkaran(null, radius);
        return lingkaran.calculateArea();
    }
}
