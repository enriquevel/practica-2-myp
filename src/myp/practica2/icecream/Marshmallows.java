package myp.practica2.icecream;

/**
 * Clase que representa malvaviscos, que son ingredientes decoradores para los helados.
 */
public class Marshmallows extends DecoratingIngredient {

	/**
	 * Crea una envoltura de malvaviscos en el helado.
	 */
	public Marshmallows(IceCream icecream) {
		super(icecream);
		this.id = "D05";
		this.name = "Malvaviscos";
	}

	/**
	 * Devuelve una descripción del helado con los malvaviscos.
	 * @return una descripción del helado con los malvaviscos.
	 */
	@Override
	public String getDescription() {
		return this.icecream.getDescription() + " + Malvaviscos";
	}

	/**
	 * Devuelve el costo del helado con los malvaviscos.
	 * @return el costo del helado con los malvaviscos.
	 */
	@Override
	public double getCost() {
		return 8.0 + this.icecream.getCost();
	}
}
