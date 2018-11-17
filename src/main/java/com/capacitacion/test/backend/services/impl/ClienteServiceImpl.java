package com.capacitacion.test.backend.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capacitacion.test.backend.entity.Cliente;
import com.capacitacion.test.backend.entity.TipoContacto;
import com.capacitacion.test.backend.repository.ClienteRepository;
import com.capacitacion.test.backend.repository.TipoContactoRepository;
import com.capacitacion.test.backend.services.ClienteService;
@Service
public class ClienteServiceImpl implements ClienteService{

	@Autowired
	private ClienteRepository clienteRepository;
	
	@Override
	public List<Cliente> getAll() {
		// TODO Auto-generated method stub
		return this.clienteRepository.findAll();
	}

	@Override
	public Cliente getById(Long id) {
		// TODO Auto-generated method stub
		return this.clienteRepository.findById(id).orElse(null);
	}

	@Override
	public Cliente save(Cliente Cliente) {
		// TODO Auto-generated method stub
		return this.clienteRepository.save(Cliente);
	}

	@Override
	public Cliente delete(Long id) {
		Cliente cliente = this.getById(id);
		if (cliente !=null) {

		this.clienteRepository.delete(cliente);	
		}

		return cliente;
	}

}
