package myp.practica2.robot;

import myp.practica2.order.*;

/**
 * Clase que representa el estado del robot cuando se encuentra en su estado listo para entregar.
 */
public class ReadyForDeliveryState implements RobotState {

	/** El robot al que se asignaran los diferentes estados.*/
	private Robot cesarinRobot;

	/**
	 * Crea un estado listo para entregar para el robot.
	 * @param cesarinRobot el robot para el que se creara un estado listo para entregar.
	 */
	public ReadyForDeliveryState(Robot cesarinRobot) {
		this.cesarinRobot = cesarinRobot;
	}

	/**
	 * Llama al robot cuando este se encuentra en su estado listo para entregar.
	 */
	@Override
	public void call() {
		System.out.println("Una orden está por ser entregada y el robot aún no puede ser llamado.");

	}

	/**
	 * Toma una orden de pizza cuando el robot se encuentra en su estado listo para entregar.
	 */
	@Override
    public void takePizzaOrder() {
		System.out.println("No se pueden registrar pedidos durante el periodo de de entrega.");
    }

	/**
	 * Toma una orden de helado cuando el robot se encuentra en su estado listo para entregar.
	 */
    @Override
    public void takeIceCreamOrder() {
		System.out.println("No se pueden registrar pedidos durante el periodo de de entrega.");
    }


	/**
	 * Cancela una orden cuando el robot se encuentra en su estado listo para entregar.
	 */
	@Override
	public void cancelOrder() {
		System.out.println("Tu orden ya fue preparada. No es posible cancelarla.");
	}

	/**
	 * Confirma una orden cuando el robot se encuentra en su estado listo para entregar.
	 */
	@Override
	public void confirmOrder() {
		System.out.println("Tu orden ya fue preparada y no tienes que volver a confirmarla.");
	}

	/**
	 * Prepara una orden cuando el robot se encuentra en su estado listo para entregar.
	 */
	@Override
	public void prepareOrder() {
		System.out.println("La orden ya fue preparada y está en espera de ser entregada.");
	}

	/**
	 * Entrega una orden cuando el robot se encuentra en su estado listo para entregar.
	 * Tambien muestra el recibo con los detalles de su compra.
	 */
	@Override
	public void deliverOrder() {
		System.out.println("-------- Entregando orden junto con tu ticket. -------- ");
		Order order = this.cesarinRobot.getCurrentOrder();
		Ticket ticket = order.generateTicket(); //Generando ticket.
		this.cesarinRobot.setCurrentOrder(new Order());   					//Borrando la orden actual

		System.out.println(ticket.toString());
		System.out.println("-------- Orden entregada. Tenga un buen dia :) --------");
		this.cesarinRobot.setState(this.cesarinRobot.getSleepingState());
	}
}
