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
                    Persegi persegi = new Persegi(sisiPersegi);
                    System.out.println("Luas Persegi: " + persegi.luas());
                    System.out.println("Keliling Persegi: " + persegi.keliling());
                    break;
                case 2:
                    System.out.print("Masukkan panjang persegi panjang: ");
                    int panjang = scanner.nextInt();
                    System.out.print("Masukkan lebar persegi panjang: ");
                    int lebar = scanner.nextInt();
                    PersegiPanjang persegiPanjang = new PersegiPanjang(panjang, lebar);
                    System.out.println("Luas Persegi Panjang: " + persegiPanjang.luas());
                    System.out.println("Keliling Persegi Panjang: " + persegiPanjang.keliling());
                    break;
                case 3:
                    System.out.print("Masukkan panjang alas segitiga: ");
                    double alas = scanner.nextDouble();
                    System.out.print("Masukkan tinggi segitiga: ");
                    double tinggi = scanner.nextDouble();
                    Segitiga segitiga = new Segitiga(alas, tinggi);
                    System.out.println("Luas Segitiga: " + segitiga.luas());
                    // keliling segitiga tidak dihitung karena kita tidak punya panjang sisi lainnya
                    break;
                case 4:
                    System.out.print("Masukkan diameter lingkaran: ");
                    double diameter = scanner.nextDouble();
                    Lingkaran lingkaran = new Lingkaran(diameter);
                    System.out.println("Luas Lingkaran: " + lingkaran.luas());
                    System.out.println("Keliling Lingkaran: " + lingkaran.keliling());
                    break;
                case 5:
                    System.out.print("Masukkan panjang sisi kubus: ");
                    int sisiKubus = scanner.nextInt();
                    Kubus kubus = new Kubus(sisiKubus);
                    System.out.println("Volume Kubus: " + kubus.volume());
                    System.out.println("Luas Permukaan Kubus: " + kubus.luasPermukaan());
                    System.out.println("Keliling Kubus: " + kubus.keliling());
                    break;
                case 6:
                    System.out.print("Masukkan panjang balok: ");
                    int panjangBalok = scanner.nextInt();
                    System.out.print("Masukkan lebar balok: ");
                    int lebarBalok = scanner.nextInt();
                    System.out.print("Masukkan tinggi balok: ");
                    int tinggiBalok = scanner.nextInt();
                    Balok balok = new Balok(panjangBalok, lebarBalok, tinggiBalok);
                    System.out.println("Volume Balok: " + balok.volume());
                    System.out.println("Luas Permukaan Balok: " + balok.luasPermukaan());
                    System.out.println("Keliling Balok: " + balok.keliling());
                    break;
                case 7:
                    System.out.print("Masukkan diameter bola: ");
                    int diameterBola = scanner.nextInt();
                    Bola bola = new Bola(diameterBola);
                    System.out.println("Volume Bola: " + bola.volume());
                    System.out.println("Luas Permukaan Bola: " + bola.luasPermukaan());
                    System.out.println("Keliling Bola: " + bola.keliling());
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
