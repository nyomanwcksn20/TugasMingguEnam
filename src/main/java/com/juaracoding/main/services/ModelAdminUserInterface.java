package com.juaracoding.main.services;

import java.util.List;

import com.juaracoding.main.entity.AdminUser;

public interface ModelAdminUserInterface {
	
	public List<AdminUser> getAllAdminUser();
	
	public AdminUser addAdminUser(AdminUser adminUser);
	
	public AdminUser getAdminUserById(String id);
	
	public void deleteAdminUser(String id);
}
