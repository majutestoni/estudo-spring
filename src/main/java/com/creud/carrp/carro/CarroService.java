package com.creud.carrp.carro;

import java.util.Optional;
import java.util.Scanner;

import org.springframework.stereotype.Service;

@Service
public class CarroService {
	private final CarroRepository carroRepository;
	private boolean aa = true;

	public CarroService(CarroRepository c) {
		carroRepository = c;
	}

	public void inicializar(Scanner scan) {
		while (aa) {
			System.out.println("Digite o que deseja");
			int escolha = scan.nextInt();

			switch (escolha) {
			case 1:
				adicionar(scan);
				break;
			case 2:
				vizualizar();
				
				break;
			case 3:
				delete(scan);
				
				break;
			default:
				aa = false;
				break;
			}

		}
	}

	private void adicionar(Scanner scan) {
		System.out.println("Defina o nome");
		String nome = scan.next();

		Carro carro = new Carro(nome);

		carroRepository.save(carro);

		System.out.println("aaaa");
		System.out.println("Salvo");
	}

	private void vizualizar() {

		Iterable<Carro> carro = carroRepository.findAll();
		carro.forEach(a -> System.out.println(a.getCd_carro() + " - " + a.getNm_carro()));
	}
	
	private void delete(Scanner scan) {
		System.out.println("informe o id");
		int a = scan.nextInt();
		Carro b = new Carro();
		b.setCd_carro(a);
		carroRepository.delete(b);
	}

}
