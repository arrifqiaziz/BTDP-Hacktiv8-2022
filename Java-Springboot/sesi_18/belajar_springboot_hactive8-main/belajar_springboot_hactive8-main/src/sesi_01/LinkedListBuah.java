package sesi_01;

import java.util.LinkedList;

public class LinkedListBuah {
    public static void main(String args[]) {
        LinkedList<String> buah = new LinkedList<>();

        // sebelum inisialisasi
        System.out.println("Nama buah : " + buah);

        buah.add("jambu");
        buah.add("durian");
        buah.add("semangka");

        // pengecekan -> apakah kosong
        System.out.println("\n====================");
        System.out.println("PENGECEKAN APAKAH KOSONG");
        System.out.println("====================");

        // OUTPUT -> buah adaaaaaaaaaaaaaaaaaaaaaaaaa
        if (buah.isEmpty()) {
            System.out.println("buah kosong");
        } else {
            System.out.println("buah adaaaaaaaaaaaaaaaaaaaaaaaaa");
        }

        // pengecekan -> apakah ada
        // OUTPUT -> buah ditemukan
        System.out.println("\n====================");
        System.out.println("PENGECEKAN APAKAH ADA");
        System.out.println("====================");

        if (buah.contains("jambu")) {
            System.out.println("buah ditemukan");
        } else {
            System.out.println("buah tidak ditemukan");
        }

        System.out.println("Nama buah : " + buah);

        buah.addFirst("rambutan");
        buah.addLast("duku");

        // rambutan, jambu, durian, semangka, duku
        System.out.println("Nama buah : " + buah);

        buah.set(1, "nanas");

        System.out.println("\n====================");
        System.out.println("PENGECEKAN INDEX");
        System.out.println("====================");
        System.out.println("Nama buah : " + buah);

        System.out.println("Index pertama : " + buah.getFirst()); // rambutan
        System.out.println("Index terakhir : " + buah.getLast()); // duku
        System.out.println("Index ke 3: " + buah.get(3)); // semangka
        System.out.println("Jumlah buah : " + buah.size() + "\n");

        System.out.println("Nama buah : " + buah);

        System.out.println("\n====================");
        System.out.println("HAPUS BUAH");
        System.out.println("====================");

        buah.removeFirst();
        buah.removeLast();
        buah.remove(0);

        System.out.println("Nama buah : " + buah);
    }
}