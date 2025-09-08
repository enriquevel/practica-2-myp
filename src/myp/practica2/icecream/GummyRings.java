package myp.practica2.icecream;

public class GummyRings extends DecoratingIngredient {

	public GummyRings(IceCream icecream) {
		super(icecream);
	}

	@Override
	public String getDescription() {
		return this.icecream.getDescription() + "+ Gomitas de aroho";
	}

	/**
	 * @return
	 */
	@Override
	public double getCost() {
		return 10.0 + this.icecream.getCost();
	}
}
