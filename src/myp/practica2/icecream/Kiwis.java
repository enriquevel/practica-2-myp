package myp.practica2.icecream;

public class Kiwis extends DecoratingIngredient {

	public Kiwis(IceCream icecream) {
		super(icecream);
	}

	@Override
	public String getDescription() {
		return this.icecream.getDescription() + "+ Kiwis";
	}

	/**
	 * @return
	 */
	@Override
	public double getCost() {
		return 20.0 + this.icecream.getCost();
	}
}
