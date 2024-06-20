package week11;

import java.sql.*;
import java.util.Scanner;

public class Week11 {

    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/perpustakaan";
    static final String USER = "root";
    static final String PASS = "";

    static Connection conn;
    static Statement stat;
    static ResultSet rs;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            showMenu();
            System.out.print("Pilihan Menu: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    insert(scanner);
                    break;
                case 2:
                    update(scanner);
                    break;
                case 3:
                    delete(scanner);
                    break;
                case 4:
                    show();
                    break;
                default:
                    System.out.println("Pilihan Menu Tidak tersedia!!");
            }
        } while (choice != 5);

        scanner.close();
    }

    public static void showMenu() {
        System.out.println("Menu:");
        System.out.println("1. Insert Data");
        System.out.println("2. Update Data");
        System.out.println("3. Delete Data");
        System.out.println("4. Show Data");
        System.out.println("5. Exit");
    }

    public static void insert(Scanner scanner) {
        System.out.print("Masukkan id: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Masukkan Judul Buku: ");
        String judul_buku = scanner.nextLine();
        System.out.print("Masukkan Tahun Terbit: ");
        int tahun_terbit = scanner.nextInt();
        System.out.print("Masukkan stok buku: ");
        int stok = scanner.nextInt();
        System.out.print("Masukkan jumlah penulis: ");
        int penulis = scanner.nextInt();

        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            String sql = "INSERT INTO buku (id, judul_buku, tahun_terbit, stok, penulis) VALUES (?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setInt(1, id);
            ps.setString(2, judul_buku);
            ps.setInt(3, tahun_terbit);
            ps.setInt(4, stok);
            ps.setInt(5, penulis);

            ps.execute();

            ps.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void update(Scanner scanner) {
        System.out.print("Masukkan id untuk update buku: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        if (!exists(id)) {
            System.out.println("Data buku tidak ditemukan!");
            return;
        }
        System.out.print("Masukkan judul buku baru: ");
        String judul_buku = scanner.nextLine();
        System.out.print("Masukkan tahun terbit buku baru: ");
        int tahun_terbit = scanner.nextInt();
        System.out.print("Masukkan Stok buku baru: ");
        int stok = scanner.nextInt();
        System.out.print("Masukkan jumlah penulis buku baru: ");
        int penulis = scanner.nextInt();

        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            String sql = "UPDATE buku SET judul_buku = ?, tahun_terbit = ?, stok = ?, penulis = ? WHERE id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, judul_buku);
            ps.setInt(2, tahun_terbit);
            ps.setInt(3, stok);
            ps.setInt(4, penulis);
            ps.setInt(5, id);

            ps.executeUpdate();

            ps.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void delete(Scanner scanner) {
        System.out.print("Masukkan id untuk dihapus: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        if (!exists(id)) {
            System.out.println("Data buku tidak ditemukan!");
            return;
        }
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            String sql = "DELETE FROM buku WHERE id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setInt(1, id);

            ps.executeUpdate();

            ps.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean exists(int id) {
        boolean found = false;
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            String sql = "SELECT id FROM buku WHERE id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setInt(1, id);
            rs = ps.executeQuery();

            if (rs.next()) {
                found = true;
            }

            rs.close();
            ps.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return found;
    }

    public static void show() {
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            String sql = "SELECT * FROM buku";
            stat = conn.createStatement();
            rs = stat.executeQuery(sql);

            while (rs.next()) {
                int id = rs.getInt("id");
                String judul_buku = rs.getString("judul_buku");
                int tahun_terbit = rs.getInt("tahun_terbit");
                int stok = rs.getInt("stok");
                int penulis = rs.getInt("penulis");

                System.out.println("ID: " + id);
                System.out.println("Judul Buku: " + judul_buku);
                System.out.println("Tahun Terbit: " + tahun_terbit);
                System.out.println("Stok: " + stok);
                System.out.println("Penulis: " + penulis);
                System.out.println("-----------------------------");
            }

            rs.close();
            stat.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
