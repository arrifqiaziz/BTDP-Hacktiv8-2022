import java.util.Scanner;

public class lampuLaluLintas {
    public static void main(String[] args) {
        
        //membuat variable dan scanner
        String lampu;
        Scanner scan = new Scanner(System.in);

        //mengambil input
        System.out.print("Inputkan warna lampu : ");
        lampu = scan.nextLine();

        switch(lampu){
            case "merah":
                System.out.println("Lampu merah, berhenti !");
                break;
            case "kuning":
                System.out.println("Lampu kuning, harap hati-hati!");
                break;
            case "hijau":
                System.out.println("Lampu hijau, silahkan jalan");
                break;
            default:
                System.out.println("Warna lampu salah");
        }
    }
}
