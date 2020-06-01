package com.lechuguita.service;

import java.util.List;

import com.lechuguita.entities.Pedido;

public interface PedidoService {

	public void nuevoPedido();
	
	/**
	 * Método que recupera todos los pedidos con sus productos asociados
	 * 
	 * @return
	 */
	public List<Pedido> listadoPedidos();
}
