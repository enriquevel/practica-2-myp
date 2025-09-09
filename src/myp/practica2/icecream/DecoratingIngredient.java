package myp.practica2.icecream;

/**
 * Clase abstracta para el comportamiento decorador de los ingredientes.
 */
public abstract class DecoratingIngredient extends IceCream {

	/** El helado que será envuelto por ingredientes. */
	protected IceCream icecream;

	/** El identificador del ingrediente decorador. */
	protected String id;

	/** El nombre del ingrediente decorador. */
	protected String name;

	/**
	 * Construye un ingrediente decorador y lo envuelve en el helado.
	 */
	public DecoratingIngredient(IceCream icecream) {
		this.icecream = icecream;
	}

	public String getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}
}
