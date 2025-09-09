package myp.practica2.robot;

/**
 * Clase que representa el estado del robot cuando se encuentra en su estado tomando orden.
 */
public class TakingOrderState implements RobotState {

    Robot cesarinRobot;

    public TakingOrderState(Robot cesarinRobot) {
        this.cesarinRobot = cesarinRobot;
    }

	/**
	 *
	 */
	@Override
	public void call() {
        System.out.println("El robot solo puede ser llamado por un cliente a la vez.");
	}

    @Override
    public void prepareOrder() {
        System.out.println("Se necesita primero confirmar la orden antes de prepararla.");
    }

    @Override
    public void takePizzaOrder() {
        System.out.println("Tomando orden de pizza.")

    }

    @Override
    public void takeIceCreamOrder() {
        System.out.println("Tomando orden de helado.")

    }

    @Override
    public void cancelOrder() {
        System.out.println("Cancelando orden.");
        cesarinRobot.setState(cesarinRobot.getSleepingState());    
    }

    @Override
    public void confirmOrder() {
        if(order.isValid()) {
            System.out.println("Confirmando orden...");
            cesarinRobot.setState(cesarinRobot.getOrderConfirmedState());
        } else {
            System.out.println("Se necesita primero una orden antes de poder confirmarla. Por favor, crea una orden.")
        }

    }

    @Override
    public void deliverOrder() {
        System.out.println("No es posible aún entregar la orden. La orden aún no ha sido preparada.");
    }
    
}
