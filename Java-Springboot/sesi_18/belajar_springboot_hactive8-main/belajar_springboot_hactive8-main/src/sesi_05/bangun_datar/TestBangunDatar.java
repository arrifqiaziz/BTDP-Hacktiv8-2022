package sesi_05.bangun_datar;

public class TestBangunDatar {

	public static void ringkasanBangunDatar(BangunDatar... listBangunDatar) {
		for (BangunDatar i : listBangunDatar) {
			String className = i.getClass().getSimpleName();
			System.out.println("Luas " + className + ": " + i.luas());
			System.out.println("Keliling  " + className + ": " + i.keliling());
			System.out.println("\n");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BangunDatar persegi = new Persegi(7);
		BangunDatar lingkaran = new Lingkaran(9);
		BangunDatar persegiPanjang = new PersegiPanjang(5, 6);
		BangunDatar segitiga = new Segitiga(9, 3);

		ringkasanBangunDatar(persegi, lingkaran, persegiPanjang, segitiga);
	}
}
