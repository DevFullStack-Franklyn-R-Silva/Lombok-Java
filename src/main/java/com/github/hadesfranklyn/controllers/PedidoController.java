package com.github.hadesfranklyn.controllers;

import java.util.List;
import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.hadesfranklyn.entities.Pedido;
import com.github.hadesfranklyn.repositories.PedidoRepository;

import lombok.AllArgsConstructor;
import lombok.NonNull;

@RestController
@RequestMapping("/api/pedido")
@AllArgsConstructor
public class PedidoController {

	private final PedidoRepository repository;

	

	@GetMapping("/listarTodos")
	public ResponseEntity<List<Pedido>> listarTodos() {
		return ResponseEntity.ok(repository.findAll());
	}

	@PostMapping("/salvar")
	public ResponseEntity<Pedido> salvar(@RequestBody @NonNull Pedido pedido) {

		if (pedido.getId() == null || pedido.getId().isEmpty()) {
			pedido.setId(UUID.randomUUID().toString());
		}

		return ResponseEntity.ok(repository.save(pedido));
	}
}
