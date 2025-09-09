package myp.practica2.robot;

/**
 * Clase que representa el estado del robot cuando se encuentra en su estado entregar orden.
 */
public class ReadyForDeliveryState implements RobotState {

	private Robot cesarinRobot;

	public ReadyForDeliveryState(Robot cesarinRobot) {
		this.cesarinRobot = cesarinRobot;
	}

	/**
	 *
	 */
	@Override
	public void call() {
		System.out.println("Una orden está por ser entregada y el robot aún no puede ser llamado.")

	}

	/**
	 *
	 */
	@Override
	public void prepareOrder() {
		System.out.println("La orden ya fue preparada y está en espera de ser entregada.")
	}

	/**
	 *
	 */
	@Override
    public void takePizzaOrder() {

    }

	/**
	 *
	 */
    @Override
    public void takeIceCreamOrder() {
    }


	/**
	 *
	 */
	@Override
	public void cancelOrder() {
		System.out.println("Tu orden ya fue preparada. No es posible cancelarla.");
	}

	/**
	 *
	 */
	@Override
	public void confirmOrder() {
		System.out.println("Tu orden ya fue preparada y no tienes que volver a confirmarla.");
	}

	/**
	 *
	 */
	@Override
	public void deliverOrder() {
		System.out.println("Entregando orden junto con tu ticket.");
		cesarinRobot.setState(cesarinRobot.getSleepingState());
	}
}
