package sesi_02;

import java.util.Scanner;

public class Kasir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int belanjaan, diskon, bayar;
		String kartu;
		Scanner scan = new Scanner(System.in);

		System.out.print("Apakah ada kartu member: ");
		kartu = scan.nextLine();
		System.out.println("Total belanjaan: ");
		belanjaan = scan.nextInt();
		
		if (kartu.equalsIgnoreCase("ya")) {
			if (belanjaan > 500000) {
				diskon = 50000;
			} else if (belanjaan > 100000) {
				diskon = 15000;
			} else {
				diskon = 0;
			}
		} else {
			if (belanjaan > 100000) {
				diskon = 5000;
			} else {
				diskon = 0;
			}
		}

		bayar = belanjaan - diskon;

		System.out.println("Total bayar: RP " + bayar);
	}
}
