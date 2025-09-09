package myp.practica2.robot;

/**
 *  
 */
public class Robot {
	/** El estado actual del robot. */
	private RobotState state;

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
    }

	/**
	 * Establece el estado del robot.
	 * @param state el estado al que el robot será establecido.
	 */
	public void setState(RobotState state) {
		this.state = state;
	}

	/**
	 * 
	 * @return 
	 */
    public RobotState getSleepingState() {
        return this.sleepingState;
    }

	/**
	 * 
	 * @return 
	 */
    public RobotState getTakingOrderState() {
        return this.takingOrderState;
    }

	/**
	 * 
	 * @return 
	 */
	public RobotState getOrderConfirmedState() {
		return this.orderConfirmedState;
	}

	/**
	 * 
	 * @return 
	 */
    public RobotState getPreparingState() {
        return this.preparingState;
    }

	/**
	 * 
	 * @return 
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
}
