package com.j.aVariedades.ecommerce.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.j.aVariedades.ecommerce.Entity.Producto;
import com.j.aVariedades.ecommerce.Repository.ProductoRepository;

@Service
public class ProductoServiceImpl  implements ProductoService {

    @Autowired
    ProductoRepository productoRepository;

    @Override
    public List<Producto> listarProductos(){
        return productoRepository.findAll();
    }


    @Override
    public Producto guardarProducto(Producto producto){
        return productoRepository.save(producto);
    }
    

    @Override
    public Producto obtenerProductoPorId( Long id) {
        return productoRepository.findById(id).orElse(null);
    }

    @Override
    public void eliminarProducto(Long id){
         productoRepository.deleteById(id);
    }

    @Override
    public Producto actualizarProducto(Long id, Producto producto) {
        Optional<Producto> productoExistente = productoRepository.findById(id);
        if (productoExistente.isPresent()) {
            Producto p = productoExistente.get();
            p.setNombre(producto.getNombre());
            p.setDescripcion(producto.getDescripcion());
            p.setPrecio(producto.getPrecio());
            p.setStock(producto.getStock());
            p.setImagenUrl(producto.getImagenUrl());
            return productoRepository.save(p);
        }
        return null;
    }
}
