public class operatorPenugasan {
    public static void main(String[] args) {
        int a;
        int b;

        //Penisian nilai
        a = 5;
        b = 10;

        //penambahan
        b += a;
        //sekarang b=15
        System.out.println("Penambahan = " + b);

        //pengurangan
        b -= a;
        //sekarang b = 10, karena b sudah jadi 15-5
        System.out.println("Pengurangan = " + b);

        //perkalian
        b *= a;
        //sekarang b=50 karena b 10 dikali 5
        System.out.println("Perkalian = " + b);

        //pembagian
        b /= a;
        //sekarang b=10 karena b 50 dibagi 5
        System.out.println("Pembagian = " + b);

        //hasil bagi
        b %= a;
        //sekarang b=0 karena 10 habis dibagi 5
        System.out.println("Hasil bagi = " + b);
    }
}
