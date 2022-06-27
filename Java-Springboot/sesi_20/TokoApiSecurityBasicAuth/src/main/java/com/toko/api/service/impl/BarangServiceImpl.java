package com.toko.api.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.toko.api.model.Barang;
import com.toko.api.repository.BarangRepository;
import com.toko.api.service.BarangService;

@Service
public class BarangServiceImpl implements BarangService{
	
	@Autowired
	private BarangRepository barangRepository;

	@Override
	public List<Barang> findAllBarang() {
		// TODO Auto-generated method stub
		return barangRepository.findAll();
	}

	@Override
	public Barang saveBarang(Barang barang) {
		// TODO Auto-generated method stub
		return barangRepository.save(barang);
	}

	@Override
	public Barang findByIdBarang(int id) {
		// TODO Auto-generated method stub
		Barang barang = barangRepository.findById(id).orElse(new Barang());
		return barang;
	}

	@Override
	public void deleteBarang(int id) {
		// TODO Auto-generated method stub
		Barang barang = barangRepository.findById(id).orElse(new Barang());
		barangRepository.delete(barang);
	}
}
