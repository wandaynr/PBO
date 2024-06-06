package wanda;

public class BangunRuang {
    private int sisi;
    private int panjang;
    private int lebar;
    private int tinggi;
    private double diameter;
    private static final double PI = 3.14;

    // Konstruktor untuk Kubus
    public BangunRuang(int sisi) {
        this.sisi = sisi;
    }

    // Konstruktor untuk Balok
    public BangunRuang(int panjang, int lebar, int tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    // Konstruktor untuk Bola
    public BangunRuang(double diameter) {
        this.diameter = diameter;
    }

    // Menghitung volume Kubus
    public double volumeKubus() {
        return Math.pow(sisi, 3);
    }

    // Menghitung luas permukaan Kubus
    public double luasPermukaanKubus() {
        return 6 * Math.pow(sisi, 2);
    }

    // Menghitung keliling Kubus
    public double kelilingKubus() {
        return 12 * sisi;
    }

    // Menghitung volume Balok
    public double volumeBalok() {
        return panjang * lebar * tinggi;
    }

    // Menghitung luas permukaan Balok
    public double luasPermukaanBalok() {
        return 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
    }

    // Menghitung keliling Balok
    public double kelilingBalok() {
        return 4 * (panjang + lebar + tinggi);
    }

    // Menghitung volume Bola
    public double volumeBola() {
        double radius = diameter / 2.0;
        return (4.0 / 3.0) * PI * Math.pow(radius, 3);
    }

    // Menghitung luas permukaan Bola
    public double luasPermukaanBola() {
        double radius = diameter / 2.0;
        return 4 * PI * Math.pow(radius, 2);
    }

    // Menghitung keliling Bola
    public double kelilingBola() {
        return PI * diameter;
    }
}
