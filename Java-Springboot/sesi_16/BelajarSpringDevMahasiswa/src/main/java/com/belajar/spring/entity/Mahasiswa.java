package com.belajar.spring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Entity
@Data
@Table(name = "mahasiswa") 
public class Mahasiswa {
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(length = 64)
    private String id;
    
    @NotNull
    @NotBlank
    @Column(name = "nim", unique = true)
    private String nim;
    
    @NotNull
    @NotBlank
    @Column(name = "nama")
    private String nama;
    
    @Column(name = "ipk")
    private float ipk;
    
    @NotNull
    @NotBlank
    @Column(name = "jurusan")
    private String jurusan;

    
}