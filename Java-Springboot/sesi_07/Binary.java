public class Binary {

    public static int pencarianBinary(int[] list, int key) {
        int bawah = 0;
        int atas = list.length - 1;

        while (atas >= bawah) {
            int tengah = (bawah + atas) / 2;

            if (key < list[tengah])
                atas = tengah - 1;
            else if (key == list[tengah])
                return tengah;
            else
                bawah = tengah + 1;
        }
        return -1; // Tidak diemukan
    }

    public static void main(String[] args) {
        int myArray[] = {5, 8, 12, 15, 17, 23, 26, 30, 34, 38, 42, 54, 64, 78, 81};
        int key1 = 26;
        int key2 = 78;
        int key3 = 8;
        int key4 = 39;

        int i = Binary.pencarianBinary(myArray, key1);
        int j = Binary.pencarianBinary(myArray, key2);
        int k = Binary.pencarianBinary(myArray, key3);
        int l = Binary.pencarianBinary(myArray, key4);

        System.out.println("Key " + key1 + " index " + i);
        System.out.println("Key " + key2 + " index " + j);
        System.out.println("Key " + key3 + " index " + k);
        System.out.println("Key " + key4 + " index " + l);
    }
}
