package myp.practica2.robot;

/**
 * Clase que representa el estado del robot cuando se encuentra en su estado orden confirmada.
 */
public class OrderConfirmedState implements RobotState {

    /** */
	private Robot cesarinRobot;

    /**
     * 
     * @param cesarinRobot 
     */
    public OrderConfirmedState(Robot cesarinRobot) {
        this.cesarinRobot = cesarinRobot;
    }

	/**
	 *
	 */
	@Override
	public void call() {
        System.out.println("No puedes llamar al robot. Este solo atiende una orden a la vez");
	}

    /**
	 *
	 */
    @Override
    public void prepareOrder() {
        System.out.println("Procediendo a preparar tu orden.");
        this.cesarinRobot.setState(this.cesarinRobot.getPreparingState());    
    }

    /**
	 *
	 */
    @Override
    public void takePizzaOrder() {
        System.out.println("Tu orden ya ha sido registrada.");
    }

    /**
	 *
	 */
    @Override
    public void takeIceCreamOrder() {
        System.out.println("Tu orden ya ha sido registrada.");
    }

    /**
	 *
	 */
    @Override
    public void cancelOrder() {
       System.out.println("Ya has confirmado tu orden y esta ya no puede ser cancelada.");
    }

    /**
	 *
	 */
    @Override
    public void confirmOrder() {
       System.out.println("Tu orden ya ha sido confirmada y no tienes que hacerlo de nuevo.");
    }

    /**
	 *
	 */
    @Override
    public void deliverOrder() {
       System.out.println("Tu orden aún no ha sido preparada. Por favor, espera.");

    }
}
