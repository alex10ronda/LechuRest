package com.lechuguita.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lechuguita.dto.ProductoDTO;
import com.lechuguita.service.ProductoService;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RequestMapping("/el-lechuguita/productos")
public class ProductoController {

	@Autowired
	private ProductoService productoService;
	
	@GetMapping(value="/listaProductos")
	public List<ProductoDTO> getProductos(){
		return productoService.getAllProductos();
	}
}
