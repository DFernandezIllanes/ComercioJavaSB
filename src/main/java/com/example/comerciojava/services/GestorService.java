package com.example.comerciojava.services;

import com.example.comerciojava.entities.Gestor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface GestorService extends BaseService<Gestor, Long> {
    List<Gestor> search(String filtro) throws Exception;

    Page<Gestor> search(String filtro, Pageable pageable) throws Exception;
}
