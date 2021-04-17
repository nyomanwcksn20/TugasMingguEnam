package com.juaracoding.main.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.juaracoding.main.entity.AdminUser;
import com.juaracoding.main.repository.AdminUserRepository;

@Service
public class ModelAdminUser implements ModelAdminUserInterface{

	@Autowired
	AdminUserRepository adminUserRepo;
	
	@Override
	public List<AdminUser> getAllAdminUser() {
		// TODO Auto-generated method stub
		return (List<AdminUser>)this.adminUserRepo.findAll();
	}

	@Override
	public AdminUser addAdminUser(AdminUser adminUser) {
		// TODO Auto-generated method stub
		return this.adminUserRepo.save(adminUser);
	}

	@Override
	public AdminUser getAdminUserById(String id) {
		// TODO Auto-generated method stub
		return this.adminUserRepo.findById(Long.parseLong(id)).get();
	}

	@Override
	public void deleteAdminUser(String id) {
		// TODO Auto-generated method stub
		this.adminUserRepo.deleteById(Long.parseLong(id));
	}

}
