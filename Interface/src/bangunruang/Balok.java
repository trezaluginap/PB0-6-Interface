package bangunruang;
import bangundatar.PersegiPanjang;

public class Balok implements Geometri{
    private String name;
    private double length;
    private double width;
    private double height;

    public Balok(String name, double length, double width, double height) {
        this.name = name;
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double calculateVolume() {
        double area = calculatePersegiPanjangArea(length, width);
        return area * height;
    }

    @Override
    public double calculateSurfaceArea() {
        double area = calculatePersegiPanjangArea(length, width);
        double topAndBottomArea = 2 *  area;

        double area1 = calculatePersegiPanjangArea(length, height);
        double area2 = calculatePersegiPanjangArea(width, height);

        double sideArea = 2 * (area1 + area2);

        return topAndBottomArea + sideArea;
    }

    private double calculatePersegiPanjangArea(double side1, double side2) {
        PersegiPanjang persegiPanjang = new PersegiPanjang(null,side1, side2);
        return persegiPanjang.calculateArea();   
    }
}
