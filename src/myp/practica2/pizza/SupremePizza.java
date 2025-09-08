package myp.practica2.pizza;

/**
 * Clase que representa una pizza suprema.
 */
public class SupremePizza extends Pizza {

	/**
	 * Construye una pizza suprema con un tipo de masa específico.
	 * @param dough el tipo de masa de la pizza.
	 */
	public SupremePizza(Dough dough) {
		super("P03", "Suprema", "Pizza con carne, salchicha y pollo con queso gouda y parmesano.", 199.0, false, dough);
	}

	/**
	 * Coloca queso gouda y parmesano en la pizza suprema.
	 */
	@Override
	protected void addCheese() {
		System.out.println("Agregando queso gouda y parmesano.");
	}

	/**
	 * Coloca carne, salchicha y pollo en la pizza suprema.
	 */
	@Override
	protected void addProtein() {
		System.out.println("Agregando carne, salchicha y pollo.");
	}
}
