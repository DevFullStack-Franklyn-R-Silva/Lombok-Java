package com.github.hadesfranklyn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.hadesfranklyn.entities.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer>{

}
