package bangunruang;
import bangundatar.Lingkaran;

public class Bola implements Geometri {
    private String name;
    private double radius;

    public Bola(String name, double radius) {
        this.name = name;
        this.radius = radius;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double calculateSurfaceArea() {
        double area = calculateLingkaranArea();
        return (4.0 / 3.0) * area * area;   
    }

    @Override
    public double calculateVolume() {
        double area = calculateLingkaranArea();
        return 4 * area;
    }

    private double calculateLingkaranArea() {
        Lingkaran lingkaran = new Lingkaran(null,radius);
        return lingkaran.calculateArea();
    }
}
