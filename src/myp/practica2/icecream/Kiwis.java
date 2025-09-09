package myp.practica2.icecream;

/**
 * Clase que representa kiwis.
 */
public class Kiwis extends DecoratingIngredient {

	/**
	 * Crea una envoltura de kiwis en el helado.
	 */
	public Kiwis(IceCream icecream) {
		super(icecream);
	}

	/**
	 * Devuelve una descripción del helado con los kiwis.
	 * @return una descripción del helado con los kiwis.
	 */
	@Override
	public String getDescription() {
		return this.icecream.getDescription() + " + Kiwis";
	}

	/**
	 * Devuelve el costo del helado con los kiwis.
	 * @return el costo del helado con los kiwis.
	 */
	@Override
	public double getCost() {
		return 20.0 + this.icecream.getCost();
	}
}
