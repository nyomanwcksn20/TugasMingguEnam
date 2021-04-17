package com.juaracoding.main.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.juaracoding.main.entity.Laporan;

public interface LaporanRepository extends CrudRepository<Laporan, Long> {

}
