package com.creud.carrp.carro;

import java.util.List;
import java.util.Scanner;

import org.springframework.stereotype.Service;

@Service
public class InventarioService {
	private final InventarioRepository inventarioRepository;
	private boolean bb = true;

	public InventarioService(InventarioRepository v) {
		this.inventarioRepository = v;
	}

	public void inicializar(Scanner scan) {
		while (bb) {
			System.out.println("Selecione");
			int a = scan.nextInt();
			switch (a) {
			case 1:
				add(scan);
				break;
			case 2:
				relatorio();
				break;
			case 3:
				quantidade();
				break;

			default:
				bb = false;
				break;
			}
		}
	}

	private void add(Scanner scan) {
		System.out.println("quantidade");
		Integer q = scan.nextInt();
		System.out.println("Valor");
		float f = scan.nextFloat();
		System.out.println("tipo");
		Integer i = scan.nextInt();

		Inventario inventario = new Inventario(q, f, i);
		inventarioRepository.save(inventario);
		System.out.println("salvo");

	}
	
	private void relatorio() { 
		List<Inventario> a = inventarioRepository.findAllResume();
		a.forEach(b -> System.out.println(b.toString()));
	}
	
	private float quantidade() {
		System.out.println(inventarioRepository.totalCarros());
		return inventarioRepository.totalCarros();
	}

}
