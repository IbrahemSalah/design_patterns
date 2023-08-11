package composite;

public class CompositeClient {

    public CompositeClient(){
        IComposite mouse = new CompositeLeaf();
        IComposite keyboard = new CompositeLeaf();
        IComposite headphones = new CompositeLeaf();


        IComposite CPU = new CompositeLeaf();
        IComposite GPU = new CompositeLeaf();

        CompositeComponent motherBoard = new CompositeComponent();
        motherBoard.addComposite(CPU);
        motherBoard.addComposite(GPU);

        CompositeComponent computer = new CompositeComponent();
        computer.addComposite(motherBoard);
        computer.addComposite(mouse);
        computer.addComposite(keyboard);
        computer.addComposite(headphones);

        System.out.println(computer.getPrice());
    }
}
