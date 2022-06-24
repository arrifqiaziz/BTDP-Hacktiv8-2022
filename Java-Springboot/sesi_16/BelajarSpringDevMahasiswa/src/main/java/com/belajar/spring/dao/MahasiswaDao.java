package com.belajar.spring.dao;

import org.springframework.data.repository.PagingAndSortingRepository;
import com.belajar.spring.entity.Mahasiswa;

public interface MahasiswaDao extends PagingAndSortingRepository<Mahasiswa, String> {
	
}