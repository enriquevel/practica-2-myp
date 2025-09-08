package myp.practica2.icecream;

public class ChocolateIceCream extends IceCream {

	public ChocolateIceCream() {
		this.description = "Helado de chocolate.";
	}

	/**
	 * @return 
	 */
	@Override
	public double getCost() {
		return 25.0;
	}
}
