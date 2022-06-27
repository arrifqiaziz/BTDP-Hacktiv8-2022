package com.demo.rest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString;

@Entity
@Table(name = "tb_product")
@Data
@ToString
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "nama", unique = true)
	private String name;

	@Column(name = "hargaBeli")
	private int hargaBeli;

	@Column(name = "hargaJual")
	private int hargaJual;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHargaBeli() {
		return hargaBeli;
	}

	public void setHargaBeli(int hargaBeli) {
		this.hargaBeli = hargaBeli;
	}

	public int getHargaJual() {
		return hargaJual;
	}

	public void setHargaJual(int hargaJual) {
		this.hargaJual = hargaJual;
	}

}
