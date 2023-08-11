package command_mediator;

public class RemoveCommand implements BaseCommand {

    Receiver receiver;

    public RemoveCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        System.out.println("Removed");
        receiver.remove();
    }
}
