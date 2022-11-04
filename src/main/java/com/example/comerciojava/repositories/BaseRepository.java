package com.example.comerciojava.repositories;

import com.example.comerciojava.entities.Persistente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

@NoRepositoryBean
public interface BaseRepository<E extends Persistente, ID extends Serializable> extends JpaRepository<E, ID> {
}
