package com.pln.sparepart.soaldeveloper.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class MstBarangDto {
    private Long codeBarang;
    private String nameBarang;
    private BigDecimal hargaJual;
    private BigDecimal hargaBeli;
    private BigDecimal satuan;
    private String kategori;

}
