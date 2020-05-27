package com.lechuguita.entities;

import java.sql.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="PEDIDO")
public class Pedido {
	
	@Id
    @GeneratedValue
    @Column(name="ID_PEDIDO")
    private int id;
     
    @Column(name="NOMBRE_CLIENTE")
    private String cliente;
     
    @Column(name="FECHA")
    private Date fecha;
    
    @Column(name="IMPORTE")
    private Double importe;
    
    @OneToMany(mappedBy="produto")
    private Set<Producto> productos;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Double getImporte() {
		return importe;
	}

	public void setImporte(Double importe) {
		this.importe = importe;
	}

	public Set<Producto> getContenido() {
		return productos;
	}

	public void setContenido(Set<Producto> producto) {
		this.productos = producto;
	}
	
	public Pedido(int id, String cliente, Date fecha, Double importe, Set<Producto> productos) {
		super();
		this.id = id;
		this.cliente = cliente;
		this.fecha = fecha;
		this.importe = importe;
		this.productos = productos;
	}
    
    

}
