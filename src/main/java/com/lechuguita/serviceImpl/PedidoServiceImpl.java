package com.lechuguita.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lechuguita.dao.PedidoRepository;
import com.lechuguita.entities.Pedido;
import com.lechuguita.service.PedidoService;

@Service
public class PedidoServiceImpl implements PedidoService {

	@Autowired
	private PedidoRepository pedidoRepo;
	
	
	public void nuevoPedido() {
		// TODO Auto-generated method stub
		
	}


	public List<Pedido> listadoPedidos() {
		
		List<Pedido> listaPedidos = pedidoRepo.findAll();
		
		listaPedidos.stream().forEach(p -> {
			p.getProductos().stream().forEach(l ->{
				System.out.println(l.getProducto().getNombre());
			});
		});
		
		return pedidoRepo.findAll();
	}

}
