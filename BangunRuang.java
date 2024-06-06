package week9;

// Kelas abstrak BangunRuang
abstract class BangunRuang {
    public abstract double volume();
    public abstract double luasPermukaan();
    public abstract double keliling();
}

// Kelas untuk Kubus
class Kubus extends BangunRuang {
    private int sisi;

    public Kubus(int sisi) {
        this.sisi = sisi;
    }

    public double volume() {
        return Math.pow(sisi, 3);
    }

    public double luasPermukaan() {
        return 6 * Math.pow(sisi, 2);
    }

    public double keliling() {
        return 12 * sisi;
    }
}

// Kelas untuk Balok
class Balok extends BangunRuang {
    private int panjang;
    private int lebar;
    private int tinggi;

    public Balok(int panjang, int lebar, int tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    public double volume() {
        return panjang * lebar * tinggi;
    }

    public double luasPermukaan() {
        return 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
    }

    public double keliling() {
        return 4 * (panjang + lebar + tinggi);
    }
}

// Kelas untuk Bola
class Bola extends BangunRuang {
    private int diameter;
    private static final double PI = 3.14;

    public Bola(int diameter) {
        this.diameter = diameter;
    }

    public double volume() {
        double radius = diameter / 2.0;
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    public double luasPermukaan() {
        double radius = diameter / 2.0;
        return 4 * PI * Math.pow(radius, 2);
    }

    public double keliling() {
        double radius = diameter / 2.0;
        return 2 * PI * radius;
    }
}




/*package week9;

public class BangunRuang {
    private int sisi;
    private int panjang;
    private int lebar;
    private int tinggi;
    private int diameter;
    private static final double PI = 3.14;

    // konstruktor kubus
    public BangunRuang(int sisi) {
        this.sisi = sisi;
    }

    // konstruktor balok
    public BangunRuang(int panjang, int lebar, int tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    // konstruktor bola
    public BangunRuang(double diameterBola) {
    this.diameter = (int)diameterBola;
}


    // menghitung volume kubus
    public double volumeKubus() {
        return Math.pow(sisi, 3);
    }

    // menghitung volume balok
    public double volumeBalok() {
        return panjang * lebar * tinggi;
    }

    // menghitung volume bola
    public double volumeBola() {
        double radius = diameter / 2.0;
        return (4.0 / 3.0) * PI * Math.pow(radius, 3);
    }

    // menghitung luas permukaan kubus
    public double luasPermukaanKubus() {
        return 6 * Math.pow(sisi, 2);
    }

    // menghitung luas permukaan balok
    public double luasPermukaanBalok() {
        return 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
    }

    // menghitung luas permukaan bola
    public double luasPermukaanBola() {
        double radius = diameter / 2.0;
        return 4 * PI * Math.pow(radius, 2);
    }
}*/
