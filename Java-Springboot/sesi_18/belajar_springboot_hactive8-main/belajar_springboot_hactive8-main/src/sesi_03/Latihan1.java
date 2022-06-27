package sesi_03;

public class Latihan1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 6; i++) {
			System.out.println("******");
		}

		for (int i = 0; i < 10; i++) {
			System.out.print(i + 1 + " ");
		}

		System.out.println("\n");

		for (int i = 0; i < 20; i++) {
			if ((i % 2) != 0) {
				System.out.print(i + " ");
			}
		}

		System.out.println("\n");

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(j + 1);
			}
			System.out.println("");
		}
	}

}
