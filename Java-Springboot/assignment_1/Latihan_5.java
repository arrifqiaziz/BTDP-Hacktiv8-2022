public class Latihan_5 {
    public static void main(String[] args) {

        // Deklarasi Variabel
        int y1 = 4;
        int y2 = 5;
        int x1;
        int x2;

        // Perhitungan x1
        x1 = (y1 + y2) * (y1 + y2);

        // Perhitungan x2
        x2 = (y1 % 4) * y2;

        // Output x1 dan x2
        System.out.println("Nilai x1 adalah " + x1);
        System.out.println("Nilai x2 adalah " + x2);

        // Logika Pembanding
        System.out.println("x1 >= x2 : " + (x1 >= x2));
        System.out.println("x1 <= x2 : " + (x1 <= x2));
        System.out.println("x1 % 4 == ++x2 % 5 : " + ((x1 % 4) == (++x2 % 5)));
    }
}
