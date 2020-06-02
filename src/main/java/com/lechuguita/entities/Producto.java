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

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@Entity
@Table(name="PRODUCTO")
public class Producto {

	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_PRODUCTO")
	private Long id;
	
	@Column(name="NOMBRE")
	private String nombre;
	
	@Column(name="PRECIO")
	private double precio;
	
	@Column(name="DESCRIPCION")
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	private String descripcion;
	
	@Column(name="TIPO")
	private String tipo;
	
	@OneToMany(mappedBy="producto",cascade= CascadeType.ALL, fetch = FetchType.EAGER)
	@JsonIgnore
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
	

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Set<ContenidoPedido> getListaPedidos() {
		return listaPedidos;
	}

	public void setListaPedidos(Set<ContenidoPedido> listaPedidos) {
		this.listaPedidos = listaPedidos;
	}

	public Producto(Long id, String nombre, double precio, String descripcion, String tipo,
			Set<ContenidoPedido> listaPedidos) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
		this.descripcion = descripcion;
		this.tipo = tipo;
		this.listaPedidos = listaPedidos;
	}

	public Producto() {
		super();
	}

	
	
	
	
	
}
