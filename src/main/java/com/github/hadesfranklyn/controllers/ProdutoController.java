package com.github.hadesfranklyn.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.hadesfranklyn.entities.Produto;
import com.github.hadesfranklyn.repositories.ProdutoRepository;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/produto")
@AllArgsConstructor
public class ProdutoController {

	private final ProdutoRepository repository;

	

	@GetMapping("/listarTodos")
	public ResponseEntity<List<Produto>> listarTodos() {
		return ResponseEntity.ok(repository.findAll());
	}
	
	@PostMapping("/salvar")
	public ResponseEntity<Produto> salvar(@RequestBody Produto produto){
		return ResponseEntity.ok(repository.save(produto));
	}
}
