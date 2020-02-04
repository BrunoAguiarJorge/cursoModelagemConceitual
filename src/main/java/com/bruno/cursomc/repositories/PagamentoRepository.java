package com.bruno.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bruno.cursomc.domain.Pagamento;

// esse repositorio vai fazer busca apagar inserir item no categoria.
@Repository
public interface PagamentoRepository extends JpaRepository<Pagamento, Integer>{
	
}
