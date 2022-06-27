package sesi_04;

import java.util.Arrays;

public class DeklarasiArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// deklarasi array
		int[] contoh;

		// inisialisasi size array
		contoh = new int[4];

		contoh[0] = 5;
		contoh[1] = 10;
		contoh[2] = contoh[1] + 10; // 20
		contoh[1] = 99; // replace array value

		System.out.println(contoh.length);
		System.out.println(Arrays.toString(contoh));

		int[] contoh2 = { 5, 15, 19, 9 };
		System.out.println(contoh2.length);
		System.out.println(Arrays.toString(contoh2));
	}

}
