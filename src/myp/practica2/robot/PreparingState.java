package myp.practica2.robot;

import myp.practica2.order.Order;
import myp.practica2.pizza.Pizza;

/**
 * Clase que representa el estado del robot cuando se encuentra en su estado preparación de orden.
 */
public class PreparingState implements RobotState {

	/** El robot que se encuentra en su estado preparación de orden. */
    private Robot cesarinRobot;

    /**
	 * Crea el estado que maneja a un robot en estado preparación de orden.
	 * @param cesarinRobot el robot a manejar en estado preparación de orden.
	 */
    public PreparingState(Robot cesarinRobot) {
        this.cesarinRobot = cesarinRobot;
    }

	/**
	 * Intenta llamar al robot, pero este está en su estado preparación de orden.
	 */
	@Override
	public void call() {
        System.out.println("Una orden está siendo preparada. Por favor, espera a que el robot finalice para tomar tu orden.");
	}

    /**
	 * Intenta tomar la orden de pizza de un cliente, pero el robot está en el estado preparación de orden.
	 */
    @Override
    public void takePizzaOrder() {
        System.out.println("Tu orden ya ha sido registrada y está en espera de ser preparada.");
    }

    /**
	 * Intenta tomar la orden de helado de un cliente, pero el robot está en el estado preparación de orden.
	 */
    @Override
    public void takeIceCreamOrder() {
        System.out.println("Tu orden ya ha sido registrada y está en espera de ser preparada.");

    }

    /**
	 * Intenta confirmar la orden de un cliente, pero el robot está en el estado preparación de orden.
	 */
    @Override
    public void confirmOrder() {
        System.out.println("Tu orden ya está confirmada y siendo preparada.");

    }

    /**
	 * Intenta cancelar la orden de un cliente, pero el robot está en el estado preparación de orden.
	 */
    @Override
    public void cancelOrder() {
        System.out.println("Ya no es posible cancelar tu orden, esta está siendo preparada.");
    }

    /**
	 * Prepara la orden de un cliente.
     * Al terminar de preparar la orden, el robot pasa de estado "preparación de orden" a estado "entrega de orden".
	 */
    @Override
    public void prepareOrder() {
        Order order = this.cesarinRobot.getCurrentOrder();

        if(order.hasPizza()) {
            System.out.println("Preparando tu pizza...");
            Pizza pizza = order.getPizza();
            pizza.preparePizza();
        }

        if(order.hasIceCream()) 
            System.out.println("Preparando tu helado...");

        this.cesarinRobot.setState(this.cesarinRobot.getReadyForDeliveryState());
    }

    /**
	 * Entrega la orden del cliente cuando el robot se encuentra en su estado preparando orden.
	 */
    @Override
    public void deliverOrder() {
        System.out.println("Tu orden está siendo preparada y aún no es posible entregarla.");
    }

    /**
	 * Imprime en terminal la descripcion del estado actual del robot.
	 */
    @Override
	public void description(){
        System.out.println("\n"+ "-----------ESTADO DEL ROBOT: <PREPARANDO ORDEN>-----------" + "\n");
    }
}