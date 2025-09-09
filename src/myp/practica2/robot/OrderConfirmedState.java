package myp.practica2.robot;

/**
 * Clase que representa el estado del robot cuando se encuentra en su estado orden confirmada.
 */
public class OrderConfirmedState implements RobotState {

    /** El robot al que se asignaran los diferentes estados. */
	private Robot cesarinRobot;

    /**
     * Crea un estado orden confirmada para el robot.
     * @param cesarinRobot el robot para el que se creara un estado orden confirmada.
     */
    public OrderConfirmedState(Robot cesarinRobot) {
        this.cesarinRobot = cesarinRobot;
    }

	/**
	 * Llama al robot cuando este se encuentra en su estado orden confirmada.
     * 
	 */
	@Override
	public void call() {
        System.out.println("No puedes llamar al robot. Este solo atiende una orden a la vez");
	}


    /**
	 * Toma una orden de pizza cuando el robot se encuentra en su estado orden confirmada.
	 */
    @Override
    public void takePizzaOrder() {
        System.out.println("Tu orden ya ha sido registrada.");
    }

    /**
	 * Toma una orden de helado cuando el robot se encuentra en su estado orden confirmada.
	 */
    @Override
    public void takeIceCreamOrder() {
        System.out.println("Tu orden ya ha sido registrada.");
    }

    /**
	 * Cancela la orden cuando el robot se encuentra en su estado orden confirmada.
	 */
    @Override
    public void cancelOrder() {
       System.out.println("Ya has confirmado tu orden y esta ya no puede ser cancelada.");
    }

    /**
	 * Confirma la orden cuando el robot se encuentra en su estado orden confirmada.
	 */
    @Override
    public void confirmOrder() {
       System.out.println("Tu orden ya ha sido confirmada y no tienes que hacerlo de nuevo.");
    }

    /**
	 * Prepara la orden cuando el robot se encuentra en su estado orden confirmada.
	 */
    @Override
    public void prepareOrder() {
        System.out.println("Procediendo a preparar tu orden.");
        this.cesarinRobot.setState(this.cesarinRobot.getPreparingState());    
    }

    /**
	 * Entrega la orden cuando el robot se encuentra en su estadi orden confirmada.
	 */
    @Override
    public void deliverOrder() {
       System.out.println("Tu orden aún no ha sido preparada. Por favor, espera.");

    }
}
