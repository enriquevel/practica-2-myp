package myp.practica2.pizza;

public class MargheritaPizza extends Pizza {

	public MargheritaPizza(Dough dough) {
		super(,,,,, dough);
	}

	/**
	 *
	 */
	@Override
	protected void addCheese() {

	}

	/**
	 *
	 */
	@Override
	protected void addProtein() {
		System.out.println("No se agregó ninguna proteína.");
	}
}
