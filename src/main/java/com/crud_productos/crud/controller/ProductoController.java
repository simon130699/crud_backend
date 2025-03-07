package com.crud_productos.crud.controller;

import com.crud_productos.crud.model.Producto;
import com.crud_productos.crud.service.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductoController {
    @Autowired

    private IProductoService prodServ;
    @PostMapping("/productos/crear")
    public ResponseEntity<Producto> crearProducto(@RequestBody Producto prod) {
        Producto productoGuardado = prodServ.crearProducto(prod);
        return new ResponseEntity<>(productoGuardado, HttpStatus.CREATED);
    }
    @GetMapping("/productos")
    public List<Producto> traerProductos(){
        return prodServ.traerProductos();
    };

    @GetMapping("/productos/{codigo_producto}")
    public Producto traerUnProducto(@PathVariable Long codigo_producto){
        return prodServ.traerUnProducto(codigo_producto);
    }

    @DeleteMapping("/productos/eliminar/{codigo_producto}")
    public String eliminarProducto(@PathVariable Long codigo_producto){
        prodServ.eliminarProducto(codigo_producto);
        return "se elimino el producto";
    }

    @PutMapping("/productos/editar/{codigo_producto}")
    public Producto editarProducto(@RequestBody Producto prod){
        prodServ.editarProducto(prod);
        return prodServ.traerUnProducto(prod.getCodigo_producto());
    }



}
