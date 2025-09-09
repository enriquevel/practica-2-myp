package myp.practica2.robot;

import myp.practica2.order.Order;

/**
 *  
 */
public class Robot {

	/** El estado actual del robot. */
	private RobotState state;

	/** La orden actual que el robot preparara. */
	private Order currentOrder;
	
    private final RobotState sleepingState = new SleepingState(this);
	private final RobotState takingOrderState = new TakingOrderState(this);
    private final RobotState orderConfirmedState = new OrderConfirmedState(this);
    private final RobotState preparingState =  new PreparingState(this);
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
	 * @return el estado de preparacion de este robot.
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
	 * 
	 */
	public void call() {
		this.state.call();
	}

	/**
	 * 
	 */
	public void takePizzaOrder() {
		this.state.takePizzaOrder();
	}

	/**
	 * 
	 */
	public void takeIceCreamOrder() {
		this.state.takeIceCreamOrder();
	}

	/**
	 * 
	 */
	public void confirmOrder() {
		this.state.confirmOrder();
	}

	/**
	 * 
	 */
	public void cancelOrder() {
		this.state.cancelOrder();
	}

	/**
	 * 
	 */
	public void prepareOrder() {
		this.state.prepareOrder();
	}

	/**
	 * 
	 */
	public void deliverOrder() {
		this.state.deliverOrder();
	}

	/**
	 * Devuelve la orden actual que el robot atendera.
	 * @return la orden actual.
	 */
	public Order getCurrentOrder() {
		return this.currentOrder;
	}

	/**
	 * Establece la orden actual que el robot atendera.
	 * @param order la orden del cliente.
	 */
	public void setCurrentOrder(Order order) {
		this.currentOrder = order;
	}
}
