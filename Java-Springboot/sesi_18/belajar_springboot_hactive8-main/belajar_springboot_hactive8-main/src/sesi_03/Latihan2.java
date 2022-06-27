package sesi_03;

public class Latihan2 {

	public static void main(String[] args) {

		// For loop
		System.out.println("Hasil Output: ");
		for (int i = 0; i < 10; i++) {
			System.out.println("Perulangan ke -" + (i + 1));
		}

		System.out.println("========");

		// do while
		int i = 0;
		do {
			i += 1;
			System.out.println("Perulangan ke -" + i);
		} while (i < 10);
	}

}
