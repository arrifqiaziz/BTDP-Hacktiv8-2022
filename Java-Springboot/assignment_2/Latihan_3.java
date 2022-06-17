import java.util.Scanner;

public class Latihan_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int harga, diskon, bayar;

        // Menu Utama
        System.out.println("\nSelamat Datang di Program Cek Diskon");
        System.out.print("Silahkan masukan total belanjaan anda : Rp. ");
        harga = scan.nextInt();

        // Proses
        System.out.println("\nKarena total belanjaan anda adalah : Rp. " + harga);

        if (harga >= 1000000) {
            diskon = harga * 10 / 100;
            bayar = harga - diskon;
            System.out.println("Selamat anda mendapatkan diskon 10% sebesar Rp. " + diskon);
        } else {
            bayar = harga;
            System.out.println("Maaf anda belum mendapatkan diskon");
        }

        System.out.println("Maka total yang harus dibayar sebesar Rp. " + bayar);    
    }
}
