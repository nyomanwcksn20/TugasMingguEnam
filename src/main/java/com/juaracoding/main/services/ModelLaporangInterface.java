package com.juaracoding.main.services;

import java.util.List;

import com.juaracoding.main.entity.AdminUser;
import com.juaracoding.main.entity.Laporan;

public interface ModelLaporangInterface {

	public List<Laporan> getAllLaporan();
	public Laporan addLaporan(Laporan laporan);
	public void deleteLaporan(String id);
	public Laporan getLaporanById(String id);
}
