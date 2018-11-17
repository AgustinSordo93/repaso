package com.capacitacion.test.backend.services;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.capacitacion.test.backend.entity.Cliente;
import com.capacitacion.test.backend.entity.TipoContacto;


public interface TipoContactoService {
	
	public List<TipoContacto> getAll();
	public TipoContacto getById(Long id);
	public TipoContacto save(TipoContacto tipoContacto);
	public TipoContacto delete (Long id);
}
