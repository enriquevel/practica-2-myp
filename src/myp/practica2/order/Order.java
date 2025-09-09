package myp.practica2.order;

import myp.practica2.pizza.Pizza;
import myp.practica2.icecream.IceCream;

public class Order {

	private Pizza pizza;
	private IceCream iceCream;

	public Order() {
		this.pizza = null;
		this.iceCream = null;
	}

	public boolean hasPizza() {
		return this.pizza != null;
	}

	public void addPizza(Pizza pizza) {
		if (pizza == null)
			throw new NullPointerException("The specified pizza cannot be null.");

		if (this.pizza != null)
			throw new IllegalStateException("Only a single pizza is allowed per order.");

		this.pizza = pizza;
	}

	public Pizza getPizza() {
		return this.pizza;
	}

	public boolean hasIceCream() {
		return this.iceCream != null;
	}

	public void addIceCream(IceCream iceCream) {
		if (iceCream == null)
			throw new NullPointerException("The specified ice cream cannot be null.");

		if (this.iceCream != null)
			throw  new IllegalStateException("Only a single ice cream is allowed per order.");

		this.iceCream = iceCream;
	}

	public IceCream getIceCream() {
		return this.iceCream;
	}

	public boolean isEmpty() {
		return this.pizza == null && this.iceCream == null;
	}

	public void clear() {
		this.pizza = null;
		this.iceCream = null;
	}

	public Ticket generateTicket() {
		if (isEmpty())
			throw new IllegalStateException("The order is empty.");

		return new Ticket(this.pizza, this.iceCream);
	}
}
