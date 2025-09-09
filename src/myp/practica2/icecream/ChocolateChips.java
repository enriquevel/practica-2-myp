package myp.practica2.icecream;

/**
 * Clase que representa chispas de chocolate, que son ingredientes decoradores para los helados.
 */
public class ChocolateChips extends DecoratingIngredient{

	/**
	 * Crea una envoltura de chispas de chocolate en el helado.
	 */
	public ChocolateChips(IceCream icecream) {
		super(icecream);
		this.id = "D04";
		this.name = "Chispas de chocolate";
	}

	/**
	 * Devuelve una descripción del helado con las chispas de chocolate.
	 * @return una descripción del helado con las chispas de chocolate.
	 */
	@Override
	public String getDescription() {
		return this.icecream.getDescription() + " + Chispas de chocolate";
	}

	/**
	 * Devuelve el costo del helado con las chispas de chocolate.
	 * @return el costo del helado con las chispas de chocolate.
	 */
	@Override
	public double getCost() {
		return 12.0 + this.icecream.getCost();
	}
}
