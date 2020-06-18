package com.lechuguita.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.lechuguita.dao.ProductoRepository;
import com.lechuguita.dto.ProductoDTO;
import com.lechuguita.entities.Producto;
import com.lechuguita.service.ProductoService;

@Service
public class ProductoServiceImpl implements ProductoService {
	
	@Autowired
	private ProductoRepository productoRepo;

	public List<ProductoDTO> getAllProductos() {
		List<Producto> productos =  productoRepo.findAll();
		
		List<ProductoDTO> listaProductos = new ArrayList<>(productos.stream()
				.map(producto -> new ProductoDTO(
						producto.getId(),
						producto.getNombre(),
						producto.getPrecio(), 
						producto.getDescripcion(),
						producto.getTipo()))
				.collect(Collectors.toList()));
		
		return listaProductos;
	}

	
	

}
