package sesi_04;

import java.util.Arrays;

public class CaraKerjaArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// cara deklarasi array dengan cara yang berbeda
		String[] nama;
		String nama2[];
		String[] nama3 = new String[5];
		String[] bahasa = { "Django", "NodeJS", "ReactJS", "ReactNative", "Golang", "PHP", "Python" };

		System.out.println(bahasa.length);
		System.out.println(Arrays.toString(bahasa));
		System.out.println(bahasa[0]);
		System.out.println(bahasa[1]);

	}

}
