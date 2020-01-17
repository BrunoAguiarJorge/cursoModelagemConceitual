package com.bruno.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bruno.cursomc.domain.Categoria;

// esse repositorio vai fazer busca apagar inserir item no categoria.
@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer>{
	
}
