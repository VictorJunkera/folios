package com.pruebas.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Producto {
@Id
private Integer id_producto;
@Column
private String nombre;
@Column
private Float valor_venta;
@Column
private Float valor_compra;
@Column
private Integer codigo_proovedor;
public Integer getId_producto() {
	return id_producto;
}
public void setId_producto(Integer id_producto) {
	this.id_producto = id_producto;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public Float getValor_venta() {
	return valor_venta;
}
public void setValor_venta(Float valor_venta) {
	this.valor_venta = valor_venta;
}
public Float getValor_compra() {
	return valor_compra;
}
public void setValor_compra(Float valor_compra) {
	this.valor_compra = valor_compra;
}
public Integer getCodigo_proovedor() {
	return codigo_proovedor;
}
public void setCodigo_proovedor(Integer codigo_proovedor) {
	this.codigo_proovedor = codigo_proovedor;
}


}
