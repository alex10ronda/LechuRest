package com.lechuguita.entities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="PRODUCTO")
public class Producto {
	
	@Id
    @GeneratedValue
    @Column(name="ID_PRODUCTO")
    private Integer id;
     
    @Column(name="NOMBRE")
    private String nombre;
     
    @Column(name="DESCRIPCION")
    private String descripcion;
    
    @Column(name="PRECIO")
    private Double precio;
    
    @OneToMany(mappedBy="pedido")
    private Set<Pedido> pedidos;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Set<Pedido> getPedido() {
		return pedidos;
	}

	public void setPedido(Set<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

	public Producto(int id, String nombre, String descripcion, Double precio, Set<Pedido> pedidos) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.pedidos = pedidos;
	}
    
    

}
