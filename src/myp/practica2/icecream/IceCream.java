package myp.practica2.icecream;

/**
 * Clase abstracta para representar un helado que será "envuelto" con ingredientes.
 */
public abstract class IceCream {

	/** Descripción del helado.  */
	String description = "Helado";

	/**
	 * Devuelve la descrpción de este helado.
	 * @return la descripción de este helado.
	 */
	public String getDescription() {
		return this.description;
	}

	/**
	 * Devuelve el costo total del helado creado por el cliente.
	 */
	public abstract double getCost();
}
