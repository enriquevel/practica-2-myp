package myp.practica2.pizza;

/**
 * Clase que representa una pizza de pepperoni.
 */
public class PepperoniPizza extends Pizza {

	/**
	 * Construye una pizza de pepperoni con un tipo de masa específico.
	 * @param dough el tipo de masa de la pizza.
	 */
	public PepperoniPizza(Dough dough) {
		super("P01", "Pepperoni", "Pizza de pepperoni con queso manchego.", 119.0, false, dough);
	}

	/**
	 * Coloca queso manchego en la pizza de pepperoni.
	 */
	@Override
	protected void addCheese() {
		System.out.println("Colocando queso manchego.");
	}

	/**
	 * Coloca pepperoni en la pizza de pepperoni.
	 */
	@Override
	protected void addProtein() {
		System.out.println("Colocando pepperoni.");
	}
}
