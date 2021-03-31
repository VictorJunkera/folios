package com.pruebas.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Proveedores {
@Id	
private Integer id_proveedor;
@Column
private String nombre;
@Column
private String apellidos;
@Column
private String dirección;
@Column
private String teléfono;
@Column
private String correo;
public Integer getId_proveedor() {
	return id_proveedor;
}
public void setId_proveedor(Integer id_proveedor) {
	this.id_proveedor = id_proveedor;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getApellidos() {
	return apellidos;
}
public void setApellidos(String apellidos) {
	this.apellidos = apellidos;
}
public String getDirección() {
	return dirección;
}
public void setDirección(String dirección) {
	this.dirección = dirección;
}
public String getTeléfono() {
	return teléfono;
}
public void setTeléfono(String teléfono) {
	this.teléfono = teléfono;
}
public String getCorreo() {
	return correo;
}
public void setCorreo(String correo) {
	this.correo = correo;
}

}
