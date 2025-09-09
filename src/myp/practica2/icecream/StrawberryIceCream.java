package myp.practica2.icecream;

/**
 * Clase que representa un helado de fresa.
 */
public class StrawberryIceCream extends IceCream {

	/**
	 * Construye un helado de fresa y provee una descripción de este.
	 */
	public StrawberryIceCream() {
		this.description = "Helado de fresa.";
	}

	/**
	 * Devuelve el costo base de un helado de fresa.
	 * @return el costo de un helado de fresa
	 */
	@Override
	public double getCost() {
		return 25.0;
	}
}
