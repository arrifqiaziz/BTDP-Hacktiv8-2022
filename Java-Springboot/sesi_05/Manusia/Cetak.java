package Manusia;

public class Cetak {
    public static void main(String[] args) {
        
        // Buat objek referensi dari class manusia dengan cons cowok
        Manusia cowok = new Cowok();

        // Menampilkan output pada method yang ada di class cowok
        cowok.nyanyiLagu();

        // Buat objek referensi dari class manusia dengan cons cewek
        Manusia cewek = new Cewek();

        // Menampilkan output pada method yang ada di class cewek
        cewek.nyanyiLagu();        
    }
}
