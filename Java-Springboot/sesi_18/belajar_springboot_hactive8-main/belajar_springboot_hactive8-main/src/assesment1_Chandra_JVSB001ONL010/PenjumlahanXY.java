package assesment1_Chandra_JVSB001ONL010;

public class PenjumlahanXY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* A.
		 * X1 = y1 + y2 * (y1 + y2)
		 * X2 = y1 / 4 * y2
		 * 
		 * B.
		 * X1 >= X2 true
		 * X2 >= X1 false
		 * X1 % 4 == ++X2 % 5
		 */

		int X1;
		int X2;
		int y1 = 10;
		int y2 = 5;

		// A
		X1 = y1 + y2 * (y1 + y2);
		X2 = y1 / 4 & y2;

		System.out.println(X1);
		System.out.println(X2);
	}

}
