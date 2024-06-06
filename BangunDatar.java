package week9;

// Kelas abstrak BangunDatar
abstract class BangunDatar {
    public abstract double luas();
    public abstract double keliling();
}

// Kelas untuk Persegi
class Persegi extends BangunDatar {
    private int sisi;

    public Persegi(int sisi) {
        this.sisi = sisi;
    }

    public double luas() {
        return sisi * sisi;
    }

    public double keliling() {
        return 4 * sisi;
    }
}

// Kelas untuk Persegi Panjang
class PersegiPanjang extends BangunDatar {
    private int panjang;
    private int lebar;

    public PersegiPanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public double luas() {
        return panjang * lebar;
    }

    public double keliling() {
        return 2 * (panjang + lebar);
    }
}

// Kelas untuk Lingkaran
class Lingkaran extends BangunDatar {
    private double diameter;

    public Lingkaran(double diameter) {
        this.diameter = diameter;
    }

    public double luas() {
        double radius = diameter / 2.0;
        return Math.PI * radius * radius;
    }

    public double keliling() {
        return Math.PI * diameter;
    }
}

// Kelas untuk Segitiga
class Segitiga extends BangunDatar {
    private double alas;
    private double tinggi;

    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public double luas() {
        return (alas * tinggi) / 2;
    }

    public double keliling() {
        return 0; // Untuk kesederhanaan, keliling tidak dihitung
    }
}



/*package week9;

public class BangunDatar
{
    private int panjang;
    private int lebar;
    private int diameter;
    private int sisi;
    private static final double pi = 3.14;

    // konstruktor untuk persegi
    public BangunDatar(int sisi)
    {
        this.sisi = sisi;
    }

    // konstruktor persegi panjang
    public BangunDatar(int panjang, int lebar)
    {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    // konstruktor lingkaran
    public BangunDatar(double diameter)
    {
        this.diameter = (int)diameter;
    }

    // untuk menghitung luas persegi
    public int luas(int a) 
    {
        return a * a;
    }

    // untuk menghitung luas persegi panjang
    public int luas(int a, int b) 
    {
        return a * b;
    }

    // untuk menghitung luas segitiga
    public double luas(double a, double b) 
    {
        return (a * b) / 2;
    }

    // untuk menghitung luas lingkaran
    public double luas(double a) 
    {
        return pi * a * a;
    }

    // getter panjang
    public int getPanjang()
    {
        return panjang;
    }

    // getter lebar
    public int getLebar()
    {
        return lebar;
    }

    // getter diameter
    public int getDiameter()
    {
        return diameter;
    }

    // getter sisi
    public int getSisi()
    {
        return sisi;
    }
}*/
