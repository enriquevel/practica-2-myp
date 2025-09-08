package myp.practica2.icecream;

public abstract class IceCream {

	String description = "Helado";

	public String getDescription() {
		return this.description;
	}

	public abstract double getCost();
}
