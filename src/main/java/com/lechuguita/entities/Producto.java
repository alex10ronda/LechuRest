package com.lechuguita.entities;

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
@Table(name="PRODUCTO")
public class Producto {

	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_PRODUCTO")
	private Long id;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="precio")
	private double precio;
	
	@Column(name="descripcion")
	private String descripcion;
	
	@OneToMany(mappedBy="pedido")
	private Set<ContenidoPedido> listaPedidos = new HashSet<ContenidoPedido>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	

	public Set<ContenidoPedido> getPedidos() {
		return listaPedidos;
	}

	public void setPedidos(Set<ContenidoPedido> pedidos) {
		this.listaPedidos = pedidos;
	}

	public Producto(String nombre, double precio, String descripcion) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.descripcion = descripcion;
	}
	
	
}
