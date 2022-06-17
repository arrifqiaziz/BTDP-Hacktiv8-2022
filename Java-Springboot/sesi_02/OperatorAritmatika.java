import java.util.Scanner;

public class OperatorAritmatika{
    public static void main(String[] args) {
        int angka1;
        int angka2;
        int hasil;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Input angka-1: ");
        angka1 = keyboard.nextInt();
        System.out.println("Input angka-2: ");
        angka2 = keyboard.nextInt();

        //penjumlahan
        hasil = angka1 + angka2;
        System.out.println("Hasil Penjumlahan : " + hasil);

        System.out.println("Input angka-1: ");
        angka1 = keyboard.nextInt();
        System.out.println("Input angka-2: ");
        angka2 = keyboard.nextInt();

        //pengurangan
        hasil = angka1 - angka2;
        System.out.println("Hasil Pengurangan : " + hasil);

        System.out.println("Input angka-1: ");
        angka1 = keyboard.nextInt();
        System.out.println("Input angka-2: ");
        angka2 = keyboard.nextInt();

        //perkalian
        hasil = angka1 * angka2;
        System.out.println("Hasil Perkalian : " + hasil);

        System.out.println("Input angka-1: ");
        angka1 = keyboard.nextInt();
        System.out.println("Input angka-2: ");
        angka2 = keyboard.nextInt();

        //pembagian
        hasil = angka1 / angka2;
        System.out.println("Hasil Pembagian : " + hasil);

        System.out.println("Input angka-1: ");
        angka1 = keyboard.nextInt();
        System.out.println("Input angka-2: ");
        angka2 = keyboard.nextInt();

        //sisa bagi
        hasil = angka1 % angka2;
        System.out.println("Hasil Sisa Bagi : " + hasil);



    }
}