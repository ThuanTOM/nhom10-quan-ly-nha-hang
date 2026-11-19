package com.nhom10.nhahang.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nhom10.nhahang.entity.MonAn;
import com.nhom10.nhahang.repository.MonAnRepository;

@RestController
@RequestMapping("/api/mon-an")
@CrossOrigin(origins = "http://localhost:5173")
public class MonAnController {

    private final MonAnRepository monAnRepository;

    public MonAnController(MonAnRepository monAnRepository) {
        this.monAnRepository = monAnRepository;
    }

    /** KAN-12: chi tra ve mon con ban. */
    @GetMapping
    public List<MonAn> danhSachConBan() {
        return monAnRepository.findByConBanTrue();
    }
}
