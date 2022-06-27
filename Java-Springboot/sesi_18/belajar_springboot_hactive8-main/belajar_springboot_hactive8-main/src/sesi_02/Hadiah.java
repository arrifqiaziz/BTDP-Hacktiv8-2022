package sesi_02;


import java.util.Scanner;

public class Hadiah {
	public static void main(String[] args) {

		int belanja = 0;
		Scanner scan = new Scanner(System.in);

		System.out.println("Total Belanjaan: Rp ");
		belanja = scan.nextInt();
		scan.close();

		if (belanja > 100000) {
			System.out.println("Selamat, anda mendapatkan hadiah!");
		}

		System.out.println("Terima kasih..");
	}
}
