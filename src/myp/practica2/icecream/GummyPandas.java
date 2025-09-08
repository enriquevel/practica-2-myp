package myp.practica2.icecream;

public class GummyPandas extends DecoratingIngredient {

	public GummyPandas(IceCream icecream) {
		super(icecream);
	}

    @Override
    public String getDescription() {
		return this.icecream.getDescription() + "+ Gomitas de panda";
    }

    /**
     * @return 
     */
	@Override
	public double getCost() {
		return 10.0 + this.icecream.getCost();
	}
}
