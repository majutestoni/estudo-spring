package com.creud.carrp.carro;

import java.util.Scanner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CarroApplication implements CommandLineRunner {
	private final CarroService carroService;
	private final InventarioService inventarioService;
	private boolean aa = true;

	public CarroApplication(CarroService c, InventarioService s) {
		carroService = c;
		inventarioService = s;
	}

	public static void main(String[] args) {
		SpringApplication.run(CarroApplication.class, args);
	}

	public void run(String... args) throws Exception {
		Scanner scan = new Scanner(System.in);
		while (aa) {
			System.out.println("escolha");
			int escolha = scan.nextInt();

			switch (escolha) {
			case 1:
				carroService.inicializar(scan);
				break;
			case 2:
				inventarioService.inicializar(scan);;
				break;

			default:
				aa = false;
				break;
			}
		}
	}

}
