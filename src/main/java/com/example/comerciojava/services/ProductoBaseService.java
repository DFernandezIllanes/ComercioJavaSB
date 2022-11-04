package com.example.comerciojava.services;

import com.example.comerciojava.entities.ProductoBase;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProductoBaseService extends BaseService<ProductoBase, Long> {

    List<ProductoBase> search(String filtro) throws Exception;

    Page<ProductoBase> search(String filtro, Pageable pageable) throws Exception;
}
