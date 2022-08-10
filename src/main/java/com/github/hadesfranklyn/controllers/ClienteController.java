package com.github.hadesfranklyn.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.hadesfranklyn.entities.Cliente;
import com.github.hadesfranklyn.repositories.ClienteRepository;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("api/cliente")
@AllArgsConstructor
public class ClienteController {

	private final ClienteRepository repository;

	

	@GetMapping
	public ResponseEntity<List<Cliente>> listarTodos() {
		return ResponseEntity.ok(repository.findAll());
	}
	
	@PostMapping("/salvar")
	public ResponseEntity<Cliente> salvar(@RequestBody Cliente cliente){
		return ResponseEntity.ok(repository.save(cliente));
	}
	
}
