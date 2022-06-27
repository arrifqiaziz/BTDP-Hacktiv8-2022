package sesi_04;

import java.util.Scanner;

public class ArrayForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] itProfesi = new String[5];

		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < itProfesi.length; i++) {
			System.out.print("Buah ke-" + i + ": ");
			itProfesi[i] = scan.nextLine();
		}

		System.out.println("-------------");

		for (String b : itProfesi) {
			System.out.println(b);
		}
	}

}
