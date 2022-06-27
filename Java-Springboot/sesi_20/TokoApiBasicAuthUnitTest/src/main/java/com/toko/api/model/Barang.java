package com.toko.api.model;

import javax.persistence.*;

@Entity
@Table(name = "barangs")
public class Barang {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String namaBarang;
	private Long hargaBeli;
	private Long hargaJual;	

	public Barang() {

	}
	
	public Barang(int id, String namaBarang, Long hargaBeli, Long hargaJual) {
		this.id = id;
		this.namaBarang = namaBarang;
		this.hargaBeli = hargaBeli;
		this.hargaJual = hargaJual;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNamaBarang() {
		return namaBarang;
	}

	public void setNamaBarang(String namaBarang) {
		this.namaBarang = namaBarang;
	}

	public Long getHargaBeli() {
		return hargaBeli;
	}

	public void setHargaBeli(Long hargaBeli) {
		this.hargaBeli = hargaBeli;
	}

	public Long getHargaJual() {
		return hargaJual;
	}

	public void setHargaJual(Long hargaJual) {
		this.hargaJual = hargaJual;
	}
}
