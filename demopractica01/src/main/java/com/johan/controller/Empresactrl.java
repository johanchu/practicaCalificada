package com.johan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.johan.model.Empresa;
import com.johan.service.EmpresaService;



@RestController
@RequestMapping(value="/api/empresa")
public class Empresactrl {
	@Autowired
	EmpresaService empresaService;
	
	@GetMapping("/all")//consulta
	protected List<Empresa> allempresa() {
		return empresaService.findAllEmpresa();
	}
	@GetMapping("/ifexit")//consulta
	protected boolean isExistEmpresa(@RequestBody Empresa empresa) {
		return empresaService.isEmpresaExist(empresa);
	}
	
	@PostMapping("/save")//save o insert
	protected void save(@RequestBody Empresa empresa) {
		if(empresaService.isEmpresaExist(empresa)) {
			empresaService.updateEmpresa(empresa);
			System.out.println("El usuario ya existe");
		}else {
			empresaService.saveEmpresa(empresa);
			System.out.println("no existe el usuario");
		}
		//return "welcome a spring boot";
	}
	
	@PutMapping("/update")//update
	protected String update() {
		return "welcome a spring boot";
	}
	@PutMapping("/delete")
	protected String delete() {
		return "welcome a spring boot";
	}
}
