package com.nhom10.nhahang.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nhom10.nhahang.entity.MonAn;

public interface MonAnRepository extends JpaRepository<MonAn, Long> {
    List<MonAn> findByConBanTrue();
}
