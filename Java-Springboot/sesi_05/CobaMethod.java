public class CobaMethod {
    public static void main(String[] args) {
        int num1 = 80;
        int num2 = 20;

        int x = cetakNilai(num1, num2);

        System.out.println("Nilai nya adalah " + x);

    }

    static int cetakNilai(int a, int b) {
        int c = (a + b)/2;
        return c;
    }
}
