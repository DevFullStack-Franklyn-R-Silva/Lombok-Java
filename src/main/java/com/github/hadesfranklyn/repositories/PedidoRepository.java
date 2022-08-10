package com.github.hadesfranklyn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.hadesfranklyn.entities.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, String> {

	
}
