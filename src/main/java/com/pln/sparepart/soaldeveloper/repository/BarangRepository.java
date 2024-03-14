package com.pln.sparepart.soaldeveloper.repository;

import com.pln.sparepart.soaldeveloper.model.MstBarang;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BarangRepository extends PagingAndSortingRepository<MstBarang, Long> {

     @Query(value = "SELECT A.CODEBRG, A.NAMEBRG, A.SLPRICE, A.PRCHSPRCE, A.UNIT, A.CATEGORY FROM MSTBARANG AS A WHERE A.CODEBRG = :A.CODEBRG",nativeQuery = true)
     MstBarang findByCodeBarang(@Param("codeBarang") Long codeBarang);

     @Query(value = "SELECT A.CODEBRG FROM MSTBARANG AS A WHERE A.CODEBRG = :A.CODEBRG",nativeQuery = true)
     MstBarang findById(@Param("codeBarang") Long codeBarang);

     @Query(value = "SELECT A.CODEBRG, A.NAMEBRG, A.SLPRICE, A.PRCHSPRCE, A.UNIT, A.CATEGORY FROM MSTBARANG AS A ORDER BY A.CODEBRG ASC",nativeQuery = true)
     List<MstBarang> findAll();
}
