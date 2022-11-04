package com.example.comerciojava.repositories;

import com.example.comerciojava.entities.Gestor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GestorRepository extends BaseRepository<Gestor, Long> {

    @Query(
            value = "SELECT * FROM gestor WHERE gestor.nombre LIKE %:filtro% OR gestor.apellido LIKE %:filtro%",
            countQuery = "SELECT count(*) FROM gestor",
            nativeQuery = true
    )
    List<Gestor> searchNativo(@Param("filtro") String filtro);

    @Query(
            value = "SELECT * FROM gestor WHERE gestor.nombre LIKE %:filtro% OR gestor.apellido LIKE %:filtro%",
            nativeQuery = true
    )
    Page<Gestor> searchNativo(@Param("filtro") String filtro, Pageable pageable);
}
