package assesment2_Chandra_JVSB001ONL010;

import java.util.HashMap;
import java.util.Map.Entry;

public class TabelRingkasanBelanja {

	public static void header() {
		System.out.println(String.format("%s %30s %20s %15s %15s %24s", "No |", "Nama Barang |", "Harga |", "QTY |",
				"Diskon |", "SubTotal |"));
		System.out.println(String.format("%s", "------------------------------------------------------"
				+ "-----------------------------------------------------------------------"));
	}

	public static void footer() {
		System.out.println(String.format("%s", "------------------------------------------------------"
				+ "-----------------------------------------------------------------------"));
	}

	public static void body(HashMap<Integer, Barang> detailBarang,
			HashMap<Integer, Integer> barangYangDibeli) {

		for (Entry<Integer, Integer> entry : barangYangDibeli.entrySet()) {
			int kode = entry.getKey();
			int qty = entry.getValue();

			if (detailBarang.containsKey(kode)) {
				Barang barang = detailBarang.get(kode);
				String nama = barang.getNama();
				String harga = barang.getHarga();
				String diskon = barang.getDiskonInPersen();
				String subTotal = barang.getSubtotal(qty);

				System.out.println(
						String.format("%s %32s %20s %15s %15s %24s%n", kode, nama, harga, qty, diskon, subTotal));
			}
		}
	}
}
