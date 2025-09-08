package myp.practica2.icecream;

public class Mangoes extends DecoratingIngredient {

	public Mangoes(IceCream icecream) {
		super(icecream);
	}

	@Override
	public String getDescription() {
		return this.icecream.getDescription() + "+ Manguitos";
	}

	/**
	 * @return
	 */
	@Override
	public double getCost() {
		return 18.0 + this.icecream.getCost();
	}
}
