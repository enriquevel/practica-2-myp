package myp.practica2.icecream;

/**
 * Clase que representa un helado de vainilla.
 */
public class VanillaIceCream extends IceCream {

	/**
	 * Construye un helado de vainilla y provee una descripción de este.
	 */
	public VanillaIceCream() {
		this.description = "Helado de vainilla.";
	}

	/**
	 * Devuelve el costo base de un helado de vainilla.
	 * @return el costo de un helado de vainilla
	 */
	@Override
	public double getCost() {
		return 25.0;
	}
}
