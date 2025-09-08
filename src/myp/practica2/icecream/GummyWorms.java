package myp.practica2.icecream;

public class GummyWorms extends DecoratingIngredient {

	public GummyWorms(IceCream icecream) {
		super(icecream);
	}

	@Override
	public String getDescription() {
		return this.icecream.getDescription() + "+ Gomitas de gusano";
	}

	/**
	 * @return
	 */
	@Override
	public double getCost() {
		return 10.0 + this.icecream.getCost();
	}
}
