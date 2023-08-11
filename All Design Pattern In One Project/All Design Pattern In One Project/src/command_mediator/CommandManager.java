package command_mediator;

public class CommandManager {

    private BaseCommand addCommand;
    private BaseCommand removeCommand;
    private Receiver receiver;

    private Mediator mediator;

    public CommandManager(Receiver receiver, MediatorInterface commandClient) {
        this.receiver = receiver;
        mediator = new Mediator(commandClient);
        addCommand = new AddCommand(receiver);
        removeCommand = new RemoveCommand(receiver);
    }


    public void add() {
        addCommand.execute();
        mediator.enableRemove();
    }

    public void remove() {
        removeCommand.execute();

        if (receiver.dataSet.isEmpty()) {
            mediator.disabledRemove();
        }
    }
}
