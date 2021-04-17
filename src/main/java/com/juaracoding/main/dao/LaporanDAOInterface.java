//package com.juaracoding.main.dao;
//
//import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
//import org.springframework.data.domain.Page;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.PagingAndSortingRepository;
//
//import com.juaracoding.main.entity.Laporan;
//
//public interface LaporanDAOInterface extends PagingAndSortingRepository<Laporan, Long> {
//
//
//  @Query(value = "SELECT COUNT(*) FROM laporan where status = 'pending'")
//  public Page<Laporan> findByPending(String status, Pageable pageable);
//}
