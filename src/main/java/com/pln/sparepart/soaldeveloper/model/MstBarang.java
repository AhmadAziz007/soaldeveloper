package com.pln.sparepart.soaldeveloper.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "MSTBARANG")
public class MstBarang {
    @Id

    @Column(name = "CODEBRG", length = 20)
    private Long codeBarang;

    @Column(name = "NAMEBRG", length = 50)
    private String nameBarang;

    @Column(name = "SLPRICE", length = 50)
    private BigDecimal hargaJual;

    @Column(name = "PRCHSPRCE", length = 50)
    private BigDecimal hargaBeli;

    @Column(name = "UNIT", length = 250)
    private BigDecimal satuan;

    @Column(name = "CATEGORY", length = 250)
    private String kategori;

    public Long getCodeBarang() {
        return codeBarang;
    }

    public void setCodeBarang(Long codeBarang) {
        this.codeBarang = codeBarang;
    }

    public String getNameBarang() {
        return nameBarang;
    }

    public void setNameBarang(String nameBarang) {
        this.nameBarang = nameBarang;
    }

    public BigDecimal getHargaJual() {
        return hargaJual;
    }

    public void setHargaJual(BigDecimal hargaJual) {
        this.hargaJual = hargaJual;
    }

    public BigDecimal getHargaBeli() {
        return hargaBeli;
    }

    public void setHargaBeli(BigDecimal hargaBeli) {
        this.hargaBeli = hargaBeli;
    }

    public BigDecimal getSatuan() {
        return satuan;
    }

    public void setSatuan(BigDecimal satuan) {
        this.satuan = satuan;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }
}
