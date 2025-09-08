package myp.practica2.robot;

public interface RobotState {
    public void prepareOrder();
    public void takeOrder();
    public void cancelOrder();
    public void confirmOrder();
    public void deliverOrder();
}
