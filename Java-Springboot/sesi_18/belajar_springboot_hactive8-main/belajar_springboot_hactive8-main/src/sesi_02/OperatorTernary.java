package sesi_02;

public class OperatorTernary {

	public static void main(String[] args) {
		mainTernary();
	}

	private static void mainTernary() {
		boolean suka = true;
		System.out.println(cekJawab(suka));
	}

	private static String cekJawab(boolean suka) {
		String jawaban = suka ? "iya" : "tidak";
		return jawaban;
	}

}
