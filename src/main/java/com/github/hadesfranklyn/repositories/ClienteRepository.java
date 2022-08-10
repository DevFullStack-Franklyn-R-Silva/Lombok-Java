package com.github.hadesfranklyn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.hadesfranklyn.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
