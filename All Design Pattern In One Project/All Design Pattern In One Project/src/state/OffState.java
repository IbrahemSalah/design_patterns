package state;

public class OffState implements BaseState {
    StateManager stateManager;

    public OffState(StateManager stateManager) {
        this.stateManager = stateManager;
    }

    @Override
    public void powerDevice() {
        System.out.println("Device turned On!");
        stateManager.setDeviceState(new OnState(stateManager));
    }
}
