package myp.practica2.icecream;

/**
 * Clase abstracta para el comportamiento decorador de los ingredientes.
 */
public abstract class DecoratingIngredient extends IceCream {

	/** El helado que será envuelto por ingredientes. */
	protected IceCream icecream;

	/**
	 * Construye un ingrediente decorador y lo envuelve en el helado.
	 */
	public DecoratingIngredient(IceCream icecream) {
		this.icecream = icecream;
	}
}
