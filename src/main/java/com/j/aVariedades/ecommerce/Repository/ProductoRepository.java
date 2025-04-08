package com.j.aVariedades.ecommerce.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.j.aVariedades.ecommerce.Entity.Producto;

@Repository
public interface ProductoRepository extends JpaRepository < Producto, Long > {
    
}
