package myp.practica2;

import myp.practica2.robot.Robot;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Practica2 {
	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);

		Robot robot = new Robot();
	
		try{
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
					case 3:
						robot.takeIceCreamOrder();
						break;
					case 4:
						robot.confirmOrder();
						break;
					case 5: 
						robot.cancelOrder();
						break;
					case 6:
						robot.prepareOrder();
						break;
					case 7:
						robot.deliverOrder();
						break;
					case 0:
						System.out.println("Vuelve pronto.");
						System.exit(0);
				}
			}
		}catch(InputMismatchException ime){
			System.out.println("ERROR: Entrada invalida.");
		}
	}

	/**
	 * Metodo auxiliar que imprime el menu principal de opciones.
	 */
	private static void printOptions() {
		System.out.println("(1). Llamar robot.");
		System.out.println("(2). Ordenar pizza.");
		System.out.println("(3). Ordenar helado.");
		System.out.println("(4). Confirmar orden.");
		System.out.println("(5). Cancelar orden.");
		System.out.println("(6). Preparar orden");
		System.out.println("(7). Solicitar entrega de orden.");
		System.out.println("(0). Salir.");
	}
}