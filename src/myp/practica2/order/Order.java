package myp.practica2.order;

import myp.practica2.pizza.Pizza;
import myp.practica2.icecream.IceCream;

/**
 * Clase que representa una orden de un cliente.
 */
public class Order {

	/** La pizza que un cliente ha ordenado. */
	private Pizza pizza;

	/** EL helado que un cliente ha ordenado*/
	private IceCream iceCream;

	/**
	 * Crea una orden sin elementos.
	 */
	public Order() {
		this.pizza = null;
		this.iceCream = null;
	}

	/**
	 * Devuelve true si la orden tiene una pizza, false si no.
	 * @return si la orden tiene una pizza.
	 */
	public boolean hasPizza() {
		return this.pizza != null;
	}

	/**
	 * Agrega a la orden una pizza.
	 * @param pizza la pizza ha agregar a la orden.
	 * @throws IllegalStateException si se intenta ordenar mas de una pizza.
	 * @throws NullPointerException si la pizza especificada es null.
	 */
	public void addPizza(Pizza pizza) {
		if (pizza == null)
			throw new NullPointerException("The specified pizza cannot be null.");

		if (this.pizza != null)
			throw new IllegalStateException("Only a single pizza is allowed per order.");

		this.pizza = pizza;
	}

	/**
	 * Devuelve la pizza de esta orden.
	 * @return la pizza de esta orden.
	 */
	public Pizza getPizza() {
		return this.pizza;
	}

	/**
	 * Devuelve true si la orden tiene un helado, false si no.
	 * @return si la orden tiene un helado. 
	 */
	public boolean hasIceCream() {
		return this.iceCream != null;
	}

	/**
	 * Agrega un helado a la orden.
	 * @param iceCream el helado ha agregar a la orden.
	 * @throws IllegalStateException si se intenta ordenar mas de un helado.
	 * @throws NullPointerException si el helado especificada es null.
	 */
	public void addIceCream(IceCream iceCream) {
		if (iceCream == null)
			throw new NullPointerException("The specified ice cream cannot be null.");

		if (this.iceCream != null)
			throw  new IllegalStateException("Only a single ice cream is allowed per order.");

		this.iceCream = iceCream;
	}

	/**
	 * Devuelve el helado de esta orden.
	 * @return el helado de esta orden.
	 */
	public IceCream getIceCream() {
		return this.iceCream;
	}

	/**
	 * Devuelve true si esta orden está vacia.
	 * @return si la orden está vacia.
	 */
	public boolean isEmpty() {
		return this.pizza == null && this.iceCream == null;
	}

	/**
	 * Limpia la orden y la hace vacia.
	 */
	public void clear() {
		this.pizza = null;
		this.iceCream = null;
	}

	/**
	 * Genera el ticket de esta orden.
	 * @return un ticket con los detalles de esta orden.
	 * @throws IllegalStateException si la orden está vacia.
	 */
	public Ticket generateTicket() {
		if (isEmpty())
			throw new IllegalStateException("The order is empty.");

		return new Ticket(this);
	}
}
