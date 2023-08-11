package composite;


public class CompositeLeaf implements IComposite {
    int price;


    public CompositeLeaf() {
        price = 10;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
