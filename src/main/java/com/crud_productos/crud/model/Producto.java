package com.crud_productos.crud.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter

public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long codigo_producto;
    private String nombre;
    private Double costo;
    private Double cantidad_disponible;
    private String descripcion;

    public Producto() {
    }

    public Producto(Long codigo_producto, Double costo, String nombre, Double cantidad_disponible, String descripcion) {
        this.codigo_producto = codigo_producto;
        this.costo = costo;
        this.nombre = nombre;
        this.cantidad_disponible = cantidad_disponible;
        this.descripcion = descripcion;
    }
}