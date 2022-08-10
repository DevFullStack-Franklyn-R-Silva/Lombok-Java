package com.github.hadesfranklyn.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity(name = "pedido")
@Data
public class Pedido {

	@Id
	private String id;

	@ManyToOne(cascade = CascadeType.ALL)
	private Cliente cliente;

	@OneToMany(cascade = CascadeType.ALL)
	private List<PedidoItem> itens;

}
