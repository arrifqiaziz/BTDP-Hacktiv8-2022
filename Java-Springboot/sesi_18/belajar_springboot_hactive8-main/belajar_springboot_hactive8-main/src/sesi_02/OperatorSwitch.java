package sesi_02;

import java.util.Scanner;

public class OperatorSwitch {
	public static void main(String[] args) {
		String lampu;
		Scanner scan = new Scanner(System.in);

		System.out.println("Inputkan nama warna: ");
		lampu = scan.nextLine();

		switch (lampu) {
		case "merah":
			System.out.println("Lampu merah, berhenti!");
			break;
		case "kuning":
			System.out.println("Lampu kuning, siap-siap!");
			break;
		case "hijau":
			System.out.println("Lampu hijau, berhenti!");
			break;
		default:
			System.out.println("Warna lampu salah!");
		}
	}
}
