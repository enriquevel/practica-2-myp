package myp.practica2.icecream;

public class StrawberryIceCream extends IceCream {

	public StrawberryIceCream() {
		this.description = "Helado de fresa.";
	}

	/**
	 * @return
	 */
	@Override
	public double getCost() {
		return 25.0;
	}

}
