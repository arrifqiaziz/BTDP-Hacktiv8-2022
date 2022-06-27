package com.belajar.spring.latihan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.belajar.spring.latihan.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
