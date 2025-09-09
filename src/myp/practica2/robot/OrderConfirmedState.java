package myp.practica2.robot;

/**
 * Clase que representa el estado del robot cuando se encuentra en su estado confirmación de orden.
 */
public class OrderConfirmedState implements RobotState {

	/** El robot que se encuentra en su estado confirmación de orden. */
	private Robot cesarinRobot;

    /**
	 * Crea el estado que maneja a un robot en estado confirmación de orden.
	 * @param cesarinRobot el robot a manejar en estado confirmación de orden.
	 */
    public OrderConfirmedState(Robot cesarinRobot) {
        this.cesarinRobot = cesarinRobot;
    }

	/**
	 * Intenta llamar al robot, pero este está en el estado confirmación de orden.
	 */
	@Override
	public void call() {
        System.out.println("No puedes llamar al robot. Este solo atiende una orden a la vez");
	}


    /**
    * Intenta tomar la orden de pizza de un cliente, pero el robot está en el estado confirmación de orden.
    */
    @Override
    public void takePizzaOrder() {
        System.out.println("Tu orden ya ha sido registrada.");
    }

    /**
    * Intenta tomar la orden de helado de un cliente, pero el robot está en el estado confirmación de orden.
    */
    @Override
    public void takeIceCreamOrder() {
        System.out.println("Tu orden ya ha sido registrada.");
    }

    /**
	 * Intenta confirmar la orden de un cliente, pero el robot está en el estado confirmación de orden.
	 */
    @Override
    public void confirmOrder() {
       System.out.println("Tu orden ya ha sido confirmada y no tienes que hacerlo de nuevo.");
    }

    /**
	 * Intenta cancelar la orden de un cliente, pero el robot está en el estado confirmación de orden.
	 */
    @Override
    public void cancelOrder() {
       System.out.println("Ya has confirmado tu orden y esta ya no puede ser cancelada.");
    }

    /**
	 * Prepara la orden de un cliente.
     * El robot pasa del estado "confirmación de orden" al estado "preparación de orden".
	 */
    @Override
    public void prepareOrder() {
        System.out.println("Procediendo a preparar tu orden.");
        this.cesarinRobot.setState(this.cesarinRobot.getPreparingState());    
    }

    /**
	 * Intenta entregar la orden de un cliente, pero el robot está en el estado confirmación de orden.
	 */
    @Override
    public void deliverOrder() {
       System.out.println("Tu orden aún no ha sido preparada. Por favor, espera.");
    }
}