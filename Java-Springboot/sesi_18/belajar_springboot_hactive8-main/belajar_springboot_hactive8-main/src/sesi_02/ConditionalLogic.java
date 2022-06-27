package sesi_02;


public class ConditionalLogic {
	public static void main(String[] args) {
		int x = 5;
		boolean y = (x == 5);

		if (y)
			System.out.println(y);
		if (x == 5) {
			System.out.println("x bernilai " + x);
		}

		boolean hasil;
		int k = 5;
		int z = 10;

		hasil = k < z; // true
		System.out.println(hasil);

		hasil = k > z; // false
		System.out.println(hasil);

		hasil = k <= 5; // true
		System.out.println(hasil);

		hasil = k >= 11; // false
		System.out.println(hasil);

		hasil = k == z; // false
		System.out.println(hasil);

		hasil = k != z; // true
		System.out.println(hasil);

		hasil = k > z || k < z; // true
		System.out.println(hasil);

		hasil = 3 < k && k < 6; // false
		System.out.println(hasil);

		hasil = !hasil; // false
		System.out.println(hasil);
	}
}
