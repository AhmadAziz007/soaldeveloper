package com.pln.sparepart.soaldeveloper.service;

import com.pln.sparepart.soaldeveloper.dto.MstBarangDto;
import org.springframework.http.ResponseEntity;

public interface BarangService {

    public ResponseEntity<?> createBarang(MstBarangDto requestDTO);

    public ResponseEntity<?> updateBarang(MstBarangDto requestDTO);

    public ResponseEntity<?> getfindById(MstBarangDto requestDTO);

    public ResponseEntity<?> getfindAll(MstBarangDto requestDTO);

}
