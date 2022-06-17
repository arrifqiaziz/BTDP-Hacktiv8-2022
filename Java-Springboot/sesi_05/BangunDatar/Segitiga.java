package BangunDatar;

public class Segitiga extends Main {
    float alas;
    float tinggi;

    float luas() {
        float luas = (float) (0.5 * alas * tinggi);
        System.out.println("Luas Segitiga adalah " + luas);
        return luas;
    }

    float keliling() {
        float keliling = alas * 3;
        System.out.println("Keliling Segitiga adalah " + keliling);
        return keliling;
    }
}
