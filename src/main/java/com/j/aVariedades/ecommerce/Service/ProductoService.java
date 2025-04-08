package com.j.aVariedades.ecommerce.Service;

import java.util.List;

import com.j.aVariedades.ecommerce.Entity.Producto;


public interface ProductoService {
    List<Producto> listarProductos();
    Producto guardarProducto(Producto producto);
    Producto obtenerProductoPorId(Long id);
    void eliminarProducto(Long id);
    Producto actualizarProducto(Long id, Producto producto);

    
}
