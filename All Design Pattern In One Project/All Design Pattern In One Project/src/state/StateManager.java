package state;

public class StateManager {

    BaseState currentState;


    public StateManager() {
        currentState = new OffState(this);
    }

    public void setDeviceState(BaseState currentState){
        this.currentState = currentState;
    }

    public void execute(){
        currentState.powerDevice();
    }
}
