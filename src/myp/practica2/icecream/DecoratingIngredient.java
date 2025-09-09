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

	/**
	 * Devuelve el identificador del ingrediente decorador.
	 * @return el identificador del ingrediente decorador.
	 */
	public String getId() {
		return this.id;
	}

	/**
	 * Devuelve el nombre del ingrediente decorador.
	 * @return el nombre del ingrediente decorador.
	 */
	public String getName() {
		return this.name;
	}
}
