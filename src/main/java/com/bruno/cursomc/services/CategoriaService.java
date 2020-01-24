package com.bruno.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bruno.cursomc.domain.Categoria;
import com.bruno.cursomc.repositories.CategoriaRepository;
import com.bruno.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {
	
	
	// conecta o repository to services/injecao de dependencia 
	@Autowired
	private CategoriaRepository repo;
	
	// busca categoria por codigo
	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto nao encontrado! Id: " + id + ", tipo: " + Categoria.class.getName()));
		
	}
}
