package assesment2_Chandra_JVSB001ONL010;

import java.util.Arrays;
import java.util.Scanner;

public class Latihan_1 {
	public static void main(String[] args) {

		final int x;
		final int y;
		final int z;

		Scanner scan = new Scanner(System.in);

		System.out.print("Masukan Bilangan Pertama (X) : ");
		x = scan.nextInt();

		System.out.print("Masukan Bilangan Pertama (Y) : ");
		y = scan.nextInt();

		System.out.print("Masukan Bilangan Pertama (Z) : ");
		z = scan.nextInt();

		scan.close();

		int[] result = { x, y, z };
		int rataRata = Arrays.stream(result).sum() / result.length;
		int bilanganTerkecil = Arrays.stream(result).min().getAsInt();
		int bilanganTerbesar = Arrays.stream(result).max().getAsInt();

		System.out.println("Rata-ratanya adalah : " + rataRata);
		System.out.format("%d adalah bilangan terkecil\n", bilanganTerkecil);
		System.out.format("%d adalah bilangan terbesar", bilanganTerbesar);

	}
}
