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

	/**
	 * Devuelve el tipo de masa correspondiente al número recibido.
	 * @param choice el número del tipo de masa que se desea.
	 * @return el tipo de masa correspondiente al número recibido.
	 * @throws IllegalArgumentException si el número es menor a 1 o mayor a 3.
	 */
	public static Dough get(int choice) {
		return switch (choice) {
			case 1 -> NAPOLITAN;
			case 2 -> ROMAN;
			case 3 -> AMERICAN;
			default -> throw new IllegalArgumentException("Eleccion de masa invalida: " + choice);
		};
	}
}
