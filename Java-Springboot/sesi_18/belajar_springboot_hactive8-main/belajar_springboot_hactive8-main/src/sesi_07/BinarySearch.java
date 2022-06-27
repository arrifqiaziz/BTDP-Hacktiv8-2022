package sesi_07;

import java.util.Scanner;

class BinarySearch {

	public static void binarySearchManualInput() {
		int[] data = { 5, 8, 12, 15, 17, 23, 26, 30, 34, 38, 42, 54, 64, 78, 81 };
		int last = data.length - 1;

		int key1 = 26;
		int key2 = 78;
		int key3 = 8;
		int key4 = 39;

		int i = BinarySearch.binarySearch(data, 0, last, key1);
		int j = BinarySearch.binarySearch(data, 0, last, key2);
		int k = BinarySearch.binarySearch(data, 0, last, key3);
		int l = BinarySearch.binarySearch(data, 0, last, key4);

		System.out.println("\nKey " + key1 + " index " + i);
		System.out.println("Key " + key2 + " index " + j);
		System.out.println("Key " + key3 + " index " + k);
		System.out.println("Key " + key4 + " index " + l);
	}

	public static void binarySearchUserInput() {
		Scanner scan = new Scanner(System.in);

		int arraySize = 0;
		int valueToFind;

		// INPUT ARRAY SIZE
		System.out.print("Enter number of elements : ");
		arraySize = scan.nextInt();
		int[] data = new int[arraySize];

		System.out.format("Enter %d integers : \n", arraySize);
		for (int i = 0; i < arraySize; i++) {
			data[i] = scan.nextInt();
		}

		// FIND ARRAY
		System.out.print("Value to find : ");
		valueToFind = scan.nextInt();
		int last = data.length - 1;

		int indexValue = BinarySearch.binarySearch(data, 0, last, valueToFind);
		if (indexValue != 0) {
			System.out.println(valueToFind + " Found at location " + indexValue);
		} else {
			System.out.println("Element is not found!");
		}
	}

	public static int binarySearch(int arr[], int first, int last, int key) {
		int mid = (first + last) / 2;
		while (first <= last) {
			if (arr[mid] < key) {
		        first = mid + 1;     
			} else if (arr[mid] == key) {
				return mid;
		      }else{  
		         last = mid - 1;  
		      }  
		      mid = (first + last)/2;  
			}
			if (first > last) {
				return 0;
			}
			return mid;
		 }  

	public static void main(String args[]) {
		binarySearchUserInput();
		binarySearchManualInput();
	}
}
