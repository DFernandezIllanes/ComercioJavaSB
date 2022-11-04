package com.example.comerciojava.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "gestor")
@AllArgsConstructor
@Getter
@Setter
public class Gestor extends Persistente{

    @Column(name = "nombre", columnDefinition = "VARCHAR(50)")
    private String nombre;

    @Column(name = "apellido", columnDefinition = "VARCHAR(50)")
    private String apellido;

    @OneToMany(mappedBy = "gestor")
    @JsonManagedReference
    private List<ProductoBase> productosBase;

    public Gestor(){
        this.productosBase = new ArrayList<>();
    }
}
