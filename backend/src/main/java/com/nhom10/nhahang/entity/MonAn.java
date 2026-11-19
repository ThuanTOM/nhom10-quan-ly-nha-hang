package com.nhom10.nhahang.entity;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MonAn {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long maMon;
    private String tenMon;
    private BigDecimal donGia;
    private boolean conBan;
}
