package myp.practica2;

import myp.practica2.robot.Robot;
import java.util.Scanner;

public class Practica2 {
	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);

		Robot robot = new Robot();

		while (true) {
			printOptions();
			int option = scanner.nextInt();
			switch (option) {
				case 1:
					robot.call();
					break;
				case 2:
					robot.takePizzaOrder();
					break;

				case 3: // helado
				case 4: // confirmar
				case 5: // cancelar
				case 6: // preparar
					case 7: // recoger orden
				case 0:
					System.out.println("Vuelve pronto.");
					System.exit(0);
			}
		}
	}

	private static void printOptions() {
		System.out.println("(1). Llamar robot.");
		System.out.println("(2). Ordenar pizza.");
		System.out.println();
	}
}