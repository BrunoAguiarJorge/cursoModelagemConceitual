package com.bruno.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bruno.cursomc.domain.Pedido;
import com.bruno.cursomc.repositories.PedidoRepository;
import com.bruno.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {
	
	
	// conecta o repository to services/injecao de dependencia 
	@Autowired
	private PedidoRepository repo;
	
	// busca categoria por codigo
	public Pedido buscar(Integer id) {
		Optional<Pedido> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto nao encontrado! Id: " + id + ", tipo: " + Pedido.class.getName()));
		
	}
}
