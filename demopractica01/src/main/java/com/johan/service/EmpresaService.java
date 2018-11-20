package com.johan.service;

import java.util.List;

import com.johan.model.Empresa;

public interface EmpresaService {
Empresa findById(long id);
	
	Empresa findByRazon_social(String Razon_social);
	
	void saveEmpresa(Empresa empresa);
	
	void updateEmpresa(Empresa empresa);
	
	void deleteEmpresaById(long id);

	List<Empresa> findAllEmpresa(); 
	
	void deleteAllEmpresa();
	
	public boolean isEmpresaExist(Empresa empresa);
}
