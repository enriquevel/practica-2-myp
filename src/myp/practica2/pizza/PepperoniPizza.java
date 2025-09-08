package myp.practica2.pizza;

public class PepperoniPizza extends Pizza {

	public PepperoniPizza(Dough dough) {
		super("P01", "Pepperoni", "Pizza de pepperoni con queso mozzarella.", 99.0, false, dough);
	}

	/**
	 *
	 */
	@Override
	protected void addCheese() {
		System.out.println("Agregando queso mozzarella.");
	}

	/**
	 *
	 */
	@Override
	protected void addProtein() {
		System.out.println("Agregando pepperoni.");
	}
}
