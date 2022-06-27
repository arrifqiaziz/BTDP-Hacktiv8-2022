package assesment1_Chandra_JVSB001ONL010;

import java.util.Scanner;

public class LuasLingkaran {
	public static void main(String[] args) {
		final double PI = 3.14;
		double Luas;
		int r;

		Scanner scan = new Scanner(System.in);

		System.out.print("Input r : ");

		r = scan.nextInt();

		scan.close();

		Luas = PI * r;
		System.out.println("PI * r = " + Luas);

	}
}
