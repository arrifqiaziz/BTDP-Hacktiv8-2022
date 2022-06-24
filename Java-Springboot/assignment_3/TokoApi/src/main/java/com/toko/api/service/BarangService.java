package com.toko.api.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.toko.api.model.Barang;
import com.toko.api.repository.BarangRepository;

@Service
@Transactional
public class BarangService {

	@Autowired
	private BarangRepository barangRepository;

	public List<Barang> listAllBarang() {
		return barangRepository.findAll();
	}

	public void saveBarang(Barang barang) {
		barangRepository.save(barang);
	}

	public Barang getBarang(Integer id) {
		return barangRepository.findById(id).get();
	}

	public void deleteBarang(Integer id) {
		barangRepository.deleteById(id);
	}
}
