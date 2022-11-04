package com.example.comerciojava.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "producto_base")
@NoArgsConstructor
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
}
