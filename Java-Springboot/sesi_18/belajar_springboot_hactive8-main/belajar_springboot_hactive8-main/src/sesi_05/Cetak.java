package sesi_05;

public class Cetak {

	static double maxNumber(double a, double b) {
		if (a > b)
			return a;
		else
			return b;
	}

	static int maxNumber(int a, int b) {
		if (a > b)
			return a;
		else
			return b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manusia cowok = new Cowok();
		Manusia cewek = new Cewek();

		cowok.nyanyiLagu();
		cewek.nyanyiLagu();

		// overloading
		// ----------
		// java secara otomatis akan mencari
		// method yang sesuai dengan tipe parameter yang dikasih
		// jika parameter double maka method dengan parameter double akan dipanggil

		System.out.println(maxNumber(10, 20)); // method int
		System.out.println(maxNumber(10.88, 20.99)); // method double
	}

}
