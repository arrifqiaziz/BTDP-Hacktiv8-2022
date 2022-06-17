import java.util.Scanner;

public class Latihan_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Deklarasi Variabel
        int i, j;
        int jenis;
        float total = 0;

        String[] barang = new String[6];
        int[] harga = new int[6];
        int[] diskon = new int[6];
        int[] kode = new int[5];
        int[] qty = new int[5];
        float[] sub = new float[5];

        // Pengisian data Array
        barang[0] = " ";
        barang[1] = "Mouse Bluetooth 5.0";
        barang[2] = "Headphone External";
        barang[3] = "Powerbank 10.000 mAH";
        barang[4] = "Tripod Kamera";
        barang[5] = "Smart Watch Xiaomi";

        harga[0] = 0;
        harga[1] = 149999;
        harga[2] = 246000;
        harga[3] = 136000;
        harga[4] = 267999;
        harga[5] = 899000;

        diskon[0] = 0;
        diskon[1] = 10;
        diskon[2] = 5;
        diskon[3] = 0;
        diskon[4] = 20;
        diskon[5] = 10;

        // Menu utama
        System.out.println("\nSelamat Datang di Toko Kikiw Sejatera Utama Sukses");
        System.out.println("Menu Barang : ");

        // Menampilkan barang
        for (i = 1; i < 6; i++) {
            System.out.println((i) + ". " + barang[i]);
        }

        // Input beli berapa jenis
        System.out.print("Ingin membeli berapa jenis barang : ");
        jenis = scan.nextInt();

        for (i = 0; i < jenis; i++) {
            j = i;
            System.out.print("\nSilahkan ketik kode barang ke- " + (i + 1) + " : ");
            kode[i] = scan.nextInt();
            System.out.print("Beli nya berapa banyak : ");
            qty[j] = scan.nextInt();
        }

        // Menghitung subTotal
        for (i = 0; i < jenis; i++) {
            sub[i] = (harga[kode[i]] - (harga[kode[i]] * diskon[kode[i]] / 100)) * qty[i];
        }

        // Menghitung Total Bayar
        for (i = 0; i < sub.length; i++) {
            total = total + sub[i];
        }

        // Output
        System.out.println("\nHasil :");
        System.out.println("No  Nama Barang             Harga       QTY  Diskon  Total");

        for (i = 0; i < jenis; i++) {
            System.out.println((i + 1) + "   " + barang[kode[i]] + "     Rp. " + harga[kode[i]] + "   " + qty[i]
                    + "     " + diskon[kode[i]] + "%    Rp. " + sub[i]);
        }

        System.out.println("Total Bayar : Rp. " + total);
    }
}
