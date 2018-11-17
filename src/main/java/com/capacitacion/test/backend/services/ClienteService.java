package com.capacitacion.test.backend.services;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.capacitacion.test.backend.entity.Cliente;

public interface ClienteService {

	public List<Cliente> getAll();
	public Cliente getById(Long id);
	public Cliente save(Cliente Cliente);
	public Cliente delete (Long id);
}
