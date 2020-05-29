package com.lechuguita.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lechuguita.entities.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long>{
	
}
