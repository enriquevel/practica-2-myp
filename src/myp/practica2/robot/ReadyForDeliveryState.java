package myp.practica2.robot;

import myp.practica2.order.*;

/**
 * Clase que representa el estado del robot cuando se encuentra en su estado entrega de orden.
 */
public class ReadyForDeliveryState implements RobotState {

	/** El robot que se encuentra en su estado entrega de orden. */
	private Robot cesarinRobot;

	/**
	 * Crea el estado que maneja a un robot en estado entrega de orden.
	 * @param cesarinRobot el robot a manejar en estado entrega de orden.
	 */
	public ReadyForDeliveryState(Robot cesarinRobot) {
		this.cesarinRobot = cesarinRobot;
	}

	/**
	 * Intenta llamar al robot, pero este esta en el estado entrega de orden.
	 */
	@Override
	public void call() {
		System.out.println("Una orden está por ser entregada y el robot aún no puede ser llamado.");
	}

	/**
	 * Intenta tomar la orden de pizza de un cliente, pero el robot está en el estado entrega de orden.
	 */
	@Override
    public void takePizzaOrder() {
		System.out.println("No se pueden registrar pedidos durante el periodo de de entrega.");
    }

	/**
	 * Intenta tomar la orden de helado de un cliente, pero el robot está en el estado entrega de orden.
	 */
    @Override
    public void takeIceCreamOrder() {
		System.out.println("No se pueden registrar pedidos durante el periodo de de entrega.");
    }

	/**
	 * Intenta confirmar la orden de un cliente, pero el robot está en el estado entrega de orden.
	 */
	@Override
	public void confirmOrder() {
		System.out.println("Tu orden ya fue preparada y no tienes que volver a confirmarla.");
	}

	 /**
	 * Intenta cancelar la orden de un cliente, pero el robot está en el estado entrega de orden.
	 */
	@Override
	public void cancelOrder() {
		System.out.println("Tu orden ya fue preparada. No es posible cancelarla.");
	}

	/**
	 * Intenta preparar la orden de un cliente, pero el robot está en el estado entrega de orden.
	 */
	@Override
	public void prepareOrder() {
		System.out.println("La orden ya fue preparada y está en espera de ser entregada.");
	}

	/**
	 * Entrega una orden al cliente.
	 * Tambien muestra el recibo con los detalles de su compra.
	 * Al hacer la entrega, el robot pasa de estado "entrega de orden" a estado "dormido".
	 */
	@Override
	public void deliverOrder() {
		System.out.println("======= Entregando orden junto con tu ticket. =======");
		Order order = this.cesarinRobot.getCurrentOrder();
		Ticket ticket = order.generateTicket();

		System.out.println(ticket.toString());
		System.out.println("======= Orden entregada. Tenga un buen dia :) =======");
		this.cesarinRobot.setState(this.cesarinRobot.getSleepingState());
	}

	/**
	 * Imprime en terminal la descripcion del estado actual del robot.
	 */
    @Override
	public void description(){
        System.out.println("\n"+ "-----------ESTADO DEL ROBOT: <LISTO PARA ENTREGAR EL PEDIDO>-----------" + "\n");
    }
}
