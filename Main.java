package week9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            menu();
            System.out.print("Masukkan pilihan Anda: ");
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan panjang sisi persegi: ");
                    int sisiPersegi = scanner.nextInt();
                    BangunDatar persegi = new BangunDatar(sisiPersegi);
                    System.out.println("Luas Persegi: " + persegi.luasPersegi());
                    System.out.println("Keliling Persegi: " + persegi.kelilingPersegi());
                    break;
                case 2:
                    System.out.print("Masukkan panjang persegi panjang: ");
                    int panjang = scanner.nextInt();
                    System.out.print("Masukkan lebar persegi panjang: ");
                    int lebar = scanner.nextInt();
                    BangunDatar persegiPanjang = new BangunDatar(panjang, lebar);
                    System.out.println("Luas Persegi Panjang: " + persegiPanjang.luasPersegiPanjang());
                    System.out.println("Keliling Persegi Panjang: " + persegiPanjang.kelilingPersegiPanjang());
                    break;
                case 3:
                    System.out.print("Masukkan panjang alas segitiga: ");
                    double alas = scanner.nextDouble();
                    System.out.print("Masukkan tinggi segitiga: ");
                    double tinggi = scanner.nextDouble();
                    BangunDatar segitiga = new BangunDatar(alas, tinggi, true);
                    System.out.println("Luas Segitiga: " + segitiga.luasSegitiga());
                    break;
                case 4:
                    System.out.print("Masukkan diameter lingkaran: ");
                    double diameter = scanner.nextDouble();
                    BangunDatar lingkaran = new BangunDatar(diameter);
                    System.out.println("Luas Lingkaran: " + lingkaran.luasLingkaran());
                    System.out.println("Keliling Lingkaran: " + lingkaran.kelilingLingkaran());
                    break;
                case 5:
                    System.out.print("Masukkan panjang sisi kubus: ");
                    int sisiKubus = scanner.nextInt();
                    BangunRuang kubus = new BangunRuang(sisiKubus);
                    System.out.println("Volume Kubus: " + kubus.volumeKubus());
                    System.out.println("Luas Permukaan Kubus: " + kubus.luasPermukaanKubus());
                    System.out.println("Keliling Kubus: " + kubus.kelilingKubus());
                    break;
                case 6:
                    System.out.print("Masukkan panjang balok: ");
                    int panjangBalok = scanner.nextInt();
                    System.out.print("Masukkan lebar balok: ");
                    int lebarBalok = scanner.nextInt();
                    System.out.print("Masukkan tinggi balok: ");
                    int tinggiBalok = scanner.nextInt();
                    BangunRuang balok = new BangunRuang(panjangBalok, lebarBalok, tinggiBalok);
                    System.out.println("Volume Balok: " + balok.volumeBalok());
                    System.out.println("Luas Permukaan Balok: " + balok.luasPermukaanBalok());
                    System.out.println("Keliling Balok: " + balok.kelilingBalok());
                    break;
                case 7:
                    System.out.print("Masukkan diameter bola: ");
                    double diameterBola = scanner.nextDouble();
                    BangunRuang bola = new BangunRuang(diameterBola);
                    System.out.println("Volume Bola: " + bola.volumeBola());
                    System.out.println("Luas Permukaan Bola: " + bola.luasPermukaanBola());
                    System.out.println("Keliling Bola: " + bola.kelilingBola());
                    break;
                case 8:
                    System.out.println("Terima kasih! Program selesai.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi.");
            }
        }
    }

    public static void menu() {
        System.out.println("Pilih bangun datar atau ruang:");
        System.out.println("1. Persegi");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Segitiga");
        System.out.println("4. Lingkaran");
        System.out.println("5. Kubus");
        System.out.println("6. Balok");
        System.out.println("7. Bola");
        System.out.println("8. Exit");
    }
}
