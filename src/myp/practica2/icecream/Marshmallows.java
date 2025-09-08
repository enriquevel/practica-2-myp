package myp.practica2.icecream;

public class Marshmallows extends DecoratingIngredient {

	public Marshmallows(IceCream icecream) {
		super(icecream);
	}

	@Override
	public String getDescription() {
		return this.icecream.getDescription() + "+ Malvaviscos";
	}

	/**
	 * @return
	 */
	@Override
	public double getCost() {
		return 8.0 + this.icecream.getCost();
	}
}
