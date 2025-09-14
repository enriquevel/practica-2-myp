package myp.practica2.robot;

import myp.practica2.icecream.*;
import myp.practica2.pizza.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Clase que representa el estado del robot cuando se encuentra en su estado tomando orden.
 */
public class TakingOrderState implements RobotState {

	/** El robot que se encuentra en su estado tomando orden. */
    private Robot cesarinRobot;


	private final Scanner scanner = new Scanner(System.in);

	/**
	 * Crea el estado que maneja a un robot en estado tomando orden.
	 * @param cesarinRobot el robot a manejar en estado orden.
	 */
    public TakingOrderState(Robot cesarinRobot) {
        this.cesarinRobot = cesarinRobot;
    }

	/**
	 * Intenta llamar al robot para tomar una orden, pero este está en su estado tomando orden.
	 */
	@Override
	public void call() {
        System.out.println("El robot solo puede ser llamado por un cliente a la vez.");
	}

	/**
	 * Toma una orden de pizza del cliente.
	 */
    @Override
    public void takePizzaOrder() {
		StringBuilder sb = new StringBuilder();
		sb.append("Seleccione una pizza:\n")
				.append("(1). Pizza de pepperoni\n")
				.append("(2). Pizza margarita\n")
				.append("(3). Pizza suprema\n")
				.append("(4). Pizza de cuatro quesos\n")
				.append("(5). Pizza mexicana");
		System.out.println(sb.toString());
		int pizzaChoice = scanner.nextInt();

		sb.delete(0, sb.length());
		sb.append("Seleccione el tipo de masa para la pizza:\n")
				.append("(1). Napolitana\n")
				.append("(2). Romana\n")
				.append("(3). Americana\n");
		System.out.println(sb.toString());
		int doughChoice = scanner.nextInt();

		try {
			Dough dough = Dough.get(doughChoice);
			Pizza pizza = createPizza(pizzaChoice, dough);
			cesarinRobot.getCurrentOrder().addPizza(pizza);
			System.out.println("Pizza añadida a la orden.");
		} catch (IllegalArgumentException iae) {
			System.out.println("ERROR: "+ iae.getMessage());
		}
    }

	/**
	 * Método auxiliar que crea una pizza con el tipo de masa especificado por el cliente.
	 * @param choice el tipo de pizza que el cliente escogió.
	 * @param dough el tipo de masa que el cliente escogió.
	 * @throws IllegalArgumentException si la pizza especificada no es parte de las opciones de pizza
	 * o bien si la masa solicitada no es parte de las opciones de masa.
	 * @return el tipo de pizza que el cliente ha escogido.
	 */
	private Pizza createPizza(int choice, Dough dough) {
		return switch (choice) {
			case 1 -> new PepperoniPizza(dough);
			case 2 -> new MargheritaPizza(dough);
			case 3 -> new SupremePizza(dough);
			case 4 -> new FourCheesesPizza(dough);
			case 5 -> new MexicanPizza(dough);
			default -> throw new IllegalArgumentException("Eleccion de pizza invalida: "+ choice);
		};
	}

	/**
	 * Toma una orden de helado del cliente.
	 */
    @Override
    public void takeIceCreamOrder() {
		StringBuilder sb = new StringBuilder();
        sb.append("Seleccione el sabor de su helado:")
				.append("(1). Fresa")
				.append("(2). Vainilla")
				.append("(3). Chocolate");
		System.out.println(sb.toString());
		int flavorChoice = scanner.nextInt();

		IceCream iceCream = getIceCream(flavorChoice);

		Map<String, Integer> decoratingIngredientCount = new HashMap<>();
		for (int i = 1; i <= 8; i ++)
			decoratingIngredientCount.put(getDecoratingIngredient(i, null).getId(), 0);

		sb.delete(0, sb.length());
		sb.append("Seleccione su ingrediente extra: (Máximo 3 de cada uno)")
				.append("(1). Gomitas de gusano")
				.append("(2). Gomitas de panda")
				.append("(3). Gomitas de aro")
				.append("(4). Chispas de chocolate")
				.append("(5). Malvaviscos")
				.append("(6). Fresitas")
				.append("(7). Manguitos")
				.append("(8). Kiwis");

		while (true) {
			System.out.println("¿Agregar un ingrediente extra? (s/n)");
			String choice = scanner.next();

			if (choice.equalsIgnoreCase("n"))
				break;

			System.out.println(sb.toString());
			int ingredientChoice = scanner.nextInt();

			try {
				DecoratingIngredient decorator = getDecoratingIngredient(ingredientChoice, null);
				String id = decorator.getId();

				if (decoratingIngredientCount.get(id) < 3) {
					iceCream = getDecoratingIngredient(ingredientChoice, iceCream);
					decoratingIngredientCount.put(id, decoratingIngredientCount.get(id) + 1);
					System.out.println("Se agregó: " + decorator.getName());
				} else
					System.out.println("No puedes agregar más de 3 " + decorator.getName() + " a tu helado.");

			} catch (IllegalArgumentException iae) {
				System.out.println("ERROR: "+ iae.getMessage());
			}
		}
	}

