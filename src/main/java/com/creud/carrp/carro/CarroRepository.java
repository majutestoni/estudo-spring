package com.creud.carrp.carro;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarroRepository extends CrudRepository<Carro, Integer> {

	@Query(value= "SELECT * FROM tipo WHERE ds_descricao LIKE %:a%", nativeQuery = true)
	List<Carro> findByDescricao(String a);
}
