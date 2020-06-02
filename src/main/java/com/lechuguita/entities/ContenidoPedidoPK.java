package com.lechuguita.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ContenidoPedidoPK implements Serializable{

	@Column(name="ID_PEDIDO")
	private Long ID_PEDIDO;
	
	@Column(name="ID_PRODUCTO")
	private Long ID_PRODUCTO;

	public Long getID_PEDIDO() {
		return ID_PEDIDO;
	}

	public void setID_PEDIDO(Long iD_PEDIDO) {
		ID_PEDIDO = iD_PEDIDO;
	}

	public Long getID_PRODUCTO() {
		return ID_PRODUCTO;
	}

	public void setID_PRODUCTO(Long iD_PRODUCTO) {
		ID_PRODUCTO = iD_PRODUCTO;
	}


	
	
}
