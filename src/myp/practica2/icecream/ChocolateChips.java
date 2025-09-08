package myp.practica2.icecream;

public class ChocolateChips extends DecoratingIngredient{

	public ChocolateChips(IceCream icecream) {
		super(icecream);
	}

	@Override
	public String getDescription() {
		return this.icecream.getDescription() + "+ Chispas de chocolate";
	}

	/**
	 * @return
	 */
	@Override
	public double getCost() {
		return 12.0 + this.icecream.getCost();
	}
}
