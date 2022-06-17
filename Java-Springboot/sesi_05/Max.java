public class Max {

    static double maxNumber(double a, double b) {
        // Method dan Param berbeda
        // Tipe Data Double
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    static int maxNumber(int a, int b) {
        // Method dan Param berbeda
        // Tipe Data Double
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        System.out.println(maxNumber(10, 20));
        System.out.println(maxNumber(7.5, 4.5));
    }
}
