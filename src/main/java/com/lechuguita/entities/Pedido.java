package com.lechuguita.entities;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="PEDIDO")
public class Pedido {


	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_PEDIDO")
	private Long id;
	
	@Column(name="NOMBRE_CLIENTE")
	private String cliente;
	
	@Column(name="IMPORTE")
	private double importe;
	
	@Column(name="FECHA")
	private Date fecha;
	
	@OneToMany(mappedBy="producto")
	private Set<ContenidoPedido> listaProductos = new HashSet<ContenidoPedido>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	

	public Set<ContenidoPedido> getProductos() {
		return listaProductos;
	}

	public void setProductos(Set<ContenidoPedido> productos) {
		this.listaProductos = productos;
	}

	public Pedido(String cliente, double importe, Date fecha) {
		super();
		this.cliente = cliente;
		this.importe = importe;
		this.fecha = fecha;
	}
	
	
	
}
