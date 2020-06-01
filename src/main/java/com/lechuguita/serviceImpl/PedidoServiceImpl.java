package com.lechuguita.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lechuguita.dao.PedidoRepository;
import com.lechuguita.entities.Pedido;
import com.lechuguita.model.ProductoModel;
import com.lechuguita.service.PedidoService;

/**
 * @author Alejandro Ruiz Garcia
 * 
 * Servicio que trata las operaciones de Pedidos
 *
 */
@Service
public class PedidoServiceImpl implements PedidoService {

	@Autowired
	private PedidoRepository pedidoRepo;
	
	
	public void nuevoPedido() {
		// TODO Auto-generated method stub
		
	}



	public List<Pedido> listadoPedidos() {
		
		List<Pedido> listaPedidos = pedidoRepo.findAll();
		
		//Recorremos los pedidos
		listaPedidos.stream().forEach(p -> {
			
			//Se obtiene el contenido de cada pedido y se recorre
			p.getContenido().stream().forEach(con ->{
				p.getListaProductos().add(new ProductoModel(con.getProducto().getNombre(), con.getCantidad()));
			});
		});
		
		return listaPedidos;
	}

}
