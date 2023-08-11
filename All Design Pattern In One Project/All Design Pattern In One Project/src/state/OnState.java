package state;

public class OnState implements BaseState {

    StateManager stateManager;


    public OnState(StateManager stateManager) {
        this.stateManager = stateManager;
    }

    @Override
    public void powerDevice() {
        System.out.println("Device turned Off!");
        stateManager.setDeviceState(new OffState(stateManager));
    }
}
