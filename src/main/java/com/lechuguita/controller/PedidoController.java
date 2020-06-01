package com.lechuguita.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lechuguita.entities.Pedido;
import com.lechuguita.service.PedidoService;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

	@Autowired
	private PedidoService pedidoService;
	
	@GetMapping(value="/pendientes")
	public List<Pedido> getAllPedidos(){
		return pedidoService.listadoPedidos();
	}
	
	
}
