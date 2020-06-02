package com.lechuguita.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

@Entity
@Table(name="CONTENIDO_PEDIDO")
public class ContenidoPedido implements Serializable{

	@EmbeddedId
	private ContenidoPedidoPK pk;
	
	@ManyToOne
	@MapsId("idProducto")
	@JoinColumn(name="ID_PRODUCTO")
	private Producto producto;
	
	@ManyToOne
	@MapsId("idPedido")
	@JoinColumn(name="ID_PEDIDO")
	private Pedido pedido;
	
	@Column(name="CANTIDAD")
	private Integer cantidad;

	public ContenidoPedidoPK getPk() {
		return pk;
	}

	public void setPk(ContenidoPedidoPK pk) {
		this.pk = pk;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	
	
	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	
	
}
