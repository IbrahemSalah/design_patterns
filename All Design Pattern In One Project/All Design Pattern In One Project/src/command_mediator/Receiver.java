package command_mediator;

import java.util.ArrayList;
import java.util.List;

public class Receiver {

    List<String> dataSet;


    public Receiver() {
        dataSet = new ArrayList<>();
    }

    public void add() {
        dataSet.add("String");
    }

    public void remove() {
        dataSet.remove(0);
    }
}
