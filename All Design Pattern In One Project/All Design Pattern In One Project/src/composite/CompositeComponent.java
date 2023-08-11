package composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeComponent implements IComposite {
    int price;
    List<IComposite> compositeList;

    public CompositeComponent() {
        price = 5;
        compositeList = new ArrayList<>();
    }

    @Override
    public int getPrice() {
        int totalPrice = 0;

        totalPrice += price;

        for (IComposite composite : compositeList)
            totalPrice += composite.getPrice();

        return totalPrice;
    }

    public void addComposite(IComposite iComposite) {
        compositeList.add(iComposite);
    }

}
