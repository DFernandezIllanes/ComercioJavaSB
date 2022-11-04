package com.example.comerciojava.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "producto_base")
@AllArgsConstructor
@Getter
@Setter
public class ProductoBase extends Persistente {

    @Column(name = "nombre", columnDefinition = "VARCHAR(50)")
    private String nombre;

    @Column(name = "precio")
    private Double precio;

    @Column(name = "descripcion", columnDefinition = "VARCHAR(50)")
    private String descripcion;

    @Column(name = "tiempo_fabricacion", columnDefinition = "VARCHAR(100)")
    private String tiempoDeFabricacion;

    @ManyToOne(optional = false)
    @JoinColumn(name = "gestor_id", referencedColumnName = "id")
    @JsonBackReference
    private Gestor gestor;

    public ProductoBase(){}
}
