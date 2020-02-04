package com.bruno.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bruno.cursomc.domain.Cliente;
import com.bruno.cursomc.repositories.ClienteRepository;
import com.bruno.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {
	
	
	// conecta o repository to services/injecao de dependencia 
	@Autowired
	private ClienteRepository repo;
	
	// busca Cliente por codigo
	public Cliente buscar(Integer id) {
		Optional<Cliente> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto nao encontrado! Id: " + id + ", tipo: " + Cliente.class.getName()));
		
	}
}
