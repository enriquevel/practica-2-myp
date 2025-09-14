package myp.practica2.robot;

/**
 * Interfaz que define el comportamiento del robot.
 */
public interface RobotState {

	/**
	 * Llama al robot para atender a un cliente.
	 */
	void call();

	/**
	 * Toma una orden de pizza.
	 */
	void takePizzaOrder();

	/**
	 * Toma una orden de helado.
	 */
	void takeIceCreamOrder();
	
	/**
	 * Confirma la orden del cliente.
	 */
	void confirmOrder();

	/**
	 * Cancela la orden del cliente.
	 */
	void cancelOrder();

	/**
	 * Prepara la orden del cliente.
	 */
    void prepareOrder();

	/**
	 * Entrega la orden al cliente.
	 */
    void deliverOrder();

	/**
	 * Imprime en terminal la descripcion del estado actual del robot.
	 */
	void description(); 

}
