package sesi_02;


import java.util.Scanner;

public class OperatorAritmatika {

	public static void operasiAritmatika() {
		
	} 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double angka1;
		double angka2;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Input angka-1 : ");
		angka1 = keyboard.nextDouble();
		System.out.println("Input angka-2 : ");
		angka2 = keyboard.nextDouble();
		
		keyboard.close();
		
		System.out.format("%.2f + %.2f = %.2f\n",angka1, angka2, angka1 + angka2);
		System.out.format("%.2f - %.2f = %.2f\n",angka1, angka2, angka1 - angka2);
		System.out.format("%.2f / %.2f = %.2f\n",angka1, angka2, angka1 / angka2);
		System.out.format("%.2f * %.2f = %.2f\n",angka1, angka2, angka1 * angka2);
		System.out.format("%.2f mod %.2f = %.2f\n",angka1, angka2, angka1 % angka2);
		
		// ANGKA1 = 4
		System.out.println(angka1++); // 4
		// 5
		System.out.println(++angka1); // 6
		System.out.println(angka1--); // 6
		// 5
		System.out.println(--angka1); // 4
	}

}
