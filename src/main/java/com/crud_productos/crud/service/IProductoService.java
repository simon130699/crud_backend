package com.crud_productos.crud.service;


import com.crud_productos.crud.model.Producto;

import java.util.List;

public interface IProductoService {
    //alta
    public Producto crearProducto(Producto prod);


    //lectura
    public List<Producto> traerProductos();

    //lectura 1 solo producto
    public Producto traerUnProducto(Long codigo_producto);

    //eliminar
    public void eliminarProducto(Long codigo_producto);

    //editar
    public void editarProducto(Producto prod);

}