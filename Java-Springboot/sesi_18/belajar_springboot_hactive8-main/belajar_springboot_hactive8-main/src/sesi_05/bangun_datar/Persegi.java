package sesi_05.bangun_datar;

public class Persegi implements BangunDatar {

	private int sisi;

	public Persegi(int sisi) {
		this.sisi = sisi;
	}

	@Override
	public float luas() {
		return sisi * sisi;
	}

	@Override
	public float keliling() {
		return 4 * sisi;
	}
}
