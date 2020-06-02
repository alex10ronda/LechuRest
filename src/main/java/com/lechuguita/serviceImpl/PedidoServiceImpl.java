package com.lechuguita.serviceImpl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.atomic.DoubleAdder;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lechuguita.dao.PedidoRepository;
import com.lechuguita.dao.ProductoRepository;
import com.lechuguita.dto.PedidoDTO;
import com.lechuguita.entities.ContenidoPedido;
import com.lechuguita.entities.ContenidoPedidoPK;
import com.lechuguita.entities.Pedido;
import com.lechuguita.entities.Producto;
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
	
	@Autowired
	private ProductoRepository productoRepo;
	
	
	public void crearPedido(PedidoDTO nuevoPedido) {
		
		DoubleAdder adder =  new DoubleAdder();
		
		Pedido pedido = new Pedido();
		pedido.setId(nuevoPedido.getId());
		pedido.setCliente(nuevoPedido.getCliente());;
		pedido.setFecha(nuevoPedido.getFecha());
		
		Set<ContenidoPedido> lista = new HashSet<>();
		
		
		nuevoPedido.getListaProductos().stream().forEach(p -> {
			
			ContenidoPedido elemento = new ContenidoPedido();
			
			Producto producto = productoRepo.findById(p.getId()).get();
			
			adder.add(p.getCantidad() * producto.getPrecio());
						
			elemento.setProducto(producto);
			elemento.setCantidad(p.getCantidad());
			elemento.setPedido(pedido);
			lista.add(elemento);
			
		});
		
		
		pedido.setImporte(adder.doubleValue());
		pedido.setContenido(lista);
		
		pedidoRepo.saveAndFlush(pedido);
	}



	public List<PedidoDTO> listadoPedidos() {
		
		List<Pedido> listaPedidoBD = pedidoRepo.findAll();
		
		List<PedidoDTO> listaPedidos = new ArrayList<PedidoDTO>(listaPedidoBD.stream().map(p -> new PedidoDTO(
				p.getId(),
				p.getCliente(),
				p.getImporte(),
				p.getFecha(),
				p.getResumenProductos())).collect(Collectors.toList()));
		
		
		return listaPedidos;
	}

}
