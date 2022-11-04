package com.example.comerciojava.repositories;

import com.example.comerciojava.entities.ProductoBase;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductoBaseRepository extends BaseRepository<ProductoBase, Long> {

    @Query(
            value = "SELECT * FROM producto_base WHERE producto_base.nombre LIKE %:filtro%",
            countQuery = "SELECT count(*) FROM producto_base",
            nativeQuery = true
    )
    List<ProductoBase> searchNativo(@Param("filtro") String filtro);

    @Query(
            value = "SELECT * FROM producto_base WHERE producto_base.nombre LIKE %:filtro%",
            nativeQuery = true
    )
    Page<ProductoBase> searchNativo(@Param("filtro") String filtro, Pageable pageable);
}
