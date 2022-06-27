package sesi_01;

import java.util.LinkedList;

public class LinkedListLaptop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> barang = new LinkedList<>();

		barang.add("Laptop");
		barang.add("Komputer");
		barang.add("Radio");

		if (barang.isEmpty()) {
			System.out.println("data kosong");
		} else {
			System.out.println("data ada");
		}

		if (barang.contains("Komputer")) {
			System.out.println("barang ditemukan");
		} else {
			System.out.println("barang tidak ditemukan");
		}

	}

}
