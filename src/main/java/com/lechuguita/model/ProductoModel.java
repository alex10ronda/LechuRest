package com.lechuguita.model;

public class ProductoModel {
	
	private Long id;
	private String nombre;
	private Integer cantidad;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public ProductoModel() {
		super();
	}
	public ProductoModel(Long id,String nombre, Integer cantidad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.cantidad = cantidad;
	}
	
	
	
	

}