	/**
	 * Método auxiliar que devuelve un helado del tipo especificado por el cliente.
	 * @param choice el tipo de helado especificado por el cliente.
	 * @throws IllegalArgumentException si el helado especificado no es parte de los ya definidos.
	 * @return un helado del tipo especificado por el cliente
	 */
	private IceCream getIceCream(int choice) {
		return switch (choice) {
			case 1 -> new StrawberryIceCream();
			case 2 -> new VanillaIceCream();
			case 3 -> new ChocolateIceCream();
			default -> throw new IllegalArgumentException("Eleccion de helado invalida: "+ choice);
		};
	}

	/**
	 * Método auxiliar que devuelve un ingrediente decorador para el helado del cliente.
	 * @param choice el ingrediente decorador especificado por el cliente.
	 * @param icecream el helado del cliente.
	 * @throws IllegalArgumentException si el ingrediente extra especificado no es parte de los ya definidos.
	 * @return un ingrediente decorador para el helado del cliente.
	 */
	private DecoratingIngredient getDecoratingIngredient(int choice, IceCream icecream) {
		return switch (choice) {
			case 1 -> new GummyWorms(icecream);
			case 2 -> new GummyPandas(icecream);
			case 3 -> new GummyRings(icecream);
			case 4 -> new ChocolateChips(icecream);
			case 5 -> new Marshmallows(icecream);
			case 6 -> new Strawberries(icecream);
			case 7 -> new Mangoes(icecream);
			case 8 -> new Kiwis(icecream);
			default -> throw new IllegalArgumentException("Eleccion de ingrediente extra invalida: " + choice);
		};
	}

	/**
	 * Intenta preparar la orden de un cliente, pero el robot está en su estado tomando orden.
	 */
    @Override
    public void prepareOrder() {
        System.out.println("Se necesita primero confirmar la orden antes de prepararla.");
    }

	/**
	 * Cancela la orden de un cliente.
	 * El robot pasa de estado "tomando orden" a estado "dormido".
	 */
    @Override
    public void cancelOrder() {
		this.cesarinRobot.getCurrentOrder().clear();
        System.out.println("Cancelando orden.");
        this.cesarinRobot.setState(this.cesarinRobot.getSleepingState());
    }

	/**
	 * Confirma la orden de un cliente.
	 * Si una orden ya ha sido tomada, el robot pasa de estado "tomando orden" a estado "confirmación de orden".
	 */
    @Override
    public void confirmOrder() {
		if (this.cesarinRobot.getCurrentOrder().isEmpty())
			System.out.println("La orden está vacía. Por favor ordena algo antes de confirmar.");
		else {
			System.out.println("La orden ha sido confirmada.");
			this.cesarinRobot.setState(this.cesarinRobot.getOrderConfirmedState());
		}
    }

	/**
	 * Intenta entregar la orden de un cliente, pero el robot está en su estado tomando orden.
	 */
    @Override
    public void deliverOrder() {
        System.out.println("No es posible aún entregar la orden. La orden aún no ha sido preparada.");
    }

	/**
	 * Imprime en terminal la descripcion del estado actual del robot.
	 */
    @Override
	public void description(){
        System.out.println("\n"+ "-----------ESTADO DEL ROBOT: <ESPERANDO PEDIDO>-----------" + "\n");
    }
}