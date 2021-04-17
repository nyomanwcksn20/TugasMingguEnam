package com.juaracoding.main.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name="admin_user")
public class AdminUser {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idAdmin;
	@NotEmpty(message = "username tidak boleh kosong")
	private String username;
	@NotEmpty(message = "password tidak boleh kosong")
	@Size(min = 5, message = "password harus lebih dari 5")
	private String password;
	private String role;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="id_admin", referencedColumnName = "idAdmin")
	private List<Laporan> lstLaporan = new ArrayList<Laporan>();
}
