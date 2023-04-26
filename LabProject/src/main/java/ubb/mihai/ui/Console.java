package ubb.mihai.ui;

import java.util.Scanner;

import ubb.mihai.service.CakeService;

public class Console {
	private CakeService service;

	public Console(CakeService service) {
		this.service = service;
	}

	public void printMenu() {
		System.out.println("1. Add");
		System.out.println("2. Save");
	}

	public void add() {
		Scanner scanner = new Scanner(System.in);
		String layers = scanner.next();
		service.add(layers);
	}

	public void save() {
		service.save();
	}
}
