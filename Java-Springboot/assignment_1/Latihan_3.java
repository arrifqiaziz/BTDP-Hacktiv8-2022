public class Latihan_3 {
    public static void main(String[] args) {
        
        // Deklarasi variabel
        int a = 0;
        int b = 0;
        int c = 9;
        int d = 9;

        // Print ke 1
        System.out.println("Print ke 1");
        System.out.println("A = " + a++);   // Hasil : 0
        System.out.println("B = " + ++b);   // Hasil : 1
        System.out.println("C = " + c--);   // Hasil : 9
        System.out.println("D = " + --d);   // Hasil : 8

        // Print ke 2
        System.out.println("Print ke 2");
        System.out.println("A = " + a++);   // Hasil : 1
        System.out.println("B = " + ++b);   // Hasil : 2
        System.out.println("C = " + c--);   // Hasil : 8
        System.out.println("D = " + --d);   // Hasil : 7

        // Print ke 3
        System.out.println("Print ke 2");
        System.out.println("A = " + a++);   // Hasil : 2
        System.out.println("B = " + ++b);   // Hasil : 3
        System.out.println("C = " + c--);   // Hasil : 7
        System.out.println("D = " + --d);   // Hasil : 6

        // Print ke 4
        System.out.println("Print ke 2");
        System.out.println("A = " + a++);   // Hasil : 3
        System.out.println("B = " + ++b);   // Hasil : 4
        System.out.println("C = " + c--);   // Hasil : 6
        System.out.println("D = " + --d);   // Hasil : 5

    }
}
