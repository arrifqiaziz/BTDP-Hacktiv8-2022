public class LatihanFor {
    public static void main(String[] args) {

        // bintang
        System.out.println("Bintang");
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        // angka 1-10
        System.out.print("Angka 1-10 : ");
        for (int i = 0; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();

        System.out.print("Anka Ganjil dari 1-20 : ");
        for (int i = 1; i <= 20; i += 2) {
            System.out.print(i + " ");
        }
    }
}