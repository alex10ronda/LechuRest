package com.lechuguita.entities;

import java.sql.Date;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
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

import com.lechuguita.model.ProductoModel;

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
	
	
	/**
	 * Devuelve toda la relacion de pedidos y productos
	 * De momento no queremos que se devuelva
	 */
	@OneToMany(fetch = FetchType.EAGER, mappedBy="pk.pedido", cascade=CascadeType.ALL)
	private List<ContenidoPedido> contenido = new ArrayList<ContenidoPedido>();
	
	
	
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
	



	public List<ContenidoPedido> getContenido() {
		return contenido;
	}

	public void setContenido(List<ContenidoPedido> contenido) {
		this.contenido = contenido;
	}

	public Pedido(Long id, String cliente, double importe, Date fecha) {
		super();
		this.id = id;
		this.cliente = cliente;
		this.importe = importe;
		this.fecha = fecha;

	}

	public Pedido() {
		super();
	}


	public List<ProductoModel> getResumenProductos(){
		
		List<ProductoModel> listaProductos = new ArrayList<>();
		
		this.contenido.forEach(c -> {
			listaProductos.add(new ProductoModel(c.getPk().getProducto().getId(),c.getPk().getProducto().getNombre(), c.getCantidad()));
		});
		
		return listaProductos;
	}
	
	
	
}
