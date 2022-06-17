import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x, y;

        System.out.println("------------------------------------------------------------");
        System.out.print("Masukan jumlah data : ");
        int jlh_data = scan.nextInt();

        // Input
        int[] data = new int[jlh_data];
        System.out.println();
        for (x = 0; x < jlh_data; x++) {
            System.out.print("Inputkan data ke - " + (x + 1) + " : ");
            data[x] = scan.nextInt();
        }

        // Tampilan data sebelum sorting
        System.out.println();
        System.out.println("Data sebelum disorting : ");
        for (x = 0; x < jlh_data; x++) {
            System.out.print(data[x] + " ");
        }

        // Proses selection sort
        System.out.println("\n\nProses Selection Sort");
        for (x = 0; x < jlh_data; x++) {
            System.out.print("Iterasi ke-" + (x + 1) + " : ");
            for (y = 0; y < jlh_data; y++) {
                System.out.print(data[y] + " ");
            }

            //System.out.println(" Apakah data " + data[x] + " sudah benar urutannya?");

            boolean tukar = false;
            int index = 0;
            int min = data[x];

            String pesan = " -> tidak ada pertukaran";

            for (y = (x + 1); y < jlh_data; y++) {
                if (min > data[y]) {
                    tukar = true;
                    index = y;
                    min = data[y];
                }
            }

            if (tukar == true) {
                // Pertukaran data
                pesan = " -> data " + data[x] + " ditukar dengan data " + data[index];
                int temp = data[x];
                data[x] = data[index];
                data[index] = temp;
            }

            // for (y = 0; y < jlh_data; y++) {
            //     System.out.print(data[y] + " ");
            // }

            System.out.println(pesan);
        }

        // Tampilan data setelah sorting
        System.out.print("Data setelah sorting : ");
        for (x = 0; x < jlh_data; x++) {
            System.out.print(data[x] + " ");
        }
        System.out.println("\n------------------------------------------------------------");
    }
}