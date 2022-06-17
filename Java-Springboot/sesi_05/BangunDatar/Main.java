package BangunDatar;

public class Main {
    public static void main(String[] args) {
        
        // Membuat objek bangun datar
        //BangunDatar bangunDatar = new BangunDatar();

        // Membuat objek persegi dan mengisi nilai properti
        Persegi persegi = new Persegi();
        persegi.sisi = 2;

        // Membuat objek lingkaran dan mengisi nilai properti
        Lingkaran lingkaran = new Lingkaran();
        lingkaran.r = 2;

        // Membuat objek persegi panjang dan mengisi nilai properti
        PersegiPanjang persegiPanjang = new PersegiPanjang();
        persegiPanjang.panjang = 8;
        persegiPanjang.lebar = 4;

        // Membuat objek Segitiga dan mengisi nilai properti
        Segitiga segitiga = new Segitiga();
        segitiga.alas = 12;
        segitiga.tinggi = 8;

        // Memanggil method luas dan keliling
        //bangunDatar.luas();
        //bangunDatar.keliling();

        persegi.luas();
        persegi.keliling();

        lingkaran.luas();
        lingkaran.keliling();

        persegiPanjang.luas();
        persegiPanjang.keliling();

        segitiga.luas();
        segitiga.keliling();
    }
}
