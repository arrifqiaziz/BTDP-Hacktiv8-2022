public class NestedLoop {
    public static void main(String[] args) {

        // Membuat variabel
        int x, y;

        // Melakukan perulangan sebanyak x dan y kali
        for (x = 0; x <= 5; x++) {
            for (y = 0; y <= 3; y++) {
                System.out.format("Perulangan [x=%d, y=%d] %n", x, y);
            }
        }
    }
}