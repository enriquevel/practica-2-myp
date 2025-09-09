package myp.practica2.robot;

/**
 * Clase que representa el estado del robot cuando se encuentra en su estado dormido.
 */
public class SleepingState implements RobotState {
    Robot cesarinRobot;

    public SleepingState(Robot cesarinRobot) {
        this.cesarinRobot = cesarinRobot;
    }

	/**
	 *
	 */
	@Override
	public void call() {
        System.out.println("El robot ha sido llamado para atender al cliente.");
        cesarinRobot.setState(cesarinRobot.getTakingOrderState());
	}

    @Override
    public void takePizzaOrder() {
        System.out.println("El robot no puede tomar una orden de pizza si está dormido.");
    }

    @Override
    public void takeIceCreamOrder() {
        System.out.println("El robot puede tomar una orden de helado si está dormido.");
    }

    @Override
    public void confirmOrder() {
        System.out.println("El robot no puede confirmar una orden si está dormido.");
    }

    @Override
    public void cancelOrder() {
        System.out.println("El robot no puede cancelar una orden si está dormido.");
    }

	@Override
    public void prepareOrder() {
        System.out.println("El robot no puede preparar una orden si está dormido.");
    }

    @Override
    public void deliverOrder() {
        System.out.println("El robot no puede entregar una orden si está dormido.");

    }
}
