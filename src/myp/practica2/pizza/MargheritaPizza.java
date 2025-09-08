package myp.practica2.pizza;

/**
 * Clase que representa una pizza margarita.
 */
public class MargheritaPizza extends Pizza {

	/**
	 * Construye una pizza margarita con un tipo de masa específico.
	 * @param dough el tipo de masa de la pizza.
	 */
	public MargheritaPizza(Dough dough) {
		super("P02", "Margarita", "Pizza con albahaca fresca y queso mozzarella", 99.0, true, dough);
	}

	/**
	 * Coloca queso mozzarella en la pizza margarita.
	 */
	@Override
	protected void addCheese() {
		System.out.println("Colocando queso mozzarella.");
	}

	/**
	 * Método sin implementar pues la pizza es vegetariana.
	 */
	@Override
	protected void addProtein() {
		throw new UnsupportedOperationException("La pizza es vegetariana.");
	}

	/**
	 * Indica que la pizza es vegetariana.
	 * @return <code>true</code>, pues la pizza es vegetariana.
	 */
	@Override
	protected boolean isVegetarian() {
		return true;
	}
}
