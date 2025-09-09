package myp.practica2.icecream;

/**
 * Clase que representa un helado de chocolate.
 */
public class ChocolateIceCream extends IceCream {

	/**
	 * Construye un helado de chocolate y provee una descripción de este.
	 */
	public ChocolateIceCream() {
		this.description = "Helado de chocolate.";
	}

	/**
	 * Devuelve el costo base de un helado de chocolate.
	 * @return el costo de un helado de chocolate.
	 */
	@Override
	public double getCost() {
		return 25.0;
	}
}
