package myp.practica2.robot;

public class OrderConfirmedState implements RobotState {
     Robot cesarinRobot;

    public OrderConfirmedState(Robot cesarinRobot) {
        this.cesarinRobot = cesarinRobot;
    }

	/**
	 *
	 */
	@Override
	public void call() {

	}

    @Override
    public void prepareOrder() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'prepareOrder'");
    }

    @Override
    public void takeOrder() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'takeOrder'");
    }

    @Override
    public void cancelOrder() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cancelOrder'");
    }

    @Override
    public void confirmOrder() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'confirmOrder'");
    }

    @Override
    public void deliverOrder() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deliverOrder'");
    }
    
}
