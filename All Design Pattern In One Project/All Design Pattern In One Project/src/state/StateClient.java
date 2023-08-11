package state;

public class StateClient {

    public StateClient(){
        StateManager stateManager = new StateManager();

        stateManager.execute();
        stateManager.execute();
    }
}
