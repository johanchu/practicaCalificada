package com.johan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.johan.model.Empresa;
@Repository

public interface EmpresaRepository extends JpaRepository<Empresa, Long>{
Empresa findById(long id);
	
	Empresa findByRazon_social(String Razon_social);
}
