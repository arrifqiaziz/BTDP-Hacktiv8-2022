package assesment2_Chandra_JVSB001ONL010;

import java.text.NumberFormat;

public class Barang {

	static NumberFormat formatter = NumberFormat.getCurrencyInstance();
	private String nama;
	private double harga;
	private double diskon = 0;
	private int kode;

	public Barang(int kode, String nama, double harga, int diskon) {
		this.nama = nama;
		this.harga = harga;
		this.diskon = diskon;
		this.kode = kode;
	}
	
	public Barang(int kode, String nama, double harga) {
		this.nama = nama;
		this.harga = harga;
		this.kode = kode;
		this.diskon = 0;
	}

	public String getNama() {
		return nama;
	}

	public String getHarga() {
		return formatter.format(harga);
	}

	public double getDiskon() {
		return diskon;
	}

	public Integer getKode() {
		return kode;
	}

	public String getDiskonInPersen() {
		return diskon != 0 ? (diskon + "%") : "-";
	}

	public String getSubtotal(int qty) {
		double totalHarga = qty * harga;
		double diskonYangDidapat = totalHarga * (diskon / 100);
		double subTotal = totalHarga - diskonYangDidapat;
		String total = formatter.format(subTotal); // currency format
		return total;
	}

}
