package myp.practica2.robot;

import myp.practica2.order.*;
import myp.practica2.pizza.Pizza;

/**
 * Clase que representa el estado del robot cuando se encuentra en su estado preparando orden.
 */
public class PreparingState implements RobotState {

    /** El robot al que se asignaran los diferentes estados. */
    private Robot cesarinRobot;

    /**
	 * Crea un estado preparando orden para el robot. 
     * @param cesarinRobot el robot para el que se creara un estado preparando orden.
	 */
    public PreparingState(Robot cesarinRobot) {
        this.cesarinRobot = cesarinRobot;
    }

	/**
	 * LLama al robot cuando este se encuentra en su estado preparando orden.
	 */
	@Override
	public void call() {
        System.out.println("Una orden está siendo preparada. Por favor, espera a que el robot finalize para tomar tu orden.");
	}

    /**
	 * Prepara la orden del cliente cuando el robot se encuentra en su estado preparando orden.
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
	 * Toma la orden de pizza del cliente cuando este se encuentra en su estado preparando orden.
	 */
    @Override
    public void takePizzaOrder() {
        System.out.println("Tu orden ya ha sido registrada y esta en espera de ser preparada.");
    }

    /**
	 * Toma la orden de helado del cliente cuando este se encuentra en su estado preparando orden.
	 */
    @Override
    public void takeIceCreamOrder() {
        System.out.println("Tu orden ya ha sido registrada y esta en espera de ser preparada.");

    }

    /**
	 * Cancela la orden del cliente cuando el robot se encuentra en su estado preparando orden.
	 */
    @Override
    public void cancelOrder() {
        System.out.println("Ya no es posible cancelar tu orden, esta está siendo preparada.");
    }

    /**
	 * Confirma la orden del cliente cuando el robot se encuentra en su estado preparando orden.
	 */
    @Override
    public void confirmOrder() {
        System.out.println("Tu orden ya está confirmada y siendo preparada.");

    }

    /**
	 * Entrega la orden del cliente cuando el robot se encuentra en su estado preparando orden.
	 */
    @Override
    public void deliverOrder() {
        System.out.println("Tu orden está siendo preparada y aún no es psoible entregarla.");
    }
}
