package myp.practica2.pizza;

public abstract class Pizza {
	protected String id;
	protected String name;
	protected String description;
	protected double price;
	protected boolean vegetarian;
	protected Dough dough;

	public Pizza(String id, String name, String description, double price, boolean vegetarian, Dough dough) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.vegetarian = vegetarian;
		this.dough = dough;
	}

	public final void preparePizza() {
		prepareDough();
		flattenDough();
		addTomatoSauce();
		addCheese();
		addSpices();
		addProtein();
		placeInOven();
		waitForCooking();
		getOutOfOven();
		packagePizza();
	}

	private void prepareDough() {
		System.out.println("Preparando masa: " + this.dough);
	}

	private void flattenDough() {
		System.out.println("Aplanando masa: " + this.dough);
	}

	private void addTomatoSauce() {
		System.out.println("Colocando salsa de tomate.");
	}

	protected abstract void addCheese();

	private void addSpices() {
		System.out.println("Colocando especias.");
	}

	protected abstract void addProtein();

	private void placeInOven() {
		System.out.println("Metiendo pizza al horno.");
	}

	private void waitForCooking() {
		System.out.println("Esperando cocción de la pizza.");
	}

	private void getOutOfOven() {
		System.out.println("Sacando pizza del horno.");
	}

	private void packagePizza() {
		System.out.println("Empaquetando pizza.");
	}

	public String getName() {
		return this.name;
	}

	public double getPrice() {
		return this.price;
	}
}
