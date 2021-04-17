package com.juaracoding.main.repository;

import org.springframework.data.repository.CrudRepository;

import com.juaracoding.main.entity.AdminUser;

public interface AdminUserRepository extends CrudRepository<AdminUser, Long> {

	public AdminUser findByUsername(String nama);
	public AdminUser findByIdAdmin(Long id);
	
}