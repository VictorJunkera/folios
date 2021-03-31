package com.pruebas.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.pruebas.dao.ClienteDAO;
import com.pruebas.models.Cliente;

import ch.qos.logback.core.net.server.Client;

@RestController
@RequestMapping("cliente")
public class ClienteREST {
	@Autowired
	private ClienteDAO ClienteDAO;

	@PostMapping("cliente")
	public void insertar_cliente(@RequestBody Cliente cliente) {
		ClienteDAO.save(cliente);
	}

	@GetMapping("cliente")
	public List<Cliente> listar_cliente() {
		return ClienteDAO.findAll();

	}
	@DeleteMapping("cliente/{id}")
	public void eliminar_cliente (@PathVariable("id")Integer id) {
		ClienteDAO.deleteById(id);
	}
	@PutMapping("cliente")
	public void actualizar_cliente(@RequestBody Cliente cliente ) {
		ClienteDAO.save(cliente);
	}
	

}
