package com.lechuguita.dto;

import java.sql.Date;
import java.util.List;

import com.lechuguita.model.ProductoModel;
import com.sun.istack.NotNull;

public class PedidoDTO {
	
	private Long id;
	private String cliente;
	private double importe;
	private Date fecha;
	private List<ProductoModel> listaProductos;
	
	
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
	public List<ProductoModel> getListaProductos() {
		return listaProductos;
	}
	public void setListaProductos(List<ProductoModel> listaProductos) {
		this.listaProductos = listaProductos;
	}
	
	public PedidoDTO(Long id, String cliente, double importe, Date fecha, List<ProductoModel> listaProductos) {
		super();
		this.id = id;
		this.cliente = cliente;
		this.importe = importe;
		this.fecha = fecha;
		this.listaProductos = listaProductos;
	}
	
	public PedidoDTO() {
		super();
	}
	

}
