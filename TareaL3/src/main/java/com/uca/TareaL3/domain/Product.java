package com.uca.TareaL3.domain;

public class Product {
	private Integer id;
	private String nombre;
	private String cantidad;
	public Integer getId() {
		return id;
	}
	
	
	public Product() {}
	
	
	public Product(Integer id, String nombre, String cantidad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.cantidad = cantidad;
	}





	public void setId(Integer id) {
		this.id = id;
	}
	public String getCantidad() {
		return cantidad;
	}
	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	
}
