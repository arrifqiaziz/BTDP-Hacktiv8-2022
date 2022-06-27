package sesi_02;

public class OperatorEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x = new String("Test");
		String y = new String("Test");


		String sameX = x;
		

		boolean hasil1 = x == y;
		boolean hasil2 = x.equals(y);
		boolean hasil3 = x == sameX;

		System.out.println(hasil1);
		System.out.println(hasil2);
		System.out.println(hasil3);

	}

}
