package myp.practica2.pizza;

/**
 * Clase abstracta para representar la "plantilla" (template) de una pizza.
 */
public abstract class Pizza {

	/** El identificador de la pizza. */
	protected String id;

	/** El nombre de la pizza. */
	protected String name;

	/** La descripción de la pizza. */
	protected String description;

	/** El precio de la pizza. */
	protected double price;

	/** Indica si la pizza es vegetariana. */
	protected boolean vegetarian;

	/** El tipo de masa de la pizza. */
	protected Dough dough;

	/**
	 * Constructor que crea una pizza con los atributos especificados.
	 * @param id el identificador de la pizza.
	 * @param name el nombre de la pizza.
	 * @param description la descripción de la pizza.
	 * @param price el precio de la pizza.
	 * @param vegetarian si la pizza es vegetariana.
	 * @param dough el tipo de masa de la pizza.
	 */
	public Pizza(String id, String name, String description, double price, boolean vegetarian, Dough dough) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.vegetarian = vegetarian;
		this.dough = dough;
	}

	/**
	 * Prepara una pizza siguiendo el algoritmo común de preparación de pizzas.
	 */
	public final void preparePizza() {
		prepareDough();
		flattenDough();
		addTomatoSauce();
		addCheese();
		addSpices();
		if (!isVegetarian())
			addProtein();
		placeInOven();
		waitForCooking();
		getOutOfOven();
		packagePizza();
	}

	/**
	 * Prepara la masa de la pizza.
	 */
	private void prepareDough() {
		System.out.println("Preparando masa: " + this.dough);
	}

	/**
	 * Aplana la masa de la pizza.
	 */
	private void flattenDough() {
		System.out.println("Aplanando masa: " + this.dough);
	}

	/**
	 * Coloca salsa de tomate en la pizza.
	 */
	private void addTomatoSauce() {
		System.out.println("Colocando salsa de tomate.");
	}

	/**
	 * Coloca el queso correspondiente en la pizza.
	 */
	protected abstract void addCheese();

	/**
	 * Coloca especias en la pizza.
	 */
	private void addSpices() {
		System.out.println("Colocando especias.");
	}

	/**
	 * Coloca la proteína correspondiente en la pizza.
	 */
	protected abstract void addProtein();

	/**
	 * Mete la pizza al horno.
	 */
	private void placeInOven() {
		System.out.println("Metiendo pizza al horno.");
	}

	/**
	 * Espera a que la pizza se cocine.
	 */
	private void waitForCooking() {
		System.out.println("Esperando cocción de la pizza.");
	}

	/**
	 * Saca la pizza del horno.
	 */
	private void getOutOfOven() {
		System.out.println("Sacando pizza del horno.");
	}

	/**
	 * Empaca la pizza preparada.
	 */
	private void packagePizza() {
		System.out.println("Empaquetando pizza.");
	}

	/**
	 * Indica si la pizza es vegetariana.
	 * @return si la pizza es vegetariana.
	 */
	protected boolean isVegetarian() {
		return false;
	}

	/**
	 * Devuelve el nombre de la pizza.
	 * @return el nombre de la pizza.
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Devuelve el precio de la pizza.
	 * @return el precio de la pizza.
	 */
	public double getPrice() {
		return this.price;
	}
}
