package com.capacitacion.test.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capacitacion.test.backend.entity.Contacto;
@Repository
public interface ContactoRepository extends JpaRepository<Contacto, Long> {

}
