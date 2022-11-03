package com.creud.carrp.carro;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventarioRepository extends CrudRepository<Inventario, Integer> {

	@Query(value = "SELECT i.qt_carros, i.vl_valor, t.cd_tipo FROM inventario i JOIN tipo t ON t.cd_tipo = i.cd_tipo", nativeQuery = true)
	List<Inventario> findAllResume();
}
