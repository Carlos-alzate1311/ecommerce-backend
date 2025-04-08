package com.j.aVariedades.ecommerce.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.j.aVariedades.ecommerce.Entity.Producto;
import com.j.aVariedades.ecommerce.Service.ProductoService;

@RestController
@RequestMapping("/api/productos")
// @CrossOrigin(origins = "http://localhost:5173") // Reemplazar con tu URL del frontend
public class ProductoController {

    @Autowired
    ProductoService productoService;

    @GetMapping
    List<Producto> listarProductos(){
        return productoService.listarProductos();
    }
    
    @PostMapping
    public Producto guardarProducto(@RequestBody Producto producto){
        return productoService.guardarProducto( producto);
    }

    @GetMapping("/{id}")
    public Producto obtenerProductoPorId(@PathVariable Long id){
        return productoService.obtenerProductoPorId(id);
    }


    @PutMapping("/{id}")
    public Producto actulizarProducto(@PathVariable Long id,@RequestBody Producto producto){
        return productoService.actualizarProducto(id, producto);

    }

    @DeleteMapping("/{id}")
    public void eliminarProducto(@PathVariable Long id){
        productoService.eliminarProducto(id);
    }


    
}
