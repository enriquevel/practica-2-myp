package myp.practica2.robot;

public class Robot {

    private RobotState sleepingState;
    private RobotState orderState;
    private RobotState preparingState;
    private RobotState waitingState;

    public Robot() {
        sleepingState = new SleepingState(this);
        orderState = new SleepingState(this);
        preparingState = new PreparingState(this);
        waitingState = new WaitingState(this);
    }
    
    public RobotState getSleepingState() {
        return sleepingState;
    }

    public RobotState getOrderState() {
        return orderState;
    }

    public RobotState getPreparingState() {
        return preparingState;
    }

    public RobotState getWaitingState() {
        return waitingState;
    }
    
}
