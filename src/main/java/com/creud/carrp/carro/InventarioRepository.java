package com.creud.carrp.carro;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventarioRepository extends PagingAndSortingRepository<Inventario, Integer> {

	@Query(value = "SELECT SUM(i.qt_carros), i.vl_valor, i.cd_inventario, i.cd_tipo FROM inventario i GROUP BY cd_tipo", nativeQuery = true)
	List<Inventario> findAllResume();

	@Query(value = "SELECT SUM(i.qt_carros) FROM inventario i", nativeQuery = true)
	float totalCarros();

	@Query(value = "SELECT * FROM inventario i WHERE cd_tipo = :tipo", nativeQuery = true)
	List<Inventario> findByCdTipo(Integer tipo, Pageable pageable);

}
