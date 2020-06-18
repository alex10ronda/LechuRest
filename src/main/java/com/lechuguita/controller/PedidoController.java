package com.lechuguita.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lechuguita.dto.PedidoDTO;
import com.lechuguita.entities.Pedido;
import com.lechuguita.service.PedidoService;

/**
 * @author Alejandro Ruiz Garcia
 * 
 * Controlador de entrada de todas las operaciones relacionadas con Pedidos
 *
 */
@RestController
@RequestMapping("/el-lechuguita/pedidos")
public class PedidoController {

	@Autowired
	private PedidoService pedidoService;
	
	
	/**
	 * Método que obtiene todos los pedidos pendientes
	 * 
	 * @return Lista de objetos pedidos
	 */
	@GetMapping(value="/pendientes")
	public List<PedidoDTO> getAllPedidos(){
		return pedidoService.listadoPedidos();
	}
	
	@PostMapping(value="nuevo")
	public void nuevoPedido( @RequestBody PedidoDTO nuevoPedido){
		pedidoService.crearPedido(nuevoPedido);
	}
	
	
}
