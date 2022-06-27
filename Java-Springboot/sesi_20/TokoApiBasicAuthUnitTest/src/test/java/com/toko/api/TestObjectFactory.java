package com.toko.api;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

import com.toko.api.model.Barang;

public class TestObjectFactory {
	public static Barang createBarang() {
		final Barang product = new Barang();
		product.setId(new Random().nextInt());
		product.setNamaBarang(RandomStringUtils.randomAlphabetic(10));
		product.setHargaBeli(new Random().nextLong());
		product.setHargaJual(new Random().nextLong());

		return product;
	}

	public static List<Barang> createBarangList(final int size) {
		final List<Barang> result = new ArrayList<>();
		for (int i = 0; i < size; i++) {
			result.add(createBarang());
		}
		return result;
	}
}
