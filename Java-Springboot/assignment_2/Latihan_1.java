import java.util.Scanner;

public class Latihan_1 {
    public static void main(String[] args) {

        // Deklarasi
        Scanner scan = new Scanner(System.in);
        int bilangan1;
        int bilangan2;
        int bilangan3;
        double hasilRata;
        int Besar;
        int Kecil;

        // Menu utama
        System.out.println("--------------------------------------------------------------");
        System.out.println("Menentukan Bilangan Terbesar, Terkecil, dan Rata-rata");
        System.out.print("Masukan Bilangan ke-1 : ");
        bilangan1 = scan.nextInt();
        System.out.print("Masukan Bilangan ke-2 : ");
        bilangan2 = scan.nextInt();
        System.out.print("Masukan Bilangan ke-3 : ");
        bilangan3 = scan.nextInt();

        // Proses
        hasilRata = rata(bilangan1, bilangan2, bilangan3);
        Besar = terbesar(bilangan1, bilangan2, bilangan3);
        Kecil = terkecil(bilangan1, bilangan2, bilangan3);


        // Hasil
        System.out.println("\nHasil : ");
        System.out.println("Rata-rata nya adalah : " + hasilRata);
        System.out.println(Besar + " adalah bilangan terbesar");
        System.out.println(Kecil + " adalah bilangan terkecil");
    }

    static double rata(int a, int b, int c) {
        double x = (a + b + c) / 3;
        return x;
    }

    static int terbesar(int a, int b, int c){
        int x = Math.max(a,b);
        x = Math.max(x,c);
        return x;
    }

    static int terkecil(int a, int b, int c){
        int x = Math.min(a,b);
        x = Math.min(x,c);
        return x;
    }
}
