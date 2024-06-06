package wanda;

public class BangunDatar {
    private int panjang;
    private int lebar;
    private int sisi;
    private double diameter;
    private double alas;
    private double tinggi;
    private static final double PI = 3.14;

    // Konstruktor untuk Persegi
    public BangunDatar(int sisi) {
        this.sisi = sisi;
    }

    // Konstruktor untuk Persegi Panjang
    public BangunDatar(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    // Konstruktor untuk Lingkaran
    public BangunDatar(double diameter) {
        this.diameter = diameter;
    }

    // Konstruktor untuk Segitiga
    public BangunDatar(double alas, double tinggi, boolean isSegitiga) {
        if (isSegitiga) {
            this.alas = alas;
            this.tinggi = tinggi;
        }
    }

    // Menghitung luas Persegi
    public double luasPersegi() {
        return sisi * sisi;
    }

    // Menghitung keliling Persegi
    public double kelilingPersegi() {
        return 4 * sisi;
    }

    // Menghitung luas Persegi Panjang
    public double luasPersegiPanjang() {
        return panjang * lebar;
    }

    // Menghitung keliling Persegi Panjang
    public double kelilingPersegiPanjang() {
        return 2 * (panjang + lebar);
    }

    // Menghitung luas Lingkaran
    public double luasLingkaran() {
        double radius = diameter / 2.0;
        return PI * radius * radius;
    }

    // Menghitung keliling Lingkaran
    public double kelilingLingkaran() {
        return PI * diameter;
    }

    // Menghitung luas Segitiga
    public double luasSegitiga() {
        return (alas * tinggi) / 2;
    }
}
