package myp.practica2.pizza;

/**
 * Clase que representa una pizza de cuatro quesos.
 */
public class FourCheesesPizza extends Pizza {

	/**
	 * Construye una pizza de cuatro quesos con un tipo de masa específico.
	 * @param dough el tipo de masa de la pizza.
	 */
	public FourCheesesPizza(Dough dough) {
		super("P04", "Cuatro Quesos", "Pizza de cuatro quesos.", 109.0, true, dough);
	}

	/**
	 * Coloca los cuatro quesos en la pizza de cuatro quesos.
	 */
	@Override
	protected void addCheese() {
		System.out.println("Agregando cuatro quesos.");
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
