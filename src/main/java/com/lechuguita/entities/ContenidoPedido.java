package com.lechuguita.entities;

import java.io.Serializable;

import javax.persistence.AssociationOverride;
import javax.persistence.AssociationOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

@Entity
@Table(name="CONTENIDO_PEDIDO")
@AssociationOverrides({
	@AssociationOverride(name="pk.producto", joinColumns = @JoinColumn(name="ID_PRODUCTO")),
	@AssociationOverride(name="pk.pedido", joinColumns = @JoinColumn(name="ID_PEDIDO"))
})
public class ContenidoPedido implements Serializable{

	@EmbeddedId
	private ContenidoPedidoPK pk;
	
	
	@Column(name="CANTIDAD")
	private Integer cantidad;

	public ContenidoPedidoPK getPk() {
		return pk;
	}

	public void setPk(ContenidoPedidoPK pk) {
		this.pk = pk;
	}


	
	
	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	
	
}
