package com.pln.sparepart.soaldeveloper.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "MSTTRNSTION")
public class MstTransaction {
    @Id

    @Column(name = "INVOICEDTE")
    private Data tglFaktur;

    @Column(name = "NOINVOICE")
    private String noFaktur;

    @Column(name = "NAMECNSMEN", length = 30)
    private String namaKonsumen;

    @Column(name = "CODEBRG", length = 20)
    private Long codeBarang;

    @Column(name = "AMOUNT", length = 200)
    private BigDecimal jumlah;

    @Column(name = "UNITPRICE", length = 200)
    private BigDecimal hargaSatuan;

    @Column(name = "TOTALPRICE", length = 200)
    private BigDecimal hargaTotal;

    public Data getTglFaktur() {
        return tglFaktur;
    }

    public void setTglFaktur(Data tglFaktur) {
        this.tglFaktur = tglFaktur;
    }

    public String getNoFaktur() {
        return noFaktur;
    }

    public void setNoFaktur(String noFaktur) {
        this.noFaktur = noFaktur;
    }

    public String getNamaKonsumen() {
        return namaKonsumen;
    }

    public void setNamaKonsumen(String namaKonsumen) {
        this.namaKonsumen = namaKonsumen;
    }

    public Long getCodeBarang() {
        return codeBarang;
    }

    public void setCodeBarang(Long codeBarang) {
        this.codeBarang = codeBarang;
    }

    public BigDecimal getJumlah() {
        return jumlah;
    }

    public void setJumlah(BigDecimal jumlah) {
        this.jumlah = jumlah;
    }

    public BigDecimal getHargaSatuan() {
        return hargaSatuan;
    }

    public void setHargaSatuan(BigDecimal hargaSatuan) {
        this.hargaSatuan = hargaSatuan;
    }

    public BigDecimal getHargaTotal() {
        return hargaTotal;
    }

    public void setHargaTotal(BigDecimal hargaTotal) {
        this.hargaTotal = hargaTotal;
    }
}
