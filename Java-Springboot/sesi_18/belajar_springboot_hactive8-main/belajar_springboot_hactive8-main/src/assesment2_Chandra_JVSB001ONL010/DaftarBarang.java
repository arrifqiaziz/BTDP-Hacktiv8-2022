package assesment2_Chandra_JVSB001ONL010;

import java.util.HashMap;

public class DaftarBarang {

	HashMap<Integer, Barang> daftarBarang = new HashMap<>();

	public HashMap<Integer, Barang> getDaftarBarang() {
		Barang barang1 = new Barang(1, "Mouse Bluetooth 5.0", 149999, 10);
		Barang barang2 = new Barang(2, "Headphone Eksternal", 246000, 5);
		Barang barang3 = new Barang(3, "Power Bank 10.000 mAh", 136000);
		Barang barang4 = new Barang(4, "Tripod Kamera", 267999, 20);
		Barang barang5 = new Barang(5, "Smart Watch Xiaomi", 899000, 10);

		daftarBarang.put(barang1.getKode(), barang1);
		daftarBarang.put(barang2.getKode(), barang2);
		daftarBarang.put(barang3.getKode(), barang3);
		daftarBarang.put(barang4.getKode(), barang4);
		daftarBarang.put(barang5.getKode(), barang5);

		return daftarBarang;
	}
}
