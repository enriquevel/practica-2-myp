package myp.practica2.pizza;

/**
 * Clase que representa una pizza mexicana.
 */
public class MexicanPizza extends Pizza {

	/**
	 * Construye una pizza mexicana con un tipo de masa específico.
	 * @param dough el tipo de masa de la pizza.
	 */
	public MexicanPizza(Dough dough) {
		super("P05", "Mexicana", "Pizza con chorizo, pimientos y queso oaxaca.", 149.0, false, dough);
	}

	/**
	 * Coloca queso oaxaca en la pizza mexicana.
	 */
	@Override
	protected void addCheese() {
		System.out.println("Agregando queso oaxaca.");
	}

	/**
	 * Coloca chorizo y pimientos en la pizza mexicana.
	 */
	@Override
	protected void addProtein() {
		System.out.println("Agregando chorizo y pimientos.");
	}
}
