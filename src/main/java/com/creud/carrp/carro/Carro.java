package com.creud.carrp.carro;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tipo")
public class Carro {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cd_tipo;
	private String nm_carro;

	public Carro() {
	}
	public Carro(String nome) {
		setNm_carro(nome);
	}

	public Integer getCd_carro() {
		return cd_tipo;
	}

	public void setCd_carro(Integer cd_carro) {
		this.cd_tipo = cd_carro;
	}

	public String getNm_carro() {
		return nm_carro;
	}

	public void setNm_carro(String nm_carro) {
		this.nm_carro = nm_carro;
	}
}
