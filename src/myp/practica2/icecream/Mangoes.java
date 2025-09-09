package myp.practica2.icecream;

/**
 * Clase que representa manguitos.
 */
public class Mangoes extends DecoratingIngredient {

	/**
	 * Crea una envoltura de manguitos en el helado.
	 */
	public Mangoes(IceCream icecream) {
		super(icecream);
		this.id = "D07";
		this.name = "Manguitos";
	}

	/**
	 * Devuelve una descripción del helado con los manguitos.
	 * @return una descripción del helado con los manguitos.
	 */
	@Override
	public String getDescription() {
		return this.icecream.getDescription() + " + Manguitos";
	}

	/**
	 * Devuelve el costo del helado con los manguitos.
	 * @return el costo del helado con los manguitos.
	 */
	@Override
	public double getCost() {
		return 18.0 + this.icecream.getCost();
	}
}
