import java.util.Scanner;

public class Latihan_1{
    public static void main(String[] args) {

        // Deklarasi variabel
        double luas, pi = 3.14;
        int r;
        Scanner scan = new Scanner(System.in);

        // Input jari-jari lingkaran
        System.out.print("Masukan jari-jari lingkaran : ");
        r = scan.nextInt();

        // Rumus luas lingkaran
        luas = pi * r * r;

        // Output hasil
        System.out.println("Luas lingkaran dengan jari-jari " + r + " adalah " + luas + " satuan luas");

    }
}
