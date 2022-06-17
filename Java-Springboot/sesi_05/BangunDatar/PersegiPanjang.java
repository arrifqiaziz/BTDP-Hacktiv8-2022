package BangunDatar;

public class PersegiPanjang extends Main {
    float panjang;
    float lebar;

    float luas() {
        float luas = panjang * lebar;
        System.out.println("Luas Persegi Panjang adalah " + luas);
        return luas;
    }

    float keliling() {
        float keliling = (panjang * lebar) * 2;
        System.out.println("Keliling Persegi Panjang adalah " + keliling);
        return keliling;
    }
}
