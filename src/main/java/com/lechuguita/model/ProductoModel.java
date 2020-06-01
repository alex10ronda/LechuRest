package com.lechuguita.model;

public class ProductoModel {
	
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
	public ProductoModel() {
		super();
	}
	public ProductoModel(String nombre, Integer cantidad) {
		super();
		this.nombre = nombre;
		this.cantidad = cantidad;
	}
	
	
	
	

}
