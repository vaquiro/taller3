package com.clases;

import java.util.List;

public class Clientes {
	private String tipoDocumento;
	private String documento;
	private String nombre;
	private String telefono;
	private String direccion;
	private List<Producto> productos;

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

	public Clientes() {

	}

	public Clientes(String tipoDocumento, String cedula, String nombre, String telefono, String direccion,
			List<Producto> productos) {
		this.tipoDocumento = tipoDocumento;
		this.documento = cedula;
		this.nombre = nombre;
		this.telefono = telefono;
		this.direccion = direccion;
		this.productos = productos;
	}
}
