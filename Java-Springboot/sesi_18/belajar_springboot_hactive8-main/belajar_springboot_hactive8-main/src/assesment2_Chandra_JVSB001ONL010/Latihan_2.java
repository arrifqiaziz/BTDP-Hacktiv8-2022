package assesment2_Chandra_JVSB001ONL010;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Latihan_2 {

	static int i = 0;
	static int j = 0;
	static List<String> daftarKelas = new ArrayList<>();
	static List<String> murid = new ArrayList<>();

	public static void keteranganKelas(String student) {
		String keterangan = "Kamu akan duduk di kelas (" + i + "," + j + ") : " + student;
		daftarKelas.add(keterangan);
		daftarKelas.forEach(x -> System.out.println(x));
	}

	public static void layoutKelas(String student) {

		murid.add(student);

		System.out.println("=====================================================");
		for (int x = 0; x < murid.size(); x++) {
			if (x != 0 && x % 3 == 0) {
				System.out.println("");
			}
			// int tes = murid.get(x).length();
			// int tes2 = 20 - tes;
			System.out.print(String.format("| %s | %20s", murid.get(x), ""));
		}
		System.out.println("\n=====================================================");
	}

	public static void inputMurid(String student) {

		if (j == 3) { // reset kelas
			i++;
			j = 0;
		}

		keteranganKelas(student);
		layoutKelas(student);
		j++;
	}

	public static void main(String[] args) {
		String userInput = null;

		int menu = 1;

		while (menu != 2) {
			System.out.println("1. Input");
			System.out.println("2. Exit");
			System.out.print("Input : ");

			Scanner scan = new Scanner(System.in);
			menu = scan.nextInt();

			switch (menu) {
			case 1:
				System.out.print("Input murid : ");
				userInput = scan.next();
				inputMurid(userInput);
			case 2:
				break;
			}
			System.out.println("\n");
		}
	}
}
