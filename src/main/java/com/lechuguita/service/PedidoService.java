package com.lechuguita.service;

import java.util.List;

import com.lechuguita.entities.Pedido;

public interface PedidoService {

	public void nuevoPedido();
	
	public List<Pedido> listadoPedidos();
}
