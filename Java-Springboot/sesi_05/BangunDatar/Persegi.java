package BangunDatar;

public class Persegi extends Main {
    float sisi;

    float luas() {
        float luas = sisi * sisi;
        System.out.println("Luas Persegi adalah " + luas);
        return luas;
    }

    float keliling() {
        float keliling = sisi * 4;
        System.out.println("Keliling Persegi adalah " + keliling);
        return keliling;
    }
}
