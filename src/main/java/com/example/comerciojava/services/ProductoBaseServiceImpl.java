package com.example.comerciojava.services;

import com.example.comerciojava.entities.ProductoBase;
import com.example.comerciojava.repositories.BaseRepository;
import com.example.comerciojava.repositories.ProductoBaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoBaseServiceImpl extends BaseServiceImpl<ProductoBase, Long> implements ProductoBaseService {

    @Autowired
    private ProductoBaseRepository productoBaseRepository;

    public ProductoBaseServiceImpl(BaseRepository<ProductoBase, Long> baseRepository){
        super(baseRepository);
    }

    @Override
    public List<ProductoBase> search(String filtro) throws Exception {
        try{
            List<ProductoBase> productosBase = productoBaseRepository.searchNativo(filtro);
            return productosBase;
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Page<ProductoBase> search(String filtro, Pageable pageable) throws Exception {
        try{
            Page<ProductoBase> productosBase = productoBaseRepository.searchNativo(filtro, pageable);
            return productosBase;
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
