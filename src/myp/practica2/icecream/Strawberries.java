package myp.practica2.icecream;

public class Strawberries extends DecoratingIngredient {

	public Strawberries(IceCream icecream) {
		super(icecream);
	}

	@Override
	public String getDescription() {
		return this.icecream.getDescription() + "+ Fresitas uwu";
	}

	/**
	 * @return
	 */
	@Override
	public double getCost() {
		return 15.0 + this.icecream.getCost();
	}
}
