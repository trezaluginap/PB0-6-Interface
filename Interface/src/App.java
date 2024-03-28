import bangundatar.*;
import bangunruang.*;

public class App {
    public static void main(String[] args) {
        Lingkaran lingkaran = new Lingkaran("Lingkaran", 10);
        System.out.println("Nama Bentuk: " + lingkaran.getName());
        System.out.println("Luas Lingkaran: " + lingkaran.calculateArea());
        System.out.println("Keliling Lingkaran: " + lingkaran.calculatePerimeter());

        System.out.println();

        Persegi persegi = new Persegi("Persegi", 10);
        System.out.println("Nama Bentuk: " + persegi.getName());
        System.out.println("Luas Persegi: " + persegi.calculateArea());
        System.out.println("Keliling Persegi: " + persegi.calculatePerimeter());

        System.out.println();

        PersegiPanjang persegiPanjang = new PersegiPanjang("Persegi Panjang", 10, 5);
        System.out.println("Nama Bentuk: " + persegiPanjang.getName());
        System.out.println("Luas Persegi Panjang: " + persegiPanjang.calculateArea());
        System.out.println("Keliling Persegi Panjang: " + persegiPanjang.calculatePerimeter());

        System.out.println();

        SegitigaSamaKaki segitigaSamaKaki = new SegitigaSamaKaki("Segitiga Sama Kaki", 10, 12);
        System.out.println("Nama Bentuk: " + segitigaSamaKaki.getName());
        System.out.println("Luas Segitiga Sama Kaki: " + segitigaSamaKaki.calculateArea());
        System.out.println("Keliling Segitiga Sama Kaki: " + segitigaSamaKaki.calculatePerimeter());

        System.out.println();

        SegitigaSamaSisi segitigaSamaSisi = new SegitigaSamaSisi("Segitiga Sama Sisi", 10);
        System.out.println("Nama Bentuk: " + segitigaSamaSisi.getName());
        System.out.println("Luas Segitiga Sama Sisi: " + segitigaSamaSisi.calculateArea());
        System.out.println("Keliling Segitiga Sama Sisi: " + segitigaSamaSisi.calculatePerimeter());

        System.out.println();

        SegitigaSikuSiku segitigaSikuSiku = new SegitigaSikuSiku("Segitiga Siku Siku", 10, 10);
        System.out.println("Nama Bentuk: " + segitigaSikuSiku.getName());
        System.out.println("Luas Segitiga Siku Siku: " + segitigaSikuSiku.calculateArea());
        System.out.println("Keliling Segitiga Siku Siku: " + segitigaSikuSiku.calculatePerimeter());

        System.out.println();

        SegitigaSembarang segitigaSembarang = new SegitigaSembarang("Segitiga Sembarang", 10, 12, 15);
        System.out.println("Nama Bentuk: " + segitigaSembarang.getName());
        System.out.println("Luas Segitiga Sembarang: " + segitigaSembarang.calculateArea());
        System.out.println("Keliling Segitiga Sembarang: " + segitigaSembarang.calculatePerimeter());

        System.out.println();

        Kubus kubus = new Kubus("Kubus", 10);
        System.out.println("Nama Bentuk: " + kubus.getName());
        System.out.println("Volume Kubus: " + kubus.calculateVolume());
        System.out.println("Luas Permukaan Kubus: " + kubus.calculateSurfaceArea());

        System.out.println();

        Balok balok = new Balok("Balok", 10, 12, 10);
        System.out.println("Nama Bentuk: " + balok.getName());
        System.out.println("Volume Balok: " + balok.calculateVolume());
        System.out.println("Luas Permukaan Balok: " + balok.calculateSurfaceArea());

        System.out.println();

        Tabung tabung = new Tabung("Tabung", 10, 10);
        System.out.println("Nama Bentuk: " + tabung.getName());
        System.out.println("Volume Tabung: " + tabung.calculateVolume());
        System.out.println("Luas Permukaan Tabung: " + tabung.calculateSurfaceArea());

        System.out.println();

        Bola bola = new Bola("Bola", 10);
        System.out.println("Nama Bentuk: " + bola.getName());
        System.out.println("Volume Bola: " + bola.calculateVolume());
        System.out.println("Luas Permukaan Bola: " + bola.calculateSurfaceArea());
    }
}