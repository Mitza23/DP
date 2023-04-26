package ubb.mihai.ui;

import java.util.Scanner;

import ubb.mihai.entities.Cake;
import ubb.mihai.repository.FileCakeRepository;
import ubb.mihai.repository.JSONCakeRepository;
import ubb.mihai.repository.Repository;
import ubb.mihai.service.CakeService;

public class Console {
	private CakeService service;
	private Scanner scanner = new Scanner(System.in);

	public Console(CakeService service) {
		this.service = service;
	}

	public void start() {
		System.out.println("What kind of repository do you want?");
		System.out.println("1. Normal text");
		System.out.println("2. JSON");
		Repository<Cake> repository;
		int type = scanner.nextInt();
		switch (type) {
			case 1:
				repository = new FileCakeRepository();
				break;
			case 2:
				repository = new JSONCakeRepository();
				break;
			default:
				repository = new FileCakeRepository();
		}
		service.setRepository(repository);
	}

	public void printMenu() {
		boolean done = false;
		while (! done) {
			System.out.println("1. Add");
			System.out.println("2. Save");
			scanner = new Scanner(System.in);
			int command = scanner.nextInt();
			switch (command) {
				case 1:
					add();
					break;
				case 2:
					save();
					break;
				default:
					done = true;
			}
		}
	}

	public void add() {
		scanner = new Scanner(System.in);
		String layers = scanner.nextLine();
		service.add(layers);
	}

	public void save() {
		service.save();
	}
}
