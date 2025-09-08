package myp.practica2.icecream;

public abstract class DecoratingIngredient extends IceCream {

	protected IceCream icecream;

	public DecoratingIngredient(IceCream icecream) {
		this.icecream = icecream;
	}
}
