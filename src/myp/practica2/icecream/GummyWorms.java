package myp.practica2.icecream;

/**
 * Clase que representa gomitas de gusano.
 */
public class GummyWorms extends DecoratingIngredient {

	/**
	 * Crea una envoltura de gomitas de gusano en el helado.
	 */
	public GummyWorms(IceCream icecream) {
		super(icecream);
	}

	/**
	 * Devuelve una descripción del helado con las gomitas de gusano.
	 * @return una descripción del helado con las gomitas de gusano.
	 */
	@Override
	public String getDescription() {
		return this.icecream.getDescription() + " + Gomitas de gusano";
	}

	/**
	 * Devuelve el costo del helado con las gomitas de gusano.
	 * @return el costo del helado con las gomitas de gusano.
	 */
	@Override
	public double getCost() {
		return 10.0 + this.icecream.getCost();
	}
}
