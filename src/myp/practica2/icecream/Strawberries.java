package myp.practica2.icecream;

/**
 * Clase que representa fresitas, que son ingredientes decoradores para los helados.
 */
public class Strawberries extends DecoratingIngredient {

	/**
	 * Crea una envoltura de fresitas en el helado.
	 */
	public Strawberries(IceCream icecream) {
		super(icecream);
		this.id = "D06";
		this.name = "Fresitas";
	}

	/**
	 * Devuelve una descripción del helado con las fresitas.
	 * @return una descripción del helado con las fresitas.
	 */
	@Override
	public String getDescription() {
		return this.icecream.getDescription() + " + Fresitas";
	}

	/**
	 * Devuelve el costo del helado con las fresitas.
	 * @return el costo del helado con las fresitas.
	 */
	@Override
	public double getCost() {
		return 15.0 + this.icecream.getCost();
	}
}
