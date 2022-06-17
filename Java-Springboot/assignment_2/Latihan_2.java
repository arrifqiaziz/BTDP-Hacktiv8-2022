import java.util.Scanner;

public class Latihan_2 {
    public static void main(String[] args) {

        // Membuat Array dan Scanner
        String[][] kelas = new String[2][3];
        Scanner scan = new Scanner(System.in);

        // Mengisi setiap kelas
        for (int bar = 0; bar < kelas.length; bar++) {
            for (int kol = 0; kol < kelas[bar].length; kol++) {
                System.out.format("Siapa yang akan duduk di kelas (%d,%d): ", bar, kol);
                kelas[bar][kol] = scan.nextLine();
            }
        }

        // menampilkan isi Array
        System.out.println("-------------------------------------------");
        for (int bar = 0; bar < kelas.length; bar++) {
            for (int kol = 0; kol < kelas[bar].length; kol++) {
                System.out.format("| %s | \t", kelas[bar][kol]);
            }
            System.out.println("");
        }
        System.out.println("-------------------------------------------");
    }
}
