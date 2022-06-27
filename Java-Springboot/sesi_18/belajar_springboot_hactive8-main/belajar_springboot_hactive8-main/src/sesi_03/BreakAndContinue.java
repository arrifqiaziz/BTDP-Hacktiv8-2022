package sesi_03;

public class BreakAndContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		for (i = 0; i < 4; i++) {
			if (i >= 3) {
				break;
			}
			System.out.println("Selamat Belajar!");
			if (i >= 1) {
				continue;
			}
			System.out.println("JAVA");
		}
		System.out.println(i);
	}

}
