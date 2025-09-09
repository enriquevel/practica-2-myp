package myp.practica2.pizza;

/**
 * Enumeración que representa los tipos posibles de masa con los que se preparan las pizzas.
 */
public enum Dough {

	/** La masa napolitana. */
	NAPOLITAN,

	/** La masa romana. */
	ROMAN,

	/** La masa americana. */
	AMERICAN;

	public static Dough get(int choice) {
		return switch (choice) {
			case 1 -> NAPOLITAN;
			case 2 -> ROMAN;
			case 3 -> AMERICAN;
			default -> throw new IllegalArgumentException("Invalid dough choice: " + choice);
		};
	}
}
