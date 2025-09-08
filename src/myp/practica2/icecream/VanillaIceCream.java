package myp.practica2.icecream;

public class VanillaIceCream extends IceCream {

	public VanillaIceCream() {
		this.description = "Helado de vainilla.";
	}

	/**
	 * @return
	 */
	@Override
	public double getCost() {
		return 25.0;
	}
}
