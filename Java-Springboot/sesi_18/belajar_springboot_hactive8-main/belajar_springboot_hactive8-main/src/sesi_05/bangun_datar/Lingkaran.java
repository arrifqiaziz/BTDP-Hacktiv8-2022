package sesi_05.bangun_datar;

public class Lingkaran implements BangunDatar {

	private final static float PI = 3.14f;
	private float r;

	public Lingkaran(float r) {
		this.r = r;
	}

	@Override
	public float luas() {
		return PI * r;
	}

	@Override
	public float keliling() {
		return 2 * PI * r;
	}
}
