package com.lechuguita.entities;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

@Entity
@Table(name="CONTENIDO_PEDIDO")
public class ContenidoPedido {
	
	@EmbeddedId
	private ContenidoPedidoPK pk;
	
	@ManyToOne
	@MapsId("pedidoId")
	@JoinColumn(name="ID_PEDIDO")
	private Pedido pedido;
	
	
	@ManyToOne
	@MapsId("productoId")
	@JoinColumn(name="ID_PRODUCTO")
	private Producto producto;
	
	@Column(name="IMPORTE")
	private Double importe;

	public ContenidoPedidoPK getPk() {
		return pk;
	}

	public void setPk(ContenidoPedidoPK pk) {
		this.pk = pk;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public Double getImporte() {
		return importe;
	}

	public void setImporte(Double importe) {
		this.importe = importe;
	}
	
	
	

}
