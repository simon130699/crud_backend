package com.crud_productos.crud.service;

import com.crud_productos.crud.model.Producto;
import com.crud_productos.crud.repository.IProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductoService implements IProductoService{

    @Autowired
    private IProductoRepository repoProduct;
    @Override
    public void crearProducto(Producto prod) {
        repoProduct.save(prod);
    }

    @Override
    public List<Producto> traerProductos() {
        List<Producto> lisProductos= repoProduct.findAll();
        return lisProductos;
    }

    @Override
    public Producto traerUnProducto(Long codigo_producto) {
        Producto prod=repoProduct.findById(codigo_producto).orElse(null);
        return prod;
    }

    @Override
    public void eliminarProducto(Long codigo_producto) {
        repoProduct.deleteById(codigo_producto);
    }

    @Override
    public void editarProducto(Producto productoEditado) {
        this.crearProducto(productoEditado);
    }



}