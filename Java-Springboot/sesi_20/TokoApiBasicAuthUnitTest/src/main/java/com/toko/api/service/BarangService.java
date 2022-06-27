package com.toko.api.service;

import java.util.List;

import com.toko.api.model.Barang;

public interface BarangService {

	List<Barang> findAllBarang();

	Barang saveBarang(Barang barang);

	Barang findByIdBarang(int id);

	void deleteBarang(int id);
}
