import java.util.Scanner;

public class Latihan_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("\nSelamat Datang di Program Cek Tahun Kabisat");
        System.out.print("Silahkan masukkan tahun : ");
        int tahun = scan.nextInt();

        if (tahun % 400 == 0) {
            System.out.print("Waw keren, ternyata tahun " + tahun + " adalah Tahun Kabisat! :)\n");
        } else if (tahun % 100 == 0) {
            System.out.print("Yah, sayang sekali tahun " + tahun + " bukanlah Tahun Kabisat :(\n");
        } else if (tahun % 4 == 0) {
            System.out.print("Waw hebat, ternyata tahun " + tahun + " adalah Tahun Kabisat! :)\n");
        } else {
            System.out.print("Yah, sayang sekali tahun " + tahun + " bukanlah Tahun Kabisat :(\n");
        }
    }
}
