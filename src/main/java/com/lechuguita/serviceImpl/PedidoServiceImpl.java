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
		
		//Se crea un nuevo pedido
		Pedido pedido = new Pedido();
		pedido.setId(nuevoPedido.getId());
		pedido.setCliente(nuevoPedido.getCliente());;
		pedido.setFecha(nuevoPedido.getFecha());
		
		List<ContenidoPedido> lista = new ArrayList();
		
		//Se recorre la lista de productos recibidos en el DTO
		nuevoPedido.getListaProductos().stream().forEach(p -> {
			
			ContenidoPedido elemento = new ContenidoPedido();
			ContenidoPedidoPK pk = new ContenidoPedidoPK();
			
			//Se buscan los productos en BBDD
			Producto producto = productoRepo.findById(p.getId()).get();
			
			//Se crea el componente contenido
			pk.setProducto(producto);
			pk.setPedido(pedido);
			elemento.setCantidad(p.getCantidad());
			elemento.setPk(pk);

			lista.add(elemento);
			
			//Suma de los importes
			adder.add(p.getCantidad() * producto.getPrecio());
			
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
