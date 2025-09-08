package myp.practica2.robot;

public interface RobotState {

	void call();
	void takeOrder();
	void confirmOrder();
	void cancelOrder();
    void prepareOrder();
    void deliverOrder();
}
