package sesi_05.bangun_datar;

public class PersegiPanjang implements BangunDatar {

	private float lebar;
	private float panjang;

	public PersegiPanjang(float panjang, float lebar) {
		this.panjang = panjang;
		this.lebar = lebar;
	}

	@Override
	public float luas() {
		return panjang * lebar;
	}

	@Override
	public float keliling() {
		return 2 * (panjang + lebar);
	}
}
