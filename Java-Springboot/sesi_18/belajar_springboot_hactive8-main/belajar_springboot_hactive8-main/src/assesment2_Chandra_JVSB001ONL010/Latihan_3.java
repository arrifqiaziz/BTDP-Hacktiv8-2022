package assesment2_Chandra_JVSB001ONL010;

import java.text.NumberFormat;
import java.util.Scanner;

public class Latihan_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		final double diskon = 0.1;
		double pembelian = 1;

		NumberFormat formatter = NumberFormat.getCurrencyInstance();

		System.out.print("Press 0 untuk Exit Program\n");
		while (pembelian != 0) {
			System.out.print("Input pembelian : ");
			pembelian = scan.nextDouble();

			if (pembelian == 0) {
				break;
			}

			if (pembelian >= 1000000) {
				System.out.println("Diskon 10%");
				double total = pembelian - (pembelian * diskon);
				String moneyString = formatter.format(total);
				System.out.println("Harga bayar : " + moneyString);
			} else {
				String total = formatter.format(pembelian);
				System.out.println("Harga bayar : " + total);
			}
		}
	}

}
