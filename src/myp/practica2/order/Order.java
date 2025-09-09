package myp.practica2.order;

import myp.practica2.pizza.Pizza;
import myp.practica2.icecream.IceCream;

public class Order {

	private Pizza pizza;
	private IceCream iceCream;
	private boolean confirmed = false;
	private boolean canceled = false;

	public Order() {
	}

	public void addPizza(Pizza pizza) {
		if (pizza == null)
			throw new NullPointerException("The specified pizza cannot be null.");

		if (this.confirmed)
			throw new IllegalStateException("The order has already been confirmed.");

		if (this.canceled)
			throw new IllegalStateException("The order has already been canceled.");

		if (this.pizza != null)
			throw  new IllegalStateException("Only a single pizza is allowed per order.");

		this.pizza = pizza;
	}

	public void addIceCream(IceCream iceCream) {
		if (iceCream == null)
			throw new NullPointerException("The specified ice cream cannot be null.");

		if (this.confirmed)
			throw new IllegalStateException("The order has already been confirmed.");

		if (this.canceled)
			throw new IllegalStateException("The order has already been canceled.");

		if (this.iceCream != null)
			throw  new IllegalStateException("Only a single ice cream is allowed per order.");

		this.iceCream = iceCream;
	}

	public void cancel() {
		if (confirmed)
			throw new IllegalStateException("An already confirmed order cannot be canceled.");

		if (canceled)
			return;

		this.canceled = true;
		this.pizza = null;
		this.iceCream = null;
	}

	public void confirm() {
		if (canceled)
			throw new IllegalStateException("An already canceled order cannot be confirmed.");

		if (confirmed)
			return;

		if (!hasPizza() && !hasHelado())
			throw new IllegalStateException("The order must have at least one product to be confirmed.");

		this.confirmed = true;
	}

	public Ticket generateTicket() {
		if (!confirmed)
			throw new IllegalStateException("Cannot generate a ticket for a non-confirmed order.");

		if (canceled)
			throw new IllegalStateException("Cannot generate a ticket for a canceled order.");

		return new Ticket(this.pizza, this.iceCream);
	}

	public boolean hasPizza() {
		return this.pizza != null;
	}

	public boolean hasHelado() {
		return this.iceCream != null;
	}

	public Pizza getPizza() {
		return this.pizza;
	}

	public IceCream getIceCream() {
		return this.iceCream;
	}

}
