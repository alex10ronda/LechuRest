package com.lechuguita.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lechuguita.dao.ProductoRepository;
import com.lechuguita.entities.Producto;
import com.lechuguita.service.ProductoService;

@Service
public class ProductoServiceImpl implements ProductoService {
	
	@Autowired
	private ProductoRepository productoRepo;

	public void nuevoProducto(Producto producto) {
		productoRepo.saveAndFlush(new Producto("Prueba", 0.85, "Claro"));
	}
	
	

}
