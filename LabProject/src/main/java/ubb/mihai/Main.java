package ubb.mihai;

import ubb.mihai.service.CakeService;
import ubb.mihai.service.CakeServiceProxy;
import ubb.mihai.ui.Console;
import ubb.mihai.utils.CakeBuilder;

public class Main {
	public static void main(String[] args) {
		CakeBuilder cakeBuilder = new CakeBuilder();
		CakeService cakeService = new CakeServiceProxy(cakeBuilder);
		Console console = new Console(cakeService);
		console.start();
		console.printMenu();
	}
}