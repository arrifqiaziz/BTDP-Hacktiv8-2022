package sesi_05;

import sesi_05.anak_umur.AnakUmur1Tahun;
import sesi_05.anak_umur.Induk;
import sesi_05.anak_umur.InterfaceAnakUmur1Tahun;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnakUmur1Tahun i = new AnakUmur1Tahun();
		i.anakSiapa();
		i.makan();
		Induk a1 = new AnakUmur1Tahun();
		a1.minum();
		InterfaceAnakUmur1Tahun a11 = new AnakUmur1Tahun();
		a11.hobiAnak();
	}
}
