package com.example.comerciojava.services;

import com.example.comerciojava.entities.Gestor;
import com.example.comerciojava.repositories.BaseRepository;
import com.example.comerciojava.repositories.GestorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GestorServiceImpl extends BaseServiceImpl<Gestor, Long> implements GestorService {

    @Autowired
    private GestorRepository gestorRepository;

    public GestorServiceImpl(BaseRepository<Gestor, Long> baseRepository){
        super(baseRepository);
    }

    @Override
    public List<Gestor> search(String filtro) throws Exception {
        try{
            List<Gestor> gestores = gestorRepository.searchNativo(filtro);
            return gestores;
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Page<Gestor> search(String filtro, Pageable pageable) throws Exception {
        try{
            Page<Gestor> gestores = gestorRepository.searchNativo(filtro, pageable);
            return gestores;
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
