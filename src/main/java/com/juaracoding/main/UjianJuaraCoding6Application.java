package com.juaracoding.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.juaracoding.main.repository.AdminUserRepository;
import com.juaracoding.main.repository.LaporanRepository;

@SpringBootApplication
public class UjianJuaraCoding6Application implements CommandLineRunner{

	@Autowired
	AdminUserRepository adminUserRepo;
	
	@Autowired
	LaporanRepository laporanRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(UjianJuaraCoding6Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
