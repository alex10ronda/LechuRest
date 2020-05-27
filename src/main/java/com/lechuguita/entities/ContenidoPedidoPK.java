package com.lechuguita.entities;

import javax.persistence.Embeddable;

@Embeddable
public class ContenidoPedidoPK {
	
	private Pedido pedidoId;
	
	private Producto productoId;

	public Pedido getPedido() {
		return pedidoId;
	}

	public void setPedido(Pedido pedidoId) {
		this.pedidoId = pedidoId;
	}

	public Producto getProducto() {
		return productoId;
	}

	public void setProducto(Producto productoId) {
		this.productoId = productoId;
	}
	
	

}
