package myp.practica2.robot;

import myp.practica2.order.Order;

/**
 * Clase para representar un robot que trabaja en la cadena de pizzerías "El Pequeño Cesarín".
 * Un robot se encarga de atender clientes, preparar alimentos y manejar órdenes.
 */
public class Robot {

	/** El estado actual del robot. */
	private RobotState state;

	/** La orden del cliente que se encuentra atendiendo. */
	private Order currentOrder;

	/** El estado del robot dormido. */
    private final RobotState sleepingState = new SleepingState(this);

	/** El estado del robot tomando una orden. */
	private final RobotState takingOrderState = new TakingOrderState(this);

	/** El estado del robot con una orden confirmada. */
    private final RobotState orderConfirmedState = new OrderConfirmedState(this);

	/** El estado del robot preparando una orden. */
    private final RobotState preparingState =  new PreparingState(this);

	/** El estado del robot listo para entregar una orden. */
	private final RobotState readyForDeliveryState =  new ReadyForDeliveryState(this);

	/**
	 * Constructor que inicializa al robot en un estado inicial dormido.
	 */
    public Robot() {
		this.state = sleepingState;
		this.currentOrder = null;
    }

	/**
	 * Establece el estado del robot.
	 * @param state el estado al que el robot será establecido.
	 */
	public void setState(RobotState state) {
		this.state = state;
	}

	/**
	 * Devuelve el estado dormido del robot.
	 * @return el estado dormido de este robot.
	 */
    public RobotState getSleepingState() {
        return this.sleepingState;
    }

	/**
	 * Devuelve el estado en el que el robot toma una orden.
	 * @return el estado tomando orden de este robot.
	 */
    public RobotState getTakingOrderState() {
        return this.takingOrderState;
    }

	/**
	 * Devuelve el estado de confirmacion de orden del robot.
	 * @return el estado de confirmacion de orden de este robot.
	 */
	public RobotState getOrderConfirmedState() {
		return this.orderConfirmedState;
	}

	/**
	 * Devuelve el estado de preparacion de orden del robot.
	 * @return el estado de preparacion de orden de este robot.
	 */
    public RobotState getPreparingState() {
        return this.preparingState;
    }

	/**
	 * Devuelve el estado de entrega de orden del robot.
	 * @return el estado de entrega de orden de este robot.
	 */
    public RobotState getReadyForDeliveryState() {
        return this.readyForDeliveryState;
    }

	/**
	 * Manda a llamar al robot para atender a un cliente.
	 */
	public void call() {
		this.state.call();
	}

	/**
	 * Toma la orden de una pizza del cliente que se está atendiendo.
	 */
	public void takePizzaOrder() {
		this.state.takePizzaOrder();
	}

	/**
	 * Toma la orden de un helado del cliente que se está atendiendo.
	 */
	public void takeIceCreamOrder() {
		this.state.takeIceCreamOrder();
	}

	/**
	 * Confirma la orden del cliente que se está atendiendo.
	 */
	public void confirmOrder() {
		this.state.confirmOrder();
	}

	/**
	 * Cancela la orden del cliente que se está atendiendo.
	 */
	public void cancelOrder() {
		this.state.cancelOrder();
	}

	/**
	 * Comienza a preparar la orden del cliente que se está atendiendo.
	 */
	public void prepareOrder() {
		this.state.prepareOrder();
	}

	/**
	 * Entrega la orden preparada del cliente que se está atendiendo.
	 */
	public void deliverOrder() {
		this.state.deliverOrder();
	}

	/**
	 * Devuelve la orden actual del cliente que se está atendiendo.
	 * @return la orden del cliente que se está atendiendo.
	 */
	public Order getCurrentOrder() {
		return this.currentOrder;
	}

	/**
	 * Establece la orden actual del cliente que se está atendiendo.
	 * @param order la orden del cliente que se está atendiendo.
	 */
	public void setCurrentOrder(Order order) {
		this.currentOrder = order;
	}
}
