package myp.practica2.icecream;

/**
 * Clase que representa gomitas de panda.
 */
public class GummyPandas extends DecoratingIngredient {

	/**
	 * Crea una envoltura de gomitas de panda en el helado.
	 */
	public GummyPandas(IceCream icecream) {
		super(icecream);
	}

	/**
	 * Devuelve una descripción del helado con las gomitas de panda.
	 * @return una descripción del helado con las gomitas de panda
	 */
    @Override
    public String getDescription() {
		return this.icecream.getDescription() + "+ Gomitas de panda";
    }

   	/**
	 * Devuelve el costo del helado con las gomitas de panda.
	 * @return el costo del helado con las gomitas de panda.
	 */
	@Override
	public double getCost() {
		return 10.0 + this.icecream.getCost();
	}
}
