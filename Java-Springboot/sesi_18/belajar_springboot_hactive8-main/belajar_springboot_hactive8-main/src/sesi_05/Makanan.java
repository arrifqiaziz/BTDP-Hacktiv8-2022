package sesi_05;

public class Makanan {
	public static void main(String[] args) {
		Restoran data = new Restoran();

		data.setMenu("Ayam panggang");
		data.setHarga(99000);
		data.setSpesial(true);

		System.out.println("Menu makanan : " + data.getMenu());
		System.out.format("Harga makanan : Rp. %.2f\n", data.getHarga());
		System.out.println("Menu Spesial : " + data.isSpesial());
	}
}
