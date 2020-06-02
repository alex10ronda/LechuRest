package com.lechuguita.service;

import java.util.List;

import com.lechuguita.dto.PedidoDTO;

public interface PedidoService {

	
	public List<PedidoDTO> listadoPedidos();
	
	public void crearPedido(PedidoDTO pedido);
}
