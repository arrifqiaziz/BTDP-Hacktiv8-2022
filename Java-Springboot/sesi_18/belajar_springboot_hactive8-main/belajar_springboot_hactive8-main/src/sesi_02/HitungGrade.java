package sesi_02;


import java.util.Scanner;

public class HitungGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nilai;
		String grade;
		Scanner scan = new Scanner(System.in);

		System.out.println("Input nilai: ");
		nilai = scan.nextInt();

		if (nilai >= 90) {
			grade = "A";
		} else if (nilai >= 80) {
			grade = "B+";
		} else if (nilai >= 70) {
			grade = "B";
		} else if (nilai >= 60) {
			grade = "C+";
		} else if (nilai >= 50) {
			grade = "C";
		} else if (nilai >= 40) {
			grade = "D";
		} else {
			grade = "E";
		}

		System.out.println("Grade : " + grade);
	}

}
