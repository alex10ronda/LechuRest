package com.lechuguita.service;

import java.util.List;

import com.lechuguita.dto.ProductoDTO;
import com.lechuguita.entities.Producto;

public interface ProductoService {

	public List<ProductoDTO> getAllProductos();
}
