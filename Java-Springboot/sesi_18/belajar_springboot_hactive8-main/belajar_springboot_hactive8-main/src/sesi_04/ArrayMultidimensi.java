package sesi_04;

import java.util.Arrays;

public class ArrayMultidimensi {
	public static void main (String[] args) {
		String[][] framework = { { "Java", "kotlin" }, { "React", "ReactNative" }, { "PHP", "Laravel" } };

		for (int x = 0; x < framework.length; x++) {
			System.out.println("bahasa:" + framework[x][0]);
			System.out.println("bahasa:" + framework[x][1]);
			System.out.println("=========================");
		}

		/*
		 * Array multidimensi di java sebenarnya hanya array dalam array (nested array)
		 */
		System.out.println(Arrays.toString(framework));
	}
}
