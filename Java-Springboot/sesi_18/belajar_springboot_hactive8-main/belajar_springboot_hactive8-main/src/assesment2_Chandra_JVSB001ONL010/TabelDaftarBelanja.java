package assesment2_Chandra_JVSB001ONL010;

import java.util.HashMap;
import java.util.Map.Entry;

public class TabelDaftarBelanja {

	public static void header() {
		System.out.println("-----------DAFTAR BARANG-----------");
	}

	public static void body(HashMap<Integer, Barang> detailBarang) {
		for (Entry<Integer, Barang> entry : detailBarang.entrySet()) {
			int kode = entry.getKey();
			Barang barang = entry.getValue();
			System.out.format("N0. %d %s\n", kode, barang.getNama());
		}
	}

	public static void footer() {
		System.out.println("-----------------------------------");

	}
}
