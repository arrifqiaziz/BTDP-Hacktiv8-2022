import java.util.*;

public class PerulanganForEach {
    public static void main(String[] args) {
        // Membuat Array
        int angka[] = { 3, 1, 42, 24, 12 };

        // Menggunakan perulangan For Each untuk menampilkan angka
        for (int x : angka) {
            System.out.print(x + " ");
        }
    }
}