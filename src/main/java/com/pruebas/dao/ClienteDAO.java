package com.pruebas.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pruebas.models.Cliente;

public interface ClienteDAO extends JpaRepository<Cliente, Integer>{

}
