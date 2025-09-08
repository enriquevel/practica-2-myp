package myp.practica2.robot;

public class Robot {

	private RobotState state;

    private final RobotState sleepingState = new SleepingState(this);
	private final RobotState takingOrderState = new TakingOrderState(this);
    private final RobotState orderConfirmedState = new OrderConfirmedState(this);
    private final RobotState preparingState =  new PreparingState(this);
	private final RobotState readyForDeliveryState =  new ReadyForDeliveryState(this);

    public Robot() {
		this.state = sleepingState;
    }

	public void setState(RobotState state) {
		this.state = state;
	}

    public RobotState getSleepingState() {
        return this.sleepingState;
    }

    public RobotState getTakingOrderState() {
        return this.takingOrderState;
    }

	public RobotState getOrderConfirmedState() {
		return this.orderConfirmedState;
	}

    public RobotState getPreparingState() {
        return this.preparingState;
    }

    public RobotState getReadyForDeliveryState() {
        return this.readyForDeliveryState;
    }

	public void call() {
		this.state.call();
	}

	public void takeOrder() {
		this.state.takeOrder();
	}

	public void confirmOrder() {
		this.state.confirmOrder();
	}

	public void cancelOrder() {
		this.state.cancelOrder();
	}

	public void prepareOrder() {
		this.state.prepareOrder();
	}

	public void deliverOrder() {
		this.state.deliverOrder();
	}
}
