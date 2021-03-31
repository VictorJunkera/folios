package com.pruebas.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.print.attribute.standard.DateTimeAtCreation;

@Entity
public class Venta {
@Id
private Integer id_venta;
@Column
private Integer codigo_cliente;
@Column
private String producto;
@Column
private DateTimeAtCreation fecha;
public Integer getId_venta() {
	return id_venta;
}
public void setId_venta(Integer id_venta) {
	this.id_venta = id_venta;
}
public Integer getCodigo_cliente() {
	return codigo_cliente;
}
public void setCodigo_cliente(Integer codigo_cliente) {
	this.codigo_cliente = codigo_cliente;
}
public String getProducto() {
	return producto;
}
public void setProducto(String producto) {
	this.producto = producto;
}
public DateTimeAtCreation getFecha() {
	return fecha;
}
public void setFecha(DateTimeAtCreation fecha) {
	this.fecha = fecha;
}


}
