package com.johan.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.johan.model.Empresa;
import com.johan.repository.EmpresaRepository;

public class EmpresaServiceImpl implements EmpresaService{

	
	@Autowired
	EmpresaRepository empresaRepository;
	
	@Override
	public Empresa findById(long id) {
		return empresaRepository.findById(id);
	}

	@Override
	public Empresa findByRazon_social(String Razon_social) {
		return empresaRepository.findByRazon_social(Razon_social);
	}

	@Override
	public void saveEmpresa(Empresa empresa) {
		empresaRepository.save(empresa);
	}

	@Override
	public void updateEmpresa(Empresa empresa) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteEmpresaById(long id) {
		empresaRepository.deleteById(id);
	}

	@Override
	public List<Empresa> findAllEmpresa() {
		return empresaRepository.findAll();
	}

	@Override
	public void deleteAllEmpresa() {
		empresaRepository.deleteAll();
	}

	@Override
	public boolean isEmpresaExist(Empresa empresa) {
		// TODO Auto-generated method stub
		return findByRazon_social(empresa.getRazon_social())!=null;
	}

}