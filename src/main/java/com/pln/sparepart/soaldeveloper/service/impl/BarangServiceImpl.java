package com.pln.sparepart.soaldeveloper.service.impl;

import com.pln.sparepart.soaldeveloper.dto.MstBarangDto;
import com.pln.sparepart.soaldeveloper.model.MstBarang;
import com.pln.sparepart.soaldeveloper.repository.BarangRepository;
import com.pln.sparepart.soaldeveloper.service.BarangService;
import com.pos.common.ResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service(value = "barangService")
public class BarangServiceImpl implements BarangService {

    @Autowired
    private BarangRepository barangRepo;

    @Override
    public ResponseEntity<?> createBarang(MstBarangDto requestDTO) {
        try {
            ResponseDTO response = new ResponseDTO();
            MstBarang barangEntity = new MstBarang();
            MstBarang barang = barangRepo.findById(requestDTO.);
            if (barang == null){
                if(isNullStr)
            }
        }

    }

    @Override
    public ResponseEntity<?> updateBarang(MstBarangDto requestDTO) {
        return null;
    }

    @Override
    public ResponseEntity<?> getfindById(MstBarangDto requestDTO) {
        return null;
    }

    @Override
    public ResponseEntity<?> getfindAll(MstBarangDto requestDTO) {
        return null;
    }
}
