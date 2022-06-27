package sesi_07;

import java.util.Scanner;

public class SelectionSort {
	void sort(int data[]) {
		int n = data.length; // 5
 
		/**
		 * untuk melakukan sorting, simpan nilai minimum dalam array set nilai minimum
		 * pada index 0 lakukan loop untuk melakukan perbandingan nilai minimum dengan
		 * setiap nilai yang di loop jika nilai loop lebih kecil dari nilai minimum
		 * sekarang maka lakukan swap nilai
		 */

		for (int i = 0; i < n - 1; i++) {

			System.out.println("\n------------\n");

			int min_idx = i;

			for (int j = i + 1; j < n; j++) {
				if (data[j] < data[min_idx]) {
					System.out.print(data[j] + "<" + data[min_idx] + "\n");
					min_idx = j;
					System.out.println(min_idx);
				}
			}
			int temp = data[min_idx];
			data[min_idx] = data[i];
			data[i] = temp;
			System.out.print(data[i] + " " + data[min_idx]);
        }
    }
 
	void printArray(int data[]) {
		int n = data.length;
        for (int i=0; i<n; ++i)
			System.out.print(data[i] + " ");
        System.out.println();
    }
 
	public static void main(String args[]) {

		/**
		 * input array size loop size untuk input angka -> input tampilkan data sblm
		 * sorting proses selection sort tampilkan data stlh sorting
		 */

		Scanner scan = new Scanner(System.in);

		// input array size
		int arraySize = 0;
		System.out.print("Jumlah size : ");
		arraySize = scan.nextInt();

		// inisialisasi array dengan size yang diinput
		int[] data = new int[arraySize];

		for (int i = 0; i < arraySize; i++) {
			System.out.print("Input nilai data ke-" + (i + 1) + " : ");
			data[i] = scan.nextInt(); // populate data
		}

		SelectionSort ob = new SelectionSort();

		// sebelum sort
		System.out.println("\nUnsorted array");
		ob.printArray(data);

		// setelah sort
		ob.sort(data);
		System.out.println("\nSorted array");
		ob.printArray(data);
    }
}

