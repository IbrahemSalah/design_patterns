package command_mediator;

public class AddCommand implements BaseCommand{
    Receiver receiver;

    public AddCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        System.out.println("Added");
        receiver.add();
    }
}
