package myp.practica2.robot;

import myp.practica2.order.Order;

/**
 * Clase que representa el estado del robot cuando se encuentra en su estado dormido.
 */
public class SleepingState implements RobotState {

	/** El robot que se encuentra en su estado dormido. */
    private Robot cesarinRobot;

	/**
	 * Crea el estado que maneja a un robot en estado dormido.
	 * @param cesarinRobot el robot a manejar en estado dormido.
	 */
    public SleepingState(Robot cesarinRobot) {
        this.cesarinRobot = cesarinRobot;
    }

	/**
	 * Llama al robot para atender a un cliente.
	 * El robot pasa de estado "dormido" a estado "tomando orden".
	 */
	@Override
	public void call() {
        System.out.println("El robot ha sido llamado para atender al cliente. Listo para tomar la orden.");
		this.cesarinRobot.setCurrentOrder(new Order());
        this.cesarinRobot.setState(this.cesarinRobot.getTakingOrderState());
	}

    /**
	 * Intenta tomar la orden de pizza de un cliente, pero el robot está dormido.
	 */
    @Override
    public void takePizzaOrder() {
        System.out.println("El robot no puede tomar una orden de pizza si está dormido.");
    }

    /**
	 * Intenta tomar la orden de helado de un cliente, pero el robot está dormido.
	 */
    @Override
    public void takeIceCreamOrder() {
        System.out.println("El robot puede tomar una orden de helado si está dormido.");
    }

    /**
	 * Intenta confirmar la orden de un cliente, pero el robot está dormido.
	 */
    @Override
    public void confirmOrder() {
        System.out.println("El robot no puede confirmar una orden si está dormido.");
    }

    /**
	 * Intenta cancelar la orden de un cliente, pero el robot está dormido.
	 */
    @Override
    public void cancelOrder() {
        System.out.println("El robot no puede cancelar una orden si está dormido.");
    }

    /**
	 * Intenta preparar la orden de un cliente, pero el robot está dormido.
	 */
	@Override
    public void prepareOrder() {
        System.out.println("El robot no puede preparar una orden si está dormido.");
    }

    /**
	 * Intenta entregar la orden de un cliente, pero el robot está dormido.
	 */
    @Override
    public void deliverOrder() {
        System.out.println("El robot no puede entregar una orden si está dormido.");
    }
}
