package myp.practica2.icecream;

/**
 * Clase que representa gomitas de aro.
 */
public class GummyRings extends DecoratingIngredient {

	/**
	 * Crea una envoltura de gomitas de aro en el helado.
	 */
	public GummyRings(IceCream icecream) {
		super(icecream);
		this.id = "D03";
		this.name = "Gomitas de aro";
	}

	/**
	 * Devuelve una descripción del helado con las gomitas de aro.
	 * @return una descripción del helado con las gomitas de aro.
	 */
	@Override
	public String getDescription() {
		return this.icecream.getDescription() + " + Gomitas de aro";
	}

	/**
	 * Devuelve el costo del helado con las gomitas de aro.
	 * @return el costo del helado con las gomitas de aro.
	 */
	@Override
	public double getCost() {
		return 10.0 + this.icecream.getCost();
	}
}
