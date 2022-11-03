package com.creud.carrp.carro;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "inventario")
public class Inventario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cd_inventario;
	@Column(name = "qt_carros")
	private Integer quantidade;
	@Column(name = "vl_valor")
	private float valor;
	private Integer cd_tipo;

	public Inventario() {

	}

	public Inventario(Integer quantidade, float valor, Integer tipo) {
		super();
		setQuantidade(quantidade);
		setValor(valor);
		setTipo(tipo);
	}

	public Integer getId() {
		return cd_inventario;
	}

	public void setId(Integer id) {
		this.cd_inventario = id;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public Integer getTipo() {
		return cd_tipo;
	}

	public void setTipo(Integer tipo) {
		this.cd_tipo = tipo;
	}

}
