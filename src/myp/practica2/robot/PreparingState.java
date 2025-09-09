package myp.practica2.robot;

import myp.practica2.order.*;
import myp.practica2.pizza.Pizza;

/**
 * Clase que representa el estado del robot cuando se encuentra en su estado preparando orden.
 */
public class PreparingState implements RobotState {

    /** */
    private Robot cesarinRobot;

    /**
	 * Asigna al robot el estado 
	 */
    public PreparingState(Robot cesarinRobot) {
        this.cesarinRobot = cesarinRobot;
    }

	/**
	 *
	 */
	@Override
	public void call() {
        System.out.println("Una orden está siendo preparada. Por favor, espera a que el robot finalize para tomar tu orden.");
	}

    /**
	 *
	 */
    @Override
    public void prepareOrder() {
        Order order = this.cesarinRobot.getCurrentOrder();

        if(order.hasPizza()) {
            System.out.println("Preparando tu pizza...");
            Pizza pizza = order.getPizza();
            pizza.preparePizza();
        }

        if(order.hasIceCream()) {
            System.out.println("Preparando tu helado...");
        }

        //si es una pizza, deberia de llamarse a preparePizza()
        // o en su defecto preparar el helado. despues pasar a ReadyForDeliveryState y esperar a recibir orden de entregar.
        this.cesarinRobot.setState(this.cesarinRobot.getReadyForDeliveryState());
    }


    /**
	 *
	 */
    @Override
    public void takePizzaOrder() {
        System.out.println("Tu orden ya ha sido registrada y esta en espera de ser preparada.");
    }

    /**
	 *
	 */
    @Override
    public void takeIceCreamOrder() {
        System.out.println("Tu orden ya ha sido registrada y esta en espera de ser preparada.");

    }

    /**
	 *
	 */
    @Override
    public void cancelOrder() {
        System.out.println("Ya no es posible cancelar tu orden, esta está siendo preparada.");
    }

    /**
	 *
	 */
    @Override
    public void confirmOrder() {
        System.out.println("Tu orden ya está confirmada y siendo preparada.");

    }

    /**
	 *
	 */
    @Override
    public void deliverOrder() {
        System.out.println("Tu orden está siendo preparada y aún no es psoible entregarla.");
    }
}
