package command_mediator;

public class Mediator {

    MediatorInterface commandClient;

    public Mediator(MediatorInterface commandClient) {
        this.commandClient = commandClient;
    }

    public void disabledRemove() {
        commandClient.setCanRemove(false);
    }

    public void enableRemove() {
        commandClient.setCanRemove(true);
    }
}
