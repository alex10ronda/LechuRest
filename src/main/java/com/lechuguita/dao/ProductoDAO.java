package com.lechuguita.dao;

import org.springframework.data.repository.CrudRepository;

import com.lechuguita.entities.Producto;

public interface ProductoDAO extends CrudRepository<Producto, Integer> {
	

}
