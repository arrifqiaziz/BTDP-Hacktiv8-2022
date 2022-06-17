import java.util.Scanner;

public class ArrayForEach {
    public static void main(String[] args) {

        // Membuat array itprofesi
        String[] itprofesi = new String[5];

        try (// Membuat scanner
                Scanner scan = new Scanner(System.in)) {
            // Mengisi data ke array
            for (int i = 0; i < itprofesi.length; i++) {
                System.out.print("Profesi ke-" + i + " : ");
                itprofesi[i] = scan.nextLine();
            }
        }

        System.out.println("------------------------------");

        // Menampilkan isi array
        for (String b : itprofesi) {
            System.out.println(b);
        }
    }
}
