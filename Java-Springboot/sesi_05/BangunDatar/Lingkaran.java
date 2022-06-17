package BangunDatar;

public class Lingkaran extends Main {
    float r;
    float pi = (float) 3.14;

    float luas() {
        float luas = pi * r * r;
        System.out.println("Luas Lingkaran adalah " + luas);
        return luas;
    }

    float keliling() {
        float keliling = pi * 2 * r;
        System.out.println("Keliling Lingkaran adalah " + keliling);
        return keliling;
    }
}
