package sesi_02;


public class OperatorBiwtwise {
	public static void main(String[] args) {
		int x = 2;
		int y = 4;
		int hasil = 0;

		hasil = x & y;
		System.out.println("x & y = " + hasil);

		hasil = x | y;
		System.out.println("x | y = " + hasil);

		hasil = x ^ y;
		System.out.println("x ^ y = " + hasil);

		hasil = ~x;
		System.out.println("~x = " + hasil);

		hasil = x << 3;
		System.out.println("x << 2 = " + hasil);

		hasil = x >> 1;
		System.out.println("x >> 2 = " + hasil);

		hasil = x >>> 2;
		System.out.println("x >>> 2 = " + hasil);
	}
}
