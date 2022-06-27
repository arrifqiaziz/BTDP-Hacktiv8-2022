package sesi_01;

public class FormatString {
    public static void main(String args[]) {
        String namaDepan = "chandra";
        String namaBelakang = ".";

        // Nama saya chandra .
        System.out.format("Nama saya %s %s", namaDepan, namaBelakang);
    }
}