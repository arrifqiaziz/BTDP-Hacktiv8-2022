import java.util.Scanner;

public class conditionalLogic {
    public static void main(String[] args) {
        
        //membuat variable belanja dan scanner
        int belanja = 0;
        Scanner scan = new Scanner(System.in);

        //mengambil input
        System.out.print("Total belanjaan : Rp.");
        belanja = scan.nextInt();

        //cek apakah dia belanja diatas 100.000
        if (belanja > 100000){
            System.out.println("Selamat, anda mendapatkan hadiah!");
        }

        System.out.println("Terimakasih...");

    }
}
