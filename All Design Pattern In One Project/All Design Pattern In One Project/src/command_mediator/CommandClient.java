package command_mediator;

public class CommandClient implements MediatorInterface {

    Receiver receiver;
    CommandManager commandManager;

    boolean canRemove;

    public CommandClient() {
        receiver = new Receiver();
        commandManager = new CommandManager(receiver, this);

        commandManager.add();
        commandManager.remove();

        if (canRemove)
            commandManager.remove();
        else
            System.out.println("Disabled by mediator");
    }

    @Override
    public void setCanRemove(boolean state) {
        canRemove = state;
    }
}
